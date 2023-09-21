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

WebUI.callTestCase(findTestCase('Open Web'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_VNPT IOT System/input_Power by VinaPhone_username (2)'), 'createacc')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_VNPT IOT System/input_Power by VinaPhone_password (2)'), 'FGqGPohAJxNfiZg7R0wNoQ==')

WebUI.click(findTestObject('Object Repository/Page_VNPT IOT System/input_Power by VinaPhone_login (2)'))

WebUI.click(findTestObject('Object Repository/Page_VNPT IOT System/a_createacc'))

WebUI.click(findTestObject('Object Repository/Page_VNPT IOT System/a_Thot'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_VNPT IOT System/input_Power by VinaPhone_username (2)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_VNPT IOT System/input_Power by VinaPhone_password (2)'), 
    0)

