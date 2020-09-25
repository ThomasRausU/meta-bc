PR = "r3"
SRC_URI = "gitsm://gitlab.linphone.org/BC/public/mswebrtc.git;protocol=https"
#		   file://configure_MEDIASTREAMER.patch

python () {
    if d.getVar('LATEST_REVISIONS', True) == "1":
        d.setVar('SRCREV', '${AUTOREV}')
    else:
        d.setVar('SRCREV', '9c8f7fe88cf3f083253ee5320955f1e6e038dc8d')
}

# For visualisation
python () {
    print("")
    print("mswebrtc")
    print(d.getVar('SRCREV', True))
}

S = "${WORKDIR}/git"

require mswebrtc-common.inc
