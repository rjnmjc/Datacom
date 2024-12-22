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

WebUI.openBrowser("https://datacom.com/nz/en/contact-us", FailureHandling.CONTINUE_ON_FAILURE)

WebUI.maximizeWindow(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.scrollToElement(findTestObject("Object Repository/Datacom/Our Location"), 3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject("Object Repository/Datacom/New Zealand tab"), FailureHandling.CONTINUE_ON_FAILURE)

//validate all locations under New Zealand
for(int x = 0; x<9; x++) {
	String[] locations = ["Auckland", "Christchurch", "Dunedin", "Hamilton", "Hastings", "Nelson", "New Plymouth", "Rotorua", "Tauranga", "Wellington"]
	if(locations[x]=="New Plymouth") {
		WebUI.scrollToElement(findTestObject("Object Repository/Datacom/NZ locations details/Location",["index" : 9]), 3, FailureHandling.CONTINUE_ON_FAILURE)
	}
	WebUI.verifyElementText(findTestObject("Object Repository/Datacom/NZ locations details/Location",["index" : x]), locations[x], FailureHandling.CONTINUE_ON_FAILURE)
	print locations[x]
}

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)