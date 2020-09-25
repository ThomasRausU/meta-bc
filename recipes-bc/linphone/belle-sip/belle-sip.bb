require belle-sip.inc

PR = "${INC_PR}.0"

python () {
    if d.getVar('LATEST_REVISIONS', True) == "1":
        d.setVar('SRCREV', '${AUTOREV}')
    else:
        d.setVar('SRCREV', 'd8c5e9e08b3bd6640898e46850333f1ad900c8d2')
}

# For visualisation
python () {
    print("")
    print("belle-sip")
    print(d.getVar('SRCREV', True))
}

#SRCREV = "c840e2192b2d0151cc895b844e44bfe0d2103fcf"
SRC_URI = "git://gitlab.linphone.org/BC/public/belle-sip.git;protocol=https"
PV = "git_${SRCREV}"

LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=ff3103b5db8ba4e2c66c511b7a73e407;rev={SRCREV}"


