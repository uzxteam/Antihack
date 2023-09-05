<img src="metadata/uz/1.png" style="max-width: 100%; display: inline-block;" data-target="animated-image.originalImage">
<img src="metadata/uz/2.png" style="max-width: 100%; display: inline-block;" data-target="animated-image.originalImage">
<img src="metadata/uz/3.png" style="max-width: 100%; display: inline-block;" data-target="animated-image.originalImage">
<img src="metadata/uz/4.png" style="max-width: 100%; display: inline-block;" data-target="animated-image.originalImage">
<h1 align="center">AntiHack </h1>
<h3 align="center">AntiHack - for your security.</h3>


Hacking are not blocked when on mobile data connection!
AdAway will not work reliably when on Mobile Networks like 3G. You can deactivate that proxy by going to your selected APN (On Android 4: Wireless and networks -> More… -> Mobile Networks -> Access Point Names) and remove the value in the proxy field.

Hacking in Chrome are not blocked!
Disable Chrome’s Data Compression Proxy.

Advertisements in Application XYZ are not blocked!
Follow this guide to find the corresponding hostnames and how to report them.

Application XYZ stopped working!
See this list of problematic apps for a workaround. If your app is not included fill a bug report and hope for help.

Back button in Android’s Browser stopped working!
Enable the local Webserver in AdAway’s preferences as a workaround.

Are there more hosts sources that can be used?
More Hosts sources can be found on the Wiki on Github.

Redirection Lists for blocked domains in China
Add Redirection Lists to your Hosts Sources to redirect blocked DNS requests to the correct IPs in China. This hosts source contains redirection rules for Google, Facebook, and other. (You need to enable “Allow redirection rules from Hosts Sources” in preferences).

More information?

<h3 align="left">Connect with me: https://t.me/mamurof</h3>
# Contributing to Antihack

:+1::tada: First off, thanks for taking the time to contribute! :tada::+1:

The following is a set of guidelines for contributing to Antihack.
These are mostly guidelines, not rules.
It will help you to understand the projet, find answers, deal with the source code and interact with maitainers.
The project is open to any kind of contribution so feel free to share your ideas and participate to the development.

#### Table of contents

