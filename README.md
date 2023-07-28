<a name="readme-top"></a>
# Secondhand Mobile App Project with Katalon
## Introduction
Secondhand Mobile App is an e-commerce online platform that allows users to buy and sell secondhand items. This document will guide you through the necessary steps to set up the testing environment and run tests using Katalon Studio.
This repository provides an example of automated testing for the Secondhand Mobile App using BDD.

## Prerequisites
This project requires the following:
<li><strong>Java Developer Kit (JDK)</strong><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;JDK v8 or above to support Katalon Studio. I use java v20.0.2.</li>
<li><strong>Katalon Studio</strong><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;On this project, I use Katalon Studio 8.6.5. Installation guide <a href="https://docs.katalon.com/docs/get-started/katalon-studio-installation/install-katalon-studio-on-macoswindows">here</a>. </li>

<li><strong>Appium</strong><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Katalon Studio 8.6.5 doesn't support Appium v@2 yet. I use appium v1.22.2.</li>
  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; To install appium using npm, try running `npm install -g appium@1.22.2 `
<li><strong>Android Emulator</strong><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;I use Android Studio Pixel 6 Pro emulator with Android 14 (API level 34).</li>

https://www.oracle.com/id/java/technologies/downloads/

## Getting Started

1. Make sure Ruby is installed on your system. If not, you can download and install it from <a href="https://www.ruby-lang.org/en/documentation/installation/">here</a>.
2. Install Bundler by running `gem install bundler`
3. Clone the repository.
   ```
   git clone https://github.com/joeeen/KatalonMobile-BinarAcademy
   ```
5. Open Katalon Studio
6. Setup android emulator
   Using another device on emulator makes photo camera
8. 
Apk is 

## Running Tests
After you've set up everything, you can run the tests
### To run test suite for smoke testing
Execute `cucumber` command from the root of your project directory.
This generates report

### To run spesific feature file
Execute `cucumber features/file_name.feature` command

<p align="right"><a href="#readme-top">back to top</a></p>

## Demo

### Add Product


### Update product quantity


<p align="right"><a href="#readme-top">back to top</a></p>

## Run results


## Report
### HTML report from test suite
![image](https://github.com/joeeen/KatalonMobile-BinarAcademy/assets/118897487/3f39d5f8-ee8e-4b78-895b-a3e489abad24)
### Cucumber HTML report
![image](https://github.com/joeeen/KatalonMobile-BinarAcademy/assets/118897487/16612e22-e9a4-430b-b1db-9427a3381f67)


<p align="right"><a href="#readme-top">back to top</a></p>
