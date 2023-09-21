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

WebUI.maximizeWindow()

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Đăng Ký', 'Sign Up', findTestObject('Page_Login/a_Dang ky'))

WebUI.click(findTestObject('Page_Login/a_Dang ky'))

WebUI.verifyElementText(findTestObject('Page_Register/div_VNPT ONE IoT Platform'), 'VNPT ONE IOT PLATFORM')

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('HOẶC ĐÃ CÓ TÀI KHOẢN?', 'OR ALREADY HAVE AN ACCOUNT?', 
    findTestObject('Page_Register/div_OR ALREADY HAVE AN ACCOUNT'))

WebUI.click(findTestObject('Page_Register/div_OR ALREADY HAVE AN ACCOUNT'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementNotPresent(findTestObject('Page_Register/div_VNPT ONE IoT Platform'), 2)

WebUI.click(findTestObject('Page_Login/a_Dang ky'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('ĐĂNG KÝ', 'SIGN UP', findTestObject('Page_Register/h2_Dang Ky'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Tên(*) :', 'First Name(*) :', findTestObject(
        'Page_Register/label_First Name()'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Họ(*) :', 'Last Name(*) :', findTestObject(
        'Page_Register/label_Last Name()'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Email(*):', 'Email(*):', findTestObject(
        'Page_Register/label_Email()'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Số Điện Thoại :', 'Phone :', findTestObject(
        'Page_Register/label_Phone'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Quốc Gia :', 'Country :', findTestObject(
        'Page_Register/label_Country'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Cơ Quan/Công Ty:', 'Company:', findTestObject(
        'Page_Register/label_Company'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Tên Khách Hàng:', 'Tenant Name:', findTestObject(
        'Page_Register/label_Tenant Name'))

singUp = WebUI.getAttribute(findTestObject('Page_Register/span_SIGN UP'), 'class')

WebUI.comment('Giá trị attribute: ' + singUp)

if (singUp.contains('hideElement')) {
    println('Button disnabled')
} else {
    assert false : 'Button is enabled'
}

WebUI.setText(findTestObject('Page_Register/input_First Name() _first_name'), firtName)

WebUI.setText(findTestObject('Page_Register/input_Last Name() _last_name'), lastName)

WebUI.setText(findTestObject('Page_Register/input_Email()_email'), emailName)

WebUI.setText(findTestObject('Page_Register/input_Phone_phone'), sdt)

WebUI.setText(findTestObject('Page_Register/input_Country_k-input ng-pristine ng-untouched ng-valid ng-not-empty'), country)

WebUI.sendKeys(findTestObject('Page_Register/input_Country_k-input ng-pristine ng-untouched ng-valid ng-not-empty'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('Page_Register/input_Company_resName'), company)

WebUI.setText(findTestObject('Page_Register/input_Tenant Name_contactName'), tenantName)

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Tôi Đồng Ý Với Chính Sách Quyền Riêng Tư', 
    'Accept Privacy Policy', findTestObject('Page_Register/div_Toi dong y voi chinh sach quyen rieng tu'))

WebUI.check(findTestObject('Page_Register/input_Tenant Name_uk-checkbox'))

singUp = WebUI.getAttribute(findTestObject('Page_Register/span_SIGN UP'), 'class')

WebUI.comment('Giá trị attribute: ' + singUp)

if (singUp.contains('hideElement')) {
    assert false : 'Button is disnabled'
} else {
    println('Button enabled')

    CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('ĐĂNG KÝ', 'SIGN UP', findTestObject(
            'Page_Register/span_SIGN UP'))
}

WebUI.click(findTestObject('Page_Register/span_SIGN UP'))

WebUI.click(findTestObject('Page_Register/div_DangKyThanhCong'), FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Chúc mừng!\nBạn đã đăng ký tài khoản thành công trên hệ thống VNPT ONE IoT Platform\nVui lòng chờ email thông báo hoặc liên hệ trực tiếp email oneiot@vnpt-technology.vn\nNếu không nhận được email kích hoạt, vui lòng ấn "Gửi lại Email"', 
    'Congratulations!\nYou have successfully registered an account on the VNPT ONE IoT Platform system\nPlease wait for the notification email or contact directly via email oneiot@vnpt-technology.vn\nIf you do not receive the activation email, please Click "Resend Email"', 
    findTestObject('Page_Register/div_DangKyThanhCong'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('GỬI LẠI EMAIL', 'RESEND EMAIL', findTestObject(
        'Page_Register/span_Gui lai email'))

WebUI.click(findTestObject('Page_Register/span_Gui lai email'), FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Email xác nhận đã được gửi lại cho bạn, vui lòng kiểm tra Email', 
    '', findTestObject('Page_Register/div_Thong bao gui lai Email thanh cong'))

WebUI.closeBrowser()

