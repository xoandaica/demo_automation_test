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

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Tên', 'Name', findTestObject('Page_Qun l biu mu/span_Ten'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Mô tả', 'Description', findTestObject('Page_Qun l biu mu/span_Mo ta'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Loại', 'Type', findTestObject('Page_Qun l biu mu/span_Loai'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Thao tác', 'Action', findTestObject('Page_Qun l biu mu/th_Thao tac'))

WebUI.setText(findTestObject('Page_Qun l biu mu/input_Ten_Filter'), TemplateName)

WebUI.sendKeys(findTestObject('Page_Qun l biu mu/input_Ten_Filter'), Keys.chord(Keys.ENTER))

WebUI.verifyElementText(findTestObject('Page_Qun l biu mu/a_hihu123DS'), TemplateName)

WebUI.verifyElementText(findTestObject('Page_Qun l biu mu/a_MoTaDS'), DescriptionTemplate)

String checkType = WebUI.getText(findTestObject('Page_Qun l biu mu/a_TypeDS'), FailureHandling.STOP_ON_FAILURE)

if (checkType == 'Tùy biến' || 'Biểu mẫu') {
    println('Có giá trị type hiển thị' // Sử dụng assert để báo lỗi nếu giá trị không khớp
        )
} else {
    assert false : 'không có giá trị type hiển thị'
}

println('Có giá trị type hiển thị' // Sử dụng assert để báo lỗi nếu giá trị không khớp
    )

WebUI.click(findTestObject('Page_Qun l biu mu/a_hihu123DS'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Page_Chi tit Template/span_TemplateNameDetail'), TemplateName)

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('THÔNG TIN CHI TIẾT', 'DETAIL INFO', findTestObject(
        'Page_Chi tit Template/h3_Thong tin chi tiet'))

WebUI.click(findTestObject('Page_Chi tit Template/span_Sua'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Sửa', 'Edit', findTestObject('Page_Sa Template/span_Sua'))

WebUI.back()

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('THÔNG TIN CHI TIẾT', 'DETAIL INFO', findTestObject(
        'Page_Chi tit Template/h3_Thong tin chi tiet'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Tên', 'Name', findTestObject('Page_Chi tit Template/label_Ten'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Loại', 'Type', findTestObject('Page_Chi tit Template/label_Loai'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Mô tả', 'Description', findTestObject('Page_Chi tit Template/label_M t'))

def value = WebUI.getAttribute(findTestObject('Page_Chi tit Template/div_Ten'), 'value')

'Kiểm tra tên nhóm có đúng với giá trị mong muốn không'
if (value == TemplateName) {
    println('Giá trị thuộc tính khớp với giá trị mong đợi.' // Sử dụng assert để báo lỗi nếu giá trị không khớp
        )
} else {
    assert false : 'Giá trị thuộc tính không khớp với giá trị mong đợi.'
}

def type = WebUI.getAttribute(findTestObject('Page_Chi tit Template/div_Loai'), 'value')

'Kiểm tra tên nhóm có đúng với giá trị mong muốn không'
if ((type == 'Custom') || 'Template') {
    println('Giá trị thuộc tính khớp với giá trị mong đợi.' // Sử dụng assert để báo lỗi nếu giá trị không khớp
        )
} else {
    assert false : 'Giá trị thuộc tính không khớp với giá trị mong đợi.'
}

def description = WebUI.getAttribute(findTestObject('Page_Chi tit Template/div_Mo ta'), 'value')

'Kiểm tra tên nhóm có đúng với giá trị mong muốn không'
if (description == DescriptionTemplate) {
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
    println('Button đã chọn')
} else {
    assert false : 'Button chưa chọn'
}

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Mẫu Công Khai', 'Public Model', findTestObject(
        'Page_Chi tit Template/div_Public Model'))

rdxPublic = WebUI.getAttribute(findTestObject('Page_Chi tit Template/radiobox_Public Model'), 'value')

WebUI.comment('Giá trị attribute: ' + rdxPublic)

if (rdxPublic == '1') {
    println('Button chưa chọn')
} else {
    assert false : 'Button đã chọn'
}

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('DỮ LIỆU TỪ XA', 'TELEMETRY', findTestObject(
        'Page_Chi tit Template/h4_Du Lieu Tu Xa'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Tên', 'Name', findTestObject('Page_Chi tit Template/span_Ten'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Đơn vị', 'Uom', findTestObject('Page_Chi tit Template/span_Don vi'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Loại', 'Type', findTestObject('Page_Chi tit Template/span_Loai'))

WebUI.click(findTestObject('Page_Chi tit Template/span_Loi_comboxLoai'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Number', false)

WebUI.verifyTextPresent('String', false)

WebUI.verifyTextPresent('Boolean', false)

WebUI.verifyTextPresent('List Number', false)

WebUI.verifyTextPresent('List String', false)

WebUI.click(findTestObject('Page_Chi tit Template/span_Loi_comboxLoai'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Page_Chi tit Template/td_Nhietdo1'), TelemetryName1)

WebUI.verifyElementText(findTestObject('Page_Chi tit Template/td_t1'), TelemetryUom1)

WebUI.verifyElementText(findTestObject('Page_Chi tit Template/td_Number'), 'Number')

