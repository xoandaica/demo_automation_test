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

WebUI.delay(3)

WebUI.setText(findTestObject('Page_Tenants/input_Action_filter_createBy_column'), emailName)

WebUI.sendKeys(findTestObject('Page_Tenants/input_Action_filter_createBy_column'), Keys.chord(Keys.ENTER))

WebUI.verifyElementText(findTestObject('Page_Tenants/td_tenant_menntyopmail.com'), emailName)

tenantID_dt = WebUI.getText(findTestObject('Page_Tenants/td_tnt-452adb68-32bc-41cb-80e4-69707af8f459'))

admin_dt = WebUI.getText(findTestObject('Page_Tenants/td_mennt nt'))

company_dt = WebUI.getText(findTestObject('Page_Tenants/td_vnpt'))

createDate_dt = WebUI.getText(findTestObject('Page_Tenants/label_CreateDate'))

createBy_dt = WebUI.getText(findTestObject('Page_Tenants/td_tenant_menntyopmail.com'))

UpdateDate_dt = WebUI.getText(findTestObject('Page_Tenants/label_updateDate'))

UpdateBy_dt = WebUI.getText(findTestObject('Page_Tenants/td_admin'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Hoạt Động', 'Active', findTestObject('Page_Tenants/span_Hot ng'))

WebUI.click(findTestObject('Page_Tenants/td_tnt-452adb68-32bc-41cb-80e4-69707af8f459'))

WebUI.verifyElementText(findTestObject('Page_Chi tit Tenant/span_tnt-452adb68-32bc-41cb-80e4-69707af8f459'), tenantID_dt)

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Tên', 'Name', findTestObject('Page_Chi tit Tenant/label_Ten'))

tenantname = WebUI.getText(findTestObject('Page_Chi tit Tenant/label_mennttenant'), FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Mã khách hàng', 'Tenant ID', findTestObject(
        'Page_Chi tit Tenant/label_Tenant ID'))

WebUI.verifyElementText(findTestObject('Page_Chi tit Tenant/label_tnt-452adb68-32bc-41cb-80e4-69707af8f459'), tenantID_dt)

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Người quản lý', 'Admin', findTestObject(
        'Page_Chi tit Tenant/label_Nguoi quan ly'))

WebUI.verifyElementText(findTestObject('Page_Chi tit Tenant/label_mennt nt'), admin_dt)

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Gói Dịch Vụ Đăng Ký', 'Service Subscription Package', 
    findTestObject('Page_Chi tit Tenant/label_Service Subscription Package'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Toàn bộ gói', 'Full Subscription', findTestObject(
        'Page_Chi tit Tenant/label_Full Subscription'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Mã khách hàng', 'Tenant ID', findTestObject(
        'Page_Chi tit Tenant/label_Tenant ID'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Công ty', 'Company', findTestObject('Page_Chi tit Tenant/label_Cong ty'))

WebUI.verifyElementText(findTestObject('Page_Chi tit Tenant/label_vnpt'), company_dt)

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Ngày tạo', 'Created Date', findTestObject(
        'Page_Chi tit Tenant/label_Ngay tao'))

WebUI.verifyElementText(findTestObject('Page_Chi tit Tenant/label_28-07-2023 155219'), createDate_dt)

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Người tạo', 'Created By', findTestObject(
        'Page_Chi tit Tenant/label_Tao boi'))

WebUI.verifyElementText(findTestObject('Page_Chi tit Tenant/label_tenant_menntyopmail.com'), createBy_dt)

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Ngày cập nhật', 'Updated Date', findTestObject(
        'Page_Chi tit Tenant/label_Ngay cap nhat'))

WebUI.verifyElementText(findTestObject('Page_Chi tit Tenant/label_UpdateDay'), UpdateDate_dt)

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Người cập nhật', 'Updated By', findTestObject(
        'Page_Chi tit Tenant/label_Cap nhat boi'))

