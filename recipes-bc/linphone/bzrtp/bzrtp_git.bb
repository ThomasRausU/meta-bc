require bzrtp.inc

PR = "${INC_PR}.0"

python () {
    if d.getVar('LATEST_REVISIONS', True) == "1":
        d.setVar('SRCREV', '${AUTOREV}')
    else:
        d.setVar('SRCREV', '1ab274fa74f889769a656a7650f7aca5ea48679c')
}

# For visualisation
python () {
    print("")
    print("bzrtp")
    print(d.getVar('SRCREV', True))
}

#SRCREV = "37adaa0536432149a51332d8eb04973a3ba6bac9"
SRC_URI = "git://gitlab.linphone.org/BC/public/bzrtp.git;protocol=https"
PV = "git_${SRCREV}"

LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=ff3103b5db8ba4e2c66c511b7a73e407"
