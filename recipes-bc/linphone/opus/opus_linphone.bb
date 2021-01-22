require opus.inc

PR = "${INC_PR}.0"

python () {
    if d.getVar('LATEST_REVISIONS', True) == "1":
        d.setVar('SRCREV', '${AUTOREV}')
    else:
        d.setVar('SRCREV', '35b371a85bf2cf21ab4b12b5475c76a2775b25d1')
}
SRC_URI = "git://gitlab.linphone.org/BC/public/external/opus.git;protocol=https;branch=bc"
PV = "git_${SRCREV}"

LIC_FILES_CHKSUM= "file://COPYING;md5=e304cdf74c2a1b0a33a5084c128a23a3"