WebUI.verifyElementText(findTestObject('Page_Chi tit Tenant/label_admin'), UpdateBy_dt)

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('EDIT', 'SỬA', findTestObject('Page_Chi tit Tenant/span_Sua_detail'))

WebUI.click(findTestObject('Page_Chi tit Tenant/span_Sua_detail'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('HỦY', 'CANCEL', findTestObject('Page_Chnh sa Tenant/span_Hy'))

WebUI.click(findTestObject('Page_Chnh sa Tenant/span_Hy'))

WebUI.waitForElementNotPresent(findTestObject('Page_Chnh sa Tenant/span_Sua'), 3)

WebUI.click(findTestObject('Page_Chi tit Tenant/span_Sua_detail'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Sửa', 'Edit', findTestObject('Page_Chnh sa Tenant/span_Sua'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Tên', 'Name', findTestObject('Page_Chnh sa Tenant/label_Tn'))

def TenTenant = WebUI.getAttribute(findTestObject('Page_Chnh sa Tenant/input_Ten_name'), 'value')

'Kiểm tra tên nhóm có đúng với giá trị mong muốn không'
if (TenTenant == tenantname) {
    println('Giá trị thuộc tính khớp với giá trị mong đợi.' // Sử dụng assert để báo lỗi nếu giá trị không khớp
        )
} else {
    assert false : 'Giá trị thuộc tính không khớp với giá trị mong đợi.'
}

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Mã khách hàng', 'Tenant ID', findTestObject(
        'Page_Chnh sa Tenant/label_Tenant ID'))

WebUI.verifyElementText(findTestObject('Page_Chnh sa Tenant/label_tnt-452adb68-32bc-41cb-80e4-69707af8f459'), tenantID_dt)

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Người quản lý', 'Admin', findTestObject(
        'Page_Chnh sa Tenant/label_Ngi qun l'))

WebUI.verifyElementText(findTestObject('Page_Chnh sa Tenant/label_mennt nt'), admin_dt)

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Gói Dịch Vụ Đăng Ký', 'Service Subscription Package', 
    findTestObject('Page_Chnh sa Tenant/label_Service Subscription Package'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Toàn bộ gói', 'Full Subscription', findTestObject(
        'Page_Chnh sa Tenant/label_Full Subscription'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Công ty', 'Company', findTestObject('Page_Chnh sa Tenant/label_Cng ty'))

WebUI.verifyElementText(findTestObject('Page_Chnh sa Tenant/label_vnpt'), company_dt)

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Ngày tạo', 'Created Date', findTestObject(
        'Page_Chnh sa Tenant/label_Ngy to'))

WebUI.verifyElementText(findTestObject('Page_Chnh sa Tenant/label_CreateDate'), createDate_dt)

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Người tạo', 'Created By', findTestObject(
        'Page_Chnh sa Tenant/label_To bi'))

WebUI.verifyElementText(findTestObject('Page_Chnh sa Tenant/label_tenant_menntyopmail.com'), createBy_dt)

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Ngày cập nhật', 'Updated Date', findTestObject(
        'Page_Chnh sa Tenant/label_Ngy cp nht'))

WebUI.verifyElementText(findTestObject('Page_Chnh sa Tenant/label_UpdateDate'), UpdateDate_dt)

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Người cập nhật', 'Updated By', findTestObject(
        'Page_Chnh sa Tenant/label_Cp nht bi'))

WebUI.verifyElementText(findTestObject('Page_Chnh sa Tenant/label_admin'), UpdateBy_dt)

WebUI.setText(findTestObject('Page_Chnh sa Tenant/input_Ten_name'), TenantNameEdit)

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('LƯU', 'SAVE', findTestObject('Page_Chnh sa Tenant/span_Lu'))

WebUI.click(findTestObject('Page_Chnh sa Tenant/span_Lu'))

WebUI.delay(1)

WebUI.verifyElementText(findTestObject('Page_Chi tit Tenant/label_mennttenant'), TenantNameEdit)

WebUI.closeBrowser()

