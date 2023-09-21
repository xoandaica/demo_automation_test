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

WebUI.setText(findTestObject('Object Repository/Page_VNPT IOT System/input_Email hoc tn ng nhp_email (4)'), 'createacc')

WebUI.click(findTestObject('Object Repository/Page_VNPT IOT System/a_Tm kim (16) (4)'))

WebUI.click(findTestObject('Object Repository/Page_VNPT IOT System/i_refresh'))

WebUI.click(findTestObject('Object Repository/Page_VNPT IOT System/button_ng (12)'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_VNPT IOT System/div_Mt khu mi  c gi ti email ca ngi dng cp di'), 
    'Mật khẩu mới đã được gửi tới email của người dùng cấp dưới.')

WebUI.navigateToUrl('https://mail.vnpt-technology.vn/owa/auth/logon.aspx?replaceCurrent=1&url=https%3a%2f%2fmail.vnpt-technology.vn%2fowa%2f')

WebUI.setText(findTestObject('Object Repository/Page_Outlook/input_Show password_username'), 'thanhnm')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Outlook/input_Show password_password'), '+r4LffXLh27bkmClAmeWcA==')

WebUI.click(findTestObject('Object Repository/Page_Outlook/span_sign in'))

WebUI.click(findTestObject('Object Repository/Page_Th - thanhnmvnpt-technology.vn/span_H Thng Qun L Thu Bao M2M SIM'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Th - thanhnmvnpt-technology.vn/p_Ti khon h thng qun l thu bao M2M ca bn va_bf7bb0'), 
    'Tài khoản hệ thống quản lý thuê bao M2M của bạn vừa được Admin thực hiện reset.')

WebUI.closeBrowser()

