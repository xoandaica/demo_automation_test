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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://testbed.oneiot.com.vn:8000/')

WebUI.setText(findTestObject('Page_Login/input_Email'), emailName)

WebUI.setText(findTestObject('Page_Login/input_MatKhau_password'), passwordTenant)

WebUI.delay(3)

WebUI.click(findTestObject('Page_Login/button_DangNhap'))

WebUI.delay(3)

WebUI.maximizeWindow()

WebUI.refresh()

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('QUẢN TRỊ HỆ THỐNG', 'ADMINISTRATION', findTestObject(
        'Page_Dashboard/QTHT'))

//WebUI.click(findTestObject('Object Repository/Page_Dashboard/a__sSwitch_primary'), FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Page_Dashboard/span_Tenants'))

WebUI.setText(findTestObject('Page_Tenants/input_Action_filter_createBy_column'), emailName)

WebUI.sendKeys(findTestObject('Page_Tenants/input_Action_filter_createBy_column'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_Tenants/a_iconDelete'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Bạn có chắc chắn muốn xóa không?', 'Are you sure you want to delete?', 
    findTestObject('Page_Tenants/div_Bn c chc chn mun xa khng'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('CÓ', 'YES', findTestObject('Page_Tenants/button_C'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('KHÔNG', 'NO', findTestObject('Page_Tenants/button_Khng'))

WebUI.click(findTestObject('Page_Tenants/button_Khng'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementNotPresent(findTestObject('Page_Tenants/div_Bn c chc chn mun xa khng'), 2)

WebUI.click(findTestObject('Page_Tenants/a_iconDelete'))

WebUI.click(findTestObject('Page_Tenants/button_C'))

WebUI.delay(3)

WebUI.refresh()

WebUI.waitForElementNotPresent(findTestObject('Page_Tenants/span_Danh sach Tenant'), 2)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://testbed.oneiot.com.vn:8000/')

WebUI.setText(findTestObject('Page_Login/input_Email'), emailName)

WebUI.setText(findTestObject('Page_Login/input_MatKhau_password'), passwordTenant)

WebUI.delay(2)

WebUI.click(findTestObject('Page_Login/button_DangNhap'))

WebUI.waitForElementNotPresent(findTestObject('Page_Dashboard/QTHT'), 2)

