package stepDefinition

import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.But
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When


public class AddProduct {
	//Background
	@Given("the user is logged in as a seller")
	def the_seller_is_logged_in() {
		Mobile.startApplication('Apk/app-release-second-hand-gcp.apk', true)
		Mobile.callTestCase(findTestCase('Step Definition/Precondition/Precondition - Login Seller'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	//Positive case
	@Given("the seller is on Add Product Page")
	def the_seller_is_on_Add_Product_Page() {
		Mobile.delay(2)
		Mobile.callTestCase(findTestCase('Pages/Home/Tap Add Product button'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("the seller inputs {string}, {string}, {string}, {string}, and {string}")
	def the_seller_inputs(String product_name, String product_price, String category, String location, String description) {
		Mobile.callTestCase(findTestCase('Pages/Add Product/Input mandatory fields'), [('product_name') : product_name, ('product_price') : product_price
			, ('category') : category, ('location') : location, ('description') : description], FailureHandling.STOP_ON_FAILURE)
	}

	@When("the seller inputs all the mandatory fields")
	def the_seller_inputs() {
		Mobile.callTestCase(findTestCase('Pages/Add Product/Input mandatory fields'), [('product_name') : "Book", ('product_price') : '100000'
			, ('category') : "Hobi dan Koleksi", ('location') : "Jakarta", ('description') : "New book, 100 pages"], FailureHandling.STOP_ON_FAILURE)
	}

	@When("the seller uploads a photo from camera")
	def the_seller_uploads_a_photo_from_camera() {
		WebUI.callTestCase(findTestCase('Pages/Add Product/Upload product image from camera emulator'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("the seller taps publish button")
	def the_seller_clicks_submit_button() {
		WebUI.callTestCase(findTestCase('Pages/Add Product/Tap publish button'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("the product is added to my listings")
	def the_page_navigates_to_the_product_page() {
		Mobile.delay(1)
	}

}
