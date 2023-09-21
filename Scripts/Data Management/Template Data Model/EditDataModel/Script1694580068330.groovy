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

WebUI.callTestCase(findTestCase('LogIn'), [('passwordTenant') : '123@abc', ('emailName') : 'nghiepnv@vnpt-technology.vn'], 
    FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Quản lý Dữ Liệu', 'Data Management', findTestObject(
        'Page_Dashboard/span_Quan ly Du Lieu'))

WebUI.click(findTestObject('Page_Dashboard/span_Quan ly Du Lieu'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Mẫu Dữ Liệu', 'Template Data Model', findTestObject(
        'Page_Dashboard/a_Mau Du Lieu'))

WebUI.click(findTestObject('Page_Dashboard/a_Mau Du Lieu'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Mẫu Dữ Liệu', 'Template Data Model', findTestObject(
        'Page_Qun l biu mu/span_Mau Du Lieu'))

WebUI.setText(findTestObject('Page_Qun l biu mu/input_Ten_Filter'), TemplateName)

WebUI.sendKeys(findTestObject('Page_Qun l biu mu/input_Ten_Filter'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_Qun l biu mu/a_iconSua'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Sửa', 'Edit', findTestObject('Page_Sa Template/span_Sua'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('HỦY', 'CANCEL', findTestObject('Page_Sa Template/span_Huy'))

WebUI.click(findTestObject('Page_Sa Template/span_Huy'))

WebUI.waitForElementNotPresent(findTestObject('Page_Sa Template/span_Sua'), 1)

WebUI.setText(findTestObject('Page_Qun l biu mu/input_Ten_Filter'), TemplateName)

WebUI.sendKeys(findTestObject('Page_Qun l biu mu/input_Ten_Filter'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_Qun l biu mu/a_iconSua'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Sửa', 'Edit', findTestObject('Page_Sa Template/span_Sua'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Tên', 'Name', findTestObject('Page_Sa Template/label_Ten'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Mô tả', 'Description', findTestObject('Page_Sa Template/label_Mo ta'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Mẫu Riêng Tư', 'Private Model', findTestObject(
        'Page_Sa Template/label_Private Model'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Mẫu Công Khai', 'Public Model', findTestObject(
        'Page_Sa Template/label_Public Model'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Dữ Liệu Từ Xa', 'Telemetry List', findTestObject(
        'Page_Sa Template/h3_Du Lieu Telemetry'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Tên', 'Name', findTestObject('Page_Sa Template/th_Ten'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Đơn vị', 'Uom', findTestObject('Page_Sa Template/th_Uom'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Loại', 'Type', findTestObject('Page_Sa Template/th_Loai'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Thao tác', 'Action', findTestObject('Page_Sa Template/th_Thao tac'))

WebUI.setText(findTestObject('Page_Sa Template/input_()_nameSua'), TemplateNameEdit)

WebUI.setText(findTestObject('Page_Sa Template/input_Mo ta_description'), DescriptionTemplateEdit)

WebUI.click(findTestObject('Page_Sa Template/input_Public_radiobox'))

WebUI.setText(findTestObject('Page_Sa Template/input_nameTelemetry2'), TelemetryName2)

WebUI.setText(findTestObject('Page_Sa Template/input_UomTelemetry2'), TelemetryUom2)

WebUI.click(findTestObject('Page_Sa Template/select_comboxType2'))

WebUI.click(findTestObject('Page_Sa Template/select_combox_Number'))

WebUI.click(findTestObject('Page_Sa Template/select_String2'))

WebUI.click(findTestObject('Page_Sa Template/button_iconThemTelemetry'))

WebUI.click(findTestObject('Page_Sa Template/span_Luu'))

WebUI.setText(findTestObject('Page_Qun l biu mu/input_Ten_Filter'), TemplateName)

WebUI.sendKeys(findTestObject('Page_Qun l biu mu/input_Ten_Filter'), Keys.chord(Keys.ENTER))

WebUI.verifyElementText(findTestObject('Page_Qun l biu mu/a_hihu123DS'), TemplateNameEdit)

WebUI.verifyElementText(findTestObject('Page_Qun l biu mu/a_MoTaDS'), DescriptionTemplateEdit)

String checkType = WebUI.getText(findTestObject('Page_Qun l biu mu/a_TypeDS'), FailureHandling.STOP_ON_FAILURE)

if ((checkType == 'Tùy biến') || 'Biểu mẫu') {
    println('Có giá trị type hiển thị' // Sử dụng assert để báo lỗi nếu giá trị không khớp
        )
} else {
    assert false : 'không có giá trị type hiển thị'
}

WebUI.click(findTestObject('Page_Qun l biu mu/a_hihu123DS'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Page_Chi tit Template/span_TemplateNameDetail'), TemplateNameEdit)

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('THÔNG TIN CHI TIẾT', 'DETAIL INFO', findTestObject(
        'Page_Chi tit Template/h3_Thong tin chi tiet'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Tên', 'Name', findTestObject('Page_Chi tit Template/label_Ten'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Loại', 'Type', findTestObject('Page_Chi tit Template/label_Loai'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Mô tả', 'Description', findTestObject('Page_Chi tit Template/label_M t'))

def value = WebUI.getAttribute(findTestObject('Page_Chi tit Template/div_Ten'), 'value')

'Kiểm tra tên template có đúng với giá trị mong muốn không'
if (value == TemplateNameEdit) {
    println('Giá trị thuộc tính khớp với giá trị mong đợi.' // Sử dụng assert để báo lỗi nếu giá trị không khớp
        )
} else {
    assert false : 'Giá trị thuộc tính không khớp với giá trị mong đợi.'
}

def type = WebUI.getAttribute(findTestObject('Page_Chi tit Template/div_Loai'), 'value')

'Kiểm tra loại template có đúng với giá trị mong muốn không'
if ((type == 'Custom') || 'Template') {
    println('Giá trị thuộc tính khớp với giá trị mong đợi.' // Sử dụng assert để báo lỗi nếu giá trị không khớp
        )
} else {
    assert false : 'Giá trị thuộc tính không khớp với giá trị mong đợi.'
}

def description = WebUI.getAttribute(findTestObject('Page_Chi tit Template/div_Mo ta'), 'value')

'Kiểm tra mô tả template có đúng với giá trị mong muốn không'
if (description == DescriptionTemplateEdit) {
    println('Giá trị thuộc tính khớp với giá trị mong đợi.' // Sử dụng assert để báo lỗi nếu giá trị không khớp
        )
} else {
    assert false : 'Giá trị thuộc tính không khớp với giá trị mong đợi.'
}

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Mẫu Riêng Tư', 'Private Model', findTestObject(
        'Page_Chi tit Template/div_Private Model'))

rdxPrivate = WebUI.getAttribute(findTestObject('Page_Chi tit Template/radiobox_Private Model'), 'value')

WebUI.comment('Giá trị attribute: ' + rdxPrivate)

if (rdxPrivate == '0') {
    println('Button chưa chọn')
} else {
    assert false : 'Button đã chọn'
}

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Mẫu Công Khai', 'Public Model', findTestObject(
        'Page_Chi tit Template/div_Public Model'))

rdxPublic = WebUI.getAttribute(findTestObject('Page_Chi tit Template/radiobox_Public Model'), 'value')

WebUI.comment('Giá trị attribute: ' + rdxPublic)

if (rdxPublic == '1') {
    println('Button đã chọn')
} else {
    assert false : 'Button chưa chọn'
}

WebUI.refresh()

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Page_Chi tit Template/td_Nhietdo1'), TelemetryName1)

WebUI.verifyElementText(findTestObject('Page_Chi tit Template/td_t1'), TelemetryUom1)

WebUI.verifyElementText(findTestObject('Page_Chi tit Template/td_Number'), 'Number')

WebUI.verifyElementText(findTestObject('Page_Chi tit Template/td_Doam1'), TelemetryName2)

WebUI.verifyElementText(findTestObject('Page_Chi tit Template/td_a2'), TelemetryUom2)

WebUI.verifyElementText(findTestObject('Page_Chi tit Template/td_Number2'), 'String')

