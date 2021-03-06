DESCRIPTION = "SIP stack from Belledonne Communications"
LICENSE = "GPLv2"
HOMEPAGE = "http://www.linphone.org/technical-corner/belle-sip/overview"
SECTION = "libs/network"

INC_PR = "r0"

DEPENDS = "libantlr3c-bc bctoolbox zlib"
PROVIDES = "libbellesip"
S = "${WORKDIR}/git"


inherit  pkgconfig cmake gettext


EXTRA_OECMAKE += " -DENABLE_STRICT=NO -DCMAKE_SKIP_INSTALL_RPATH=ON"
EXTRA_OECMAKE += "-DJava_JAVA_EXECUTABLE=${JAVA_HOME}/bin/java"
EXTRA_OECMAKE += "-DCMAKE_INSTALL_DATAROOTDIR=share -DCMAKE_INSTALL_LIBDIR=lib"
ANTLR_CFLAGS += " -I ${STAGING_DIR_HOST}/usr/include"
ANTLR_LIBS += " -L ${STAGING_DIR_HOST}/usr/lib"
CFLAGS += " ${ANTLR_CFLAGS} ${ANTLR_LIBS} -lantlr3c"

INSANE_SKIP_${PN} += "dev-deps"


FILES_${PN}-dev = " \
    ${includedir} \
    ${libdir}/lib*.so \
    ${libdir}/pkgconfig \
    ${libdir}/*.a \
    ${prefix}/share/BelleSIP"





