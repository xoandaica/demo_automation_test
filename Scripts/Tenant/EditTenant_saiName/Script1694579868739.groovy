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

WebUI.delay(2)

WebUI.click(findTestObject('Page_Login/button_DangNhap'))

WebUI.delay(2)

WebUI.maximizeWindow()

WebUI.refresh()

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('QUẢN TRỊ HỆ THỐNG', 'ADMINISTRATION', findTestObject(
        'Page_Dashboard/QTHT'))

//WebUI.click(findTestObject('Object Repository/Page_Dashboard/a__sSwitch_primary'), FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Page_Dashboard/span_Tenants'))

WebUI.setText(findTestObject('Page_Tenants/input_Action_filter_createBy_column'), emailName)

WebUI.sendKeys(findTestObject('Page_Tenants/input_Action_filter_createBy_column'), Keys.chord(Keys.ENTER))

WebUI.verifyElementText(findTestObject('Page_Tenants/td_tenant_menntyopmail.com'), emailName)

tenantID_dt = WebUI.getText(findTestObject('Page_Tenants/td_tnt-452adb68-32bc-41cb-80e4-69707af8f459'))

WebUI.click(findTestObject('Page_Tenants/a_iconEdit'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Sửa', 'Edit', findTestObject('Page_Chnh sa Tenant/span_Sua'))

WebUI.verifyElementText(findTestObject('Page_Chnh sa Tenant/label_tnt-452adb68-32bc-41cb-80e4-69707af8f459'), tenantID_dt)

WebUI.setText(findTestObject('Page_Chnh sa Tenant/input_Ten_name'), 'hí hí')

WebUI.click(findTestObject('Page_Chnh sa Tenant/span_Lu'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Trường này không được bao gồm kí tự đặc biệt', 
    'This field must not include special characters', findTestObject('Page_Chnh sa Tenant/span_Trng ny khng c bao gm k t c bit'))

WebUI.closeBrowser()

