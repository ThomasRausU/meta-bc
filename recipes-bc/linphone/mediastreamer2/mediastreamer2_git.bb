require mediastreamer2.inc

inherit gitpkgv

PR = "${INC_PR}.0"

python () {
    if d.getVar('LATEST_REVISIONS', True) == "1":
        d.setVar('SRCREV', '${AUTOREV}')
    else:
        d.setVar('SRCREV', '0a2143130e90fe6ef35129931b3fd98d40daa195')
}

# For visualisation
python () {
    print("")
    print("mediastreamer2")
    print(d.getVar('SRCREV', True))
}

SRC_URI = "git://gitlab.linphone.org/BC/public/mediastreamer2.git;protocol=https"
PV = "git_${SRCREV}"
PKGV = "${GITPKGVTAG}"

LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=ff3103b5db8ba4e2c66c511b7a73e407"
