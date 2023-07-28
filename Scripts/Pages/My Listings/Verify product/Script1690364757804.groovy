import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import java.text.DecimalFormat as DecimalFormat

Mobile.verifyElementVisible(findTestObject('Page_My Listings/SubPage_All Products/text_product_name'), 0)

actual_name = Mobile.getText(findTestObject('Page_My Listings/SubPage_All Products/text_product_name'), 0)

Mobile.verifyMatch(actual_name, expected_name, false)

Mobile.verifyElementVisible(findTestObject('Page_My Listings/SubPage_All Products/text_product_price'), 0)

actual_price = Mobile.getText(findTestObject('Page_My Listings/SubPage_All Products/text_product_price'), 0)

String coba = '100000'

double double_price = Double.valueOf(coba)

DecimalFormat formatter = new DecimalFormat('###,###')

expected_price = ('Rp' + formatter.format(double_price))

Mobile.verifyMatch(actual_price, expected_price, false)

Mobile.verifyElementVisible(findTestObject('Page_My Listings/SubPage_All Products/text_category'), 0)

actual_category = Mobile.getText(findTestObject('Page_My Listings/SubPage_All Products/text_category'), 0)

Mobile.verifyMatch(actual_category, expected_category, false)

