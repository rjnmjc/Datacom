package exam

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

import internal.GlobalVariable

public class Datacom {

	@Keyword
	static void validate_Locations_Details(String loc, String add, String phone, String email) {
		String gmaploc = "Datacom";
		if(loc=="Auckland") {
			gmaploc = gmaploc + " " + loc
			loc="0"
			WebUI.click(findTestObject("Object Repository/Datacom/NZ locations details/Location",["index" : loc]), FailureHandling.CONTINUE_ON_FAILURE)
		}else if(loc=="Christchurch") {
			gmaploc = gmaploc + " " + loc
			loc="1"
		}else if(loc=="Dunedin") {
			gmaploc = gmaploc + " " + loc
			loc="2"
		}else if(loc=="Hamilton") {
			gmaploc = gmaploc + " " + loc
			loc="3"
		}else if(loc=="Hastings") {
			loc="4"
		}else if(loc=="Nelson") {
			gmaploc = gmaploc + " " + loc
			loc="5"
		}else if(loc=="New Plymouth") {
			gmaploc = gmaploc + " " + loc
			loc="6"
		}else if(loc=="Rotorua") {
			gmaploc = gmaploc + " " + loc
			loc="7"
		}else if(loc=="Tauranga") {
			gmaploc = gmaploc + " " + loc
			loc="8"
		}else if(loc=="Wellington") {
			gmaploc = gmaploc + " " + loc
			loc="9"
		}

		WebUI.click(findTestObject("Object Repository/Datacom/NZ locations details/Location",["index" : loc]), FailureHandling.CONTINUE_ON_FAILURE)

		//validate details
		WebUI.verifyElementText(findTestObject("Object Repository/Datacom/NZ locations details/Address",["index" : loc]), add, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyElementText(findTestObject("Object Repository/Datacom/NZ locations details/Phone",["index" : loc]), phone, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyElementText(findTestObject("Object Repository/Datacom/NZ locations details/Email",["index" : loc]), email, FailureHandling.CONTINUE_ON_FAILURE)
		//validate icons
		WebUI.verifyElementVisible(findTestObject("Object Repository/Datacom/NZ locations details/icons/address",["index" : loc]), FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyElementVisible(findTestObject("Object Repository/Datacom/NZ locations details/icons/phone",["index" : loc]), FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyElementVisible(findTestObject("Object Repository/Datacom/NZ locations details/icons/email",["index" : loc]), FailureHandling.CONTINUE_ON_FAILURE)
		//validate redirections
		WebUI.click(findTestObject("Object Repository/Datacom/NZ locations details/Redirection",["index" : loc]), FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyElementText(findTestObject("Object Repository/Datacom/gmap location"), gmaploc, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.back(FailureHandling.CONTINUE_ON_FAILURE)
		//		//validate gmap
		//		WebUI.switchToFrame(findTestObject('Object Repository/Datacom/map'), 10, FailureHandling.CONTINUE_ON_FAILURE)
		//		WebUI.click(findTestObject("Object Repository/Datacom/zoom in"), FailureHandling.CONTINUE_ON_FAILURE)

	}
}
