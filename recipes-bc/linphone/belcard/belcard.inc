DESCRIPTION = "Belcard is a C++ library to manipulate VCard standard format"
LICENSE = "GPLv2"
HOMEPAGE = "http://www.linphone.org/"
SECTION = "libs/network"

INC_PR = "r0"
DEPENDS = "libbelr"
EXTRA_OECMAKE += " -DCMAKE_SKIP_INSTALL_RPATH=ON "
EXTRA_OECMAKE += "-DCMAKE_INSTALL_DATAROOTDIR=share -DCMAKE_INSTALL_LIBDIR=lib"
PROVIDES = "libbelcard"
S = "${WORKDIR}/git"

inherit cmake

FILES_${PN}-dev = " \
    ${includedir} \
    ${libdir}/lib*.so \
    ${libdir}/*.a \
    ${prefix}/share/Belcard \
    ${prefix}/share/belcard_tester \
    ${prefix}/share/belcard_tester/vcards \
    ${prefix}/share/belcard_tester/vcards/foldtest.vcf \
    ${prefix}/share/belcard_tester/vcards/unfoldtest.vcf \
    ${prefix}/share/belcard_tester/vcards/vcard.vcf \
    ${prefix}/share/belcard_tester/vcards/vcards.vcf"

