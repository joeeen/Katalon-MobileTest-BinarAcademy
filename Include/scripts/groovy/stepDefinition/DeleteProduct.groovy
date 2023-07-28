package stepDefinition

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import cucumber.api.java.en.But
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import internal.GlobalVariable

public class DeleteProduct {
	@Given("the seller adds a new product")
	def the_seller_adds_a_new_product() {
		Mobile.callTestCase(findTestCase('Step Definition/Precondition/Precondition - Add Product'), [:], FailureHandling.STOP_ON_FAILURE)
		Mobile.delay(10)
	}

	@When("the seller deletes the product")
	def the_seller_deletes_the_product() {
		Mobile.callTestCase(findTestCase('Pages/My Listings/Delete Product'), [:], FailureHandling.STOP_ON_FAILURE)
	};

	@Then("the product is deleted")
	def the_product_is_deleted() {
		Mobile.callTestCase(findTestCase('Pages/My Listings/Read pop up message'), [('expected') : 'Produk berhasil dihapus'], FailureHandling.STOP_ON_FAILURE)
	}
}