[I don't want to read this whole thing, I just have a question!!!](#i-dont-want-to-read-this-whole-thing-i-just-have-a-question)

[What should I know before I get started?](#what-should-i-know-before-i-get-started)
* [Discovering the project structure](#discovering-the-project-structure)
* [Building the project](#building-the-project)

[How can I contribute?](#how-can-i-contribute)
* [Reporting bugs](#reporting-bugs)
* [Suggesting enhancements](#suggesting-enhancements)
* [Translating to your language](#translating-to-your-language)
* [Your first code contribution](#your-first-code-contribution)

[Styleguides](#styleguides)
* [Git commit messages](#git-commit-messages)
* [Java styleguide](#java-styleguide)
* [XML styleguide](#xml-styleguide)

[Additional notes](#additional-notes)
* [tcpdump and webserver modules](#tcpdump-and-webserver-modules)

## I don't want to read this whole thing I just have a question!!!

> **Note:** Please don't file an issue to ask a question. You'll get faster results by using the resources below.



## What should I know before I get started?

### Discovering the project structure

AdAdawy source code is an Android project organized in modules.
There are four main modules:
* `app`: The Android application itself
* `tcpdump`: A module dedicated to build `pcap` library and `tcpdump` binary
* `webserver`: A module dedicated to build a simple HTTP server binary based on `mongoose`
* `libraries/RootCommands`: A vendorize Android library to run root shell commands

The three last modules are independant and used by the `app` module.
Modalirazing the application allow faster build time and simplier maintainance.

### Building the project

Building the project will require the latest versions of Android SDK (Software Development Kit) and NDK (Native Development kit).
They can easily be installed or updated using [Android Studio](https://developer.android.com/studio/).

#### Building with Gradle
1. Ensure you have Android SDK and NDK installed.
If not:
    * Option 1: [Install Android Studio](https://developer.android.com/studio/index.html) or,
    * Option 2: Install command line tools and install build tools and ndk bundle with sdk manager:  
    `tools/bin/sdkmanager "build-tools;x.y.z" ndk-bundle` where `x.y.z` is the latest version
2. Export `ANDROID_HOME` environment variable pointing to your Android SDK:  
`export ANDROID_HOME=/path/to/your/sdk`
3. Launch a build:  
`./gradlew assembleRelease`

The first full build of the apk could take a lot of time, about 20 minutes, whereas an incremental build of the `app` module takes less than a dozen of seconds.


## How can I contribute?

### Reporting bugs

> **Note:** Before submitting a bug report, please use [the GitHub search on Issues page](https://github.com/uzxteam/Antihack/issues) to check if there is already similar reports.

#### How do I submit a (good) bug report?

* **Use a clear and descriptive title** for the issue to identify the problem.
* **Describe the exact steps which reproduce the problem** in as many details as possible.
* **Provide specific examples to demonstrate the steps**.
Include hosts sources or domains you use, web pages URL you test.
* **Describe the behavior you observed after following the steps** and point out what exactly is the problem with that behavior.
* **Explain which behavior you expected to see instead and why.**
* **If you're reporting that Antihack crashed**, include a logcat.
Use `adb logcat` if you have developer settings enabled on your device or use any application like [CatLog](https://play.google.com/store/apps/details?id=com.nolanlawson.logcat) to save logs.
Include the crash report in the issue in a [code block](https://help.github.com/articles/markdown-basics/#multiple-lines), a [file attachment](https://help.github.com/articles/file-attachments-on-issues-and-pull-requests/), or put it in a [gist](https://gist.github.com/) and provide link to that gist.
* **Specify which version of Antihack you're using.**
You can get the exact version by opening in-app help and checking the last _About_ tab.
* **Specify the Android version and the ROM you're using.**
You can also include any root or customization related information like _Magisk_ or _SuperSU_ version and _Xposed_ modules is installed.


### Suggesting enhancements

#### How do I submit a (good) enhancement suggestion?

Enhancement suggestions are welcome.
After refining your idea or discussing it on [development forum](https://forum.xda-developers.com/showthread.php?t=2190753), create an issue and provide the following information:

* **Use a clear and descriptive title** for the issue to identify the suggestion.
* **Provide a step-by-step description of the suggested enhancement** in as many details as possible, including specific examples.
* **Describe the current behavior** and **explain which behavior you expected to see instead** and why.
* **Explain why this enhancement would be useful** to most users.

### Translating to your language

Translations are also welcome.
Moreover, they do not require a development environment, only a web browser.
So if you want to complete or edit your language support for the application, check [the translation guide](TRANSLATING.md).

### Your first code contribution

Unsure where to begin contributing?
 You can start by looking through these `good first issue` and `help wanted` issues:

* [Good first issues](https://github.com/uzxtean/Antihack/issues?q=is%3Aopen+is%3Aissue+label%3A%22good+first+issue%22) - issues which should only require a few lines of code, and a test or two.
* [Help wanted issues](https://github.com/uzxteam/Antihack/issues?q=is%3Aopen+is%3Aissue+label%3A%22help+wanted%22) - issues which should be a bit more involved than `beginner` issues.

Both issue lists are sorted by total number of comments. While not perfect, number of comments is a reasonable proxy for impact a given change will have.

## Styleguides

### Git commit messages

* Use the present tense ("Add feature" not "Added feature")
* Use the imperative mood ("Move cursor to..." not "Moves cursor to...")
* Limit the first line to 80 characters or less
* Reference issues and pull requests liberally after the first line

### Java styleguide
* Indentation: 4 spaces, no tabs
* Maximum line width for code and comments: 100
* Opening braces don't go on their own line
* Field names: Non-public, non-static fields start with m.
* Acronyms are words: Treat acronyms as words in names, yielding !XmlHttpRequest, getUrl(), etc.

See https://source.android.com/source/code-style.html

### XML styleguide
* No maximum line width
* Split multiple attributes each on a new line 
* Indent using spaces with Indention size 4

## Additional notes

### `tcpdump` and `webserver` modules

#### Origin

Forked from the following sources and slightly modified to compile:

* dnsmasq: https://github.com/CyanogenMod/android_external_dnsmasq
* libpcap: https://github.com/the-tcpdump-group/libpcap/tree/libpcap-1.7.4
* tcpdump: https://github.com/the-tcpdump-group/tcpdump/tree/tcpdump-4.7.4

#### Changes






