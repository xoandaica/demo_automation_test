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

WebUI.callTestCase(findTestCase('dang_nhap_admin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_VNPT IOT System/a_16886 (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_VNPT IOT System/i_HNIDD00800307_uk-icon-angle-double-left (1)'))

WebUI.click(findTestObject('Object Repository/Page_VNPT IOT System/ins_PTY034-99_iCheck-helper (1)'))

WebUI.click(findTestObject('Object Repository/Page_VNPT IOT System/ins_Ngy sinh khch hng_iCheck-helper (3) (1)'))

WebUI.click(findTestObject('Object Repository/Page_VNPT IOT System/ins_PTY034-99_iCheck-helper_1 (1)'))

WebUI.click(findTestObject('Object Repository/Page_VNPT IOT System/button_Xa (2) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_VNPT IOT System/button_ng (20)'))

WebUI.closeBrowser()

