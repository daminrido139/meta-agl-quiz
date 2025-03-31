# Project Structure

```
meta-agl-quiz
│
├── conf
│   ├── files
│   │   └── packages.inc     # Packages to be installed on the image
│   └── layer.conf           # Yocto layer configuration
├── recipes-sdk
│   └── agl_quiz
│       ├── files
│       │   ├── agl-app-flutter@agl_quiz.service  # Systemd service file for launching the app
│       │   └── agl_quiz.toml                     # Configuration for the Flutter app window
│ 	└── agl_quiz_git.bb         # BitBake recipe for the Flutter app
├── COPYING.MIT
└── README
```
