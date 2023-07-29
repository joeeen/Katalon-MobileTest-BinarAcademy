<a name="readme-top"></a>
# Secondhand Mobile App Project with Katalon
## Introduction
Secondhand Mobile App is an e-commerce online platform that allows users to buy and sell secondhand items. This repository provides an example of automated testing for the Secondhand Mobile App using BDD approach with Cucumber, Katalon Studio, Appium, and Android Emulator.

## Prerequisites
This project requires the following:
1. **Java Developer Kit (JDK)**
   - JDK version 8 or above is required to support Katalon Studio.
   - I recommend using Java v20.0.2 for compatibility.
   - If you haven't installed it yet, you can download it from [here](https://www.oracle.com/id/java/technologies/downloads/).
2. **Katalon Studio**
   - Katalon Studio 8.6.5 is recommended.
   - You can find the installation guide <a href="https://docs.katalon.com/docs/get-started/katalon-studio-installation/install-katalon-studio-on-macoswindows">here</a>.
4. **Appium**
   - Currently, Katalon Studio 8.6.5 does not support Appium v2.
   - I recommend using Appium v1.22.2.
   - To install Appium using npm, you can run the following command:
     ```
     npm install -g appium@1.22.2
     ```
6. **Android Emulator**
   - For testing, I use the Android Studio Pixel 6 Pro emulator with Android 14 (API level 34).
   - If you haven't installed Android Studio, you can download [here](https://developer.android.com/studio).
   - If you use a different device or emulator, adjustments might be required for the Camera Test Object in the Object Repository.

## Getting Started

1. Open Katalon Studio
2. Clone git project
   - Repository URL: `https://github.com/joeeen/Katalon-MobileTest-BinarAcademy.git`
   - Fill in the Authentication datas (optional)
   - Select main branch
   - Adjust the destination directory
   - Click finish
3. Setup the Appium directory
<br> Window > Katalon Studio Preferences > Katalon > Mobile > Appium directory

4. Setup the Android Emulator
<br> Remember to adjust the camera test object within the "Upload photo from camera emulator" step if you're using different device or emulator.

## Running Tests
After you've set up everything, you can run the tests
### To run test suite
Execute `Test Suites/Smoke test`
     <br>Report will be found in the `Reports` folder
### To run spesific feature files
1. Open `Include/scripts/groovy/(default package)/Runner.groovy`
   <br> Input the spesific feature file or tags you want to run
2. Execute `Test Cases/Cucumber/Runner`
   <br> Report will be found in `Reports/Cucumber`

<p align="right"><a href="#readme-top">back to top</a></p>

## Demo
### Test suite one flow
<img src="https://github.com/joeeen/KatalonMobile-BinarAcademy/assets/118897487/888ae7b6-2e23-4fb2-832c-00e7e27060c1" width=30% height=30%>

<p align="right"><a href="#readme-top">back to top</a></p>

## Report
### HTML report from test suite sample
<img src="https://github.com/joeeen/KatalonMobile-BinarAcademy/assets/118897487/3f39d5f8-ee8e-4b78-895b-a3e489abad24" width=99% height=99%>

### Cucumber HTML report sample
<img src="https://github.com/joeeen/KatalonMobile-BinarAcademy/assets/118897487/16612e22-e9a4-430b-b1db-9427a3381f67" width=70% height=70%>

<p align="right"><a href="#readme-top">back to top</a></p>
