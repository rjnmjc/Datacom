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
import exam.Datacom

WebUI.openBrowser("https://datacom.com/nz/en/contact-us", FailureHandling.CONTINUE_ON_FAILURE)

WebUI.maximizeWindow(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.scrollToElement(findTestObject("Object Repository/Datacom/Our Location"), 3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject("Object Repository/Datacom/New Zealand tab"), FailureHandling.CONTINUE_ON_FAILURE)

Datacom.validate_Locations_Details("Auckland","58 Gaunt Street, Auckland CBD, Auckland 1010", "+64 9 303 1489", "reception.gaunt@datacom.co.nz")

Datacom.validate_Locations_Details("Christchurch","67 Gloucester Street, Christchurch 8013", "+64 3 379 7775", "reception.christchurch@datacom.co.nz")

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)