PN = "agl_quiz"
SUMMARY = "Flutter AGL Quiz Application"
DESCRIPTION = "A Flutter based IVI Application that displays my name and shows an image on button click"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2e7f3427ab08fda49476f7eec09fe84c"

SRC_URI = "git://github.com/daminrido139/agl-quiz.git;branch=main;protocol=https \
           file://agl-app-flutter@agl_quiz.service \
           file://agl_quiz.toml \
           "

SRCREV = "36b40b12282f598cf54a6d69febeee8e2da2bcf0"
S = "${WORKDIR}/git"

inherit flutter-app

# flutter-app parameters
PUBSPEC_APPNAME = "agl_quiz"
PUBSPEC_IGNORE_LOCKFILE = "1"
FLUTTER_BUILD_ARGS = "bundle -v"


do_install:append() {
    install -D -m 0644 ${WORKDIR}/agl-app-flutter@agl_quiz.service ${D}${systemd_system_unitdir}/agl-app-flutter@agl_quiz.service
}


do_compile[network] = "1"
