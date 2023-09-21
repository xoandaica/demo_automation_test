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

WebUI.click(findTestObject('Page_Dashboard/span_Tenants'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Khách Hàng', 'Tenants', findTestObject('Page_Dashboard/span_Tenants'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Danh sách Khách Hàng', 'List Tenant', findTestObject(
        'Page_Tenants/span_Danh sach Tenant'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Mã khách hàng', 'Tenant ID', findTestObject(
        'Page_Tenants/span_Tenant ID'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Người quản lý', 'Admin', findTestObject(
        'Page_Tenants/span_Nguoi quan ly'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Công ty', 'Company', findTestObject('Page_Tenants/span_Cong ty'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Ngày tạo', 'Created Date', findTestObject(
        'Page_Tenants/span_Ngay tao'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Người tạo', 'Created By', findTestObject(
        'Page_Tenants/span_Tao boi'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Ngày cập nhật', 'Updated Date', findTestObject(
        'Page_Tenants/span_Ngay cap nhat'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Người cập nhật', 'Updated By', findTestObject(
        'Page_Tenants/span_Cap nhat boi'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Trạng thái', 'Status', findTestObject('Page_Tenants/span_Trang thai'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Thao tác', 'Action', findTestObject('Page_Tenants/span_Thao tac'))

WebUI.closeBrowser()

