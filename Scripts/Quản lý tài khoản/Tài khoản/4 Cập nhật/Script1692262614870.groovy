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

WebUI.callTestCase(findTestCase('Quản lý tài khoản/Tài khoản/Xem danh sách'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_VNPT IOT System/input_Email hoc tn ng nhp_email (1) (1)'), 'createacc')

WebUI.click(findTestObject('Object Repository/Page_VNPT IOT System/a_Tm kim (16) (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_VNPT IOT System/i_ (4) (1)'))

WebUI.click(findTestObject('Object Repository/Page_VNPT IOT System/a_Cp nht (2)'))

WebUI.setText(findTestObject('Object Repository/Page_VNPT IOT System/input_S in thoi_user.phone'), '046378431')

WebUI.click(findTestObject('Object Repository/Page_VNPT IOT System/a_Lu (6)'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_VNPT IOT System/div_Cp nht thnh cng'), 'Cập nhật thành công!')

WebUI.closeBrowser()

