DESCRIPTION = "CodeSynthesis XSD is an open-source, cross-platform W3C XML Schema to C++ data binding compiler"
LICENSE = "GPLv2"
HOMEPAGE = "https://www.codesynthesis.com/products/xsd/"
SECTION = "libs"

S = "${WORKDIR}/git"

inherit cmake

python () {
    if d.getVar('LATEST_REVISIONS', True) == "1":
#        d.setVar('SRCREV', '${AUTOREV}')
        d.setVar('SRCREV', 'e122ca1f3546ad3bd6c9e3e80391a92d76d6cd89')
    else:
        d.setVar('SRCREV', 'e122ca1f3546ad3bd6c9e3e80391a92d76d6cd89')
}

SRC_URI = "git://github.com/ThomasRausU/linphone-libxsd.git;protocol=https;branch=thia/master"


LIC_FILES_CHKSUM = "file://LICENSE;md5=79e31466c4d9f3a85f2f987c11ebcd83"

