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

//String[] splEmail = emailName.split("@")
//String username = splEmail[0]
//WebUI.comment("username="+ username)
WebUI.openBrowser('')

WebUI.navigateToUrl('https://mail.vnpt-technology.vn')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Page_Outlook/input_Show password_username'), emailName)

WebUI.setText(findTestObject('Object Repository/Page_Outlook/input_Show password_password'), passwordMail)

WebUI.click(findTestObject('Object Repository/Page_Outlook/span_sign in'))

WebUI.click(findTestObject('Object Repository/Page_Th - thanhmdvnpt-technology.vn/span_ONE IoT Platform'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Th - thanhmdvnpt-technology.vn/h3_ONE IoT Platform - VNPT TECHNOLOGY'), 
    'ONE IoT Platform - VNPT TECHNOLOGY')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Th - thanhmdvnpt-technology.vn/p_Xin cho md'), 'Xin chào ' + 
    lastName)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Th - thanhmdvnpt-technology.vn/p_Ti khon One IoT Platform ca bn va c to, v_37523c'), 
    'Tài khoản One IoT Platform của bạn vừa được tạo, vui lòng truy cập đường link sau và đổi mật khẩu:')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Th - thanhmdvnpt-technology.vn/b_Ti khon'), 'Tài khoản:')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Th - thanhmdvnpt-technology.vn/span_thanhmdvnpt-technology.vn'), 
    emailName)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Th - thanhmdvnpt-technology.vn/span_Thn,'), 'Thân,')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Th - thanhmdvnpt-technology.vn/em_ONE IoT Platform Team'), 
    'ONE IoT Platform Team.')

WebUI.click(findTestObject('Object Repository/Page_Th - thanhmdvnpt-technology.vn/a_Bm vo y  truy cp h thng v i mt khu'))

WebUI.switchToWindowTitle('Login')

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('', 'VNPT Technology', findTestObject('Page_Login/h3_VNPT Technology'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('', 'ONE IoT Platform', findTestObject('Page_Login/h2_ONE IoT Platform'))

WebUI.verifyElementText(findTestObject('Page_Login/span_Email'), 'Email')

def Email1 = WebUI.getAttribute(findTestObject('Page_Login/input_Email_email'), 'value')

'Kiểm tra tên nhóm có đúng với giá trị mong muốn không'
if (Email1 == emailName) {
    println('Giá trị thuộc tính khớp với giá trị mong đợi.' // Sử dụng assert để báo lỗi nếu giá trị không khớp
        )
} else {
    assert false : 'Giá trị thuộc tính không khớp với giá trị mong đợi.'
}

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Mật Khẩu Mới(*)', 'New Password(*)', findTestObject(
        'Page_Login/span_New Password()'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Xác Nhận Mật Khẩu Mới(*)', 'Confirm New Password(*)', 
    findTestObject('Page_Login/span_Confirm New Password()'))

WebUI.setText(findTestObject('Object Repository/Page_Login/input_New Password()_password'), passwordTenant)

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Confirm New Password()_confirmPassword'), passwordTenant)

WebUI.click(findTestObject('Object Repository/Page_Login/button_SET  LOGIN'))

WebUI.setText(findTestObject('Page_Login/input_Email'), emailName)

WebUI.setText(findTestObject('Object Repository/Page_Login/input_New Password()_password'), passwordTenant)

WebUI.click(findTestObject('Object Repository/Page_Login/button_ng Nhp'))

WebUI.click(findTestObject('Object Repository/Page_Administration/span_thanhmd md'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Hồ sơ của tôi', 'My Profile', findTestObject(
        'Page_Administration/a_Ho so cua toi'))

WebUI.click(findTestObject('Page_Administration/a_Ho so cua toi'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Hồ sơ của tôi', 'My Profile', findTestObject(
        'Page_Chi tiet nguoi dung/span_Ho so cua toi'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Tên', 'First name', findTestObject('Page_Chi tiet nguoi dung/label_Ten'))

def TenTenant = WebUI.getAttribute(findTestObject('Page_Chi tiet nguoi dung/input_Ten'), 'value')

'Kiểm tra tên nhóm có đúng với giá trị mong muốn không'
if (TenTenant == firtName) {
    println('Giá trị thuộc tính khớp với giá trị mong đợi.' // Sử dụng assert để báo lỗi nếu giá trị không khớp
        )
} else {
    assert false : 'Giá trị thuộc tính không khớp với giá trị mong đợi.'
}

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Họ và Đệm', 'Last name', findTestObject(
        'Page_Chi tiet nguoi dung/label_Ho va Dem'))

def HoDem = WebUI.getAttribute(findTestObject('Page_Chi tiet nguoi dung/input_HovaDem'), 'value')

'Kiểm tra tên nhóm có đúng với giá trị mong muốn không'
if (HoDem == lastName) {
    println('Giá trị thuộc tính khớp với giá trị mong đợi.' // Sử dụng assert để báo lỗi nếu giá trị không khớp
        )
} else {
    assert false : 'Giá trị thuộc tính không khớp với giá trị mong đợi.'
}

WebUI.verifyElementText(findTestObject('Page_Chi tiet nguoi dung/label_Email'), 'Email')

def Email = WebUI.getAttribute(findTestObject('Page_Chi tiet nguoi dung/input_Email'), 'value')

'Kiểm tra tên nhóm có đúng với giá trị mong muốn không'
if (Email == emailName) {
    println('Giá trị thuộc tính khớp với giá trị mong đợi.' // Sử dụng assert để báo lỗi nếu giá trị không khớp
        )
} else {
    assert false : 'Giá trị thuộc tính không khớp với giá trị mong đợi.'
}

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Số điện thoại', 'Phone', findTestObject(
        'Page_Chi tiet nguoi dung/label_So dien thoai'))

def SDT = WebUI.getAttribute(findTestObject('Page_Chi tiet nguoi dung/input_So dien thoai_phone'), 'value')

'Kiểm tra tên nhóm có đúng với giá trị mong muốn không'
if (SDT == sdt) {
    println('Giá trị thuộc tính khớp với giá trị mong đợi.' // Sử dụng assert để báo lỗi nếu giá trị không khớp
        )
} else {
    assert false : 'Giá trị thuộc tính không khớp với giá trị mong đợi.'
}

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Quốc gia', 'Country', findTestObject('Page_Chi tiet nguoi dung/label_Quoc gia'))

def Country = WebUI.getAttribute(findTestObject('Page_Chi tiet nguoi dung/input_QuocGia'), 'value')

'Kiểm tra tên nhóm có đúng với giá trị mong muốn không'
if (Country == country) {
    println('Giá trị thuộc tính khớp với giá trị mong đợi.' // Sử dụng assert để báo lỗi nếu giá trị không khớp
        )
} else {
    assert false : 'Giá trị thuộc tính không khớp với giá trị mong đợi.'
}

WebUI.verifyElementText(findTestObject('Page_Chi tiet nguoi dung/label_Cong ty'), 'Công ty')

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Công ty', 'Company', findTestObject('Page_Chi tiet nguoi dung/label_Cong ty'))

def CongTy = WebUI.getAttribute(findTestObject('Page_Chi tiet nguoi dung/input_Cong ty_phone'), 'value')

'Kiểm tra tên nhóm có đúng với giá trị mong muốn không'
if (CongTy == company) {
    println('Giá trị thuộc tính khớp với giá trị mong đợi.' // Sử dụng assert để báo lỗi nếu giá trị không khớp
        )

    WebUI.closeBrowser()
} else {
    assert false : 'Giá trị thuộc tính không khớp với giá trị mong đợi.'
}

WebUI.closeBrowser()

