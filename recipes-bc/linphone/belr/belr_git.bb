require belr.inc

PR = "${INC_PR}.0"

python () {
    if d.getVar('LATEST_REVISIONS', True) == "1":
        d.setVar('SRCREV', '${AUTOREV}')
    else:
        d.setVar('SRCREV', 'fdce52526089e88c98f19b0d36483cc3d31ef9bd')
}

# For visualisation
python () {
    print("")
    print("belr")
    print(d.getVar('SRCREV', True))
}

#SRCREV = "4f32b9c29c4ab8c4ccfc1e0899019a811d495054"
SRC_URI = "git://gitlab.linphone.org/BC/public/belr.git;protocol=https"
PV = "git_${SRCREV}"

LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=ff3103b5db8ba4e2c66c511b7a73e407"
