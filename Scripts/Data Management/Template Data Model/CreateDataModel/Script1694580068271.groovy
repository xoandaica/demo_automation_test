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

WebUI.click(findTestObject('Page_Dashboard/a_Mau Du Lieu'), FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Mẫu Dữ Liệu', 'Template Data Model', findTestObject(
        'Page_Qun l biu mu/span_Mau Du Lieu'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('TẠO MỚI', 'CREATE', findTestObject('Page_Qun l biu mu/span_Tao Moi'))

WebUI.click(findTestObject('Page_Qun l biu mu/span_Tao Moi'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Tạo Mới', 'Create', findTestObject('Page_To Template/span_Tao Moi'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('HỦY', 'CANCEL', findTestObject('Page_To Template/span_Huy'))

WebUI.click(findTestObject('Page_To Template/span_Huy'))

WebUI.waitForElementNotPresent(findTestObject('Page_To Template/span_Tao Moi'), 2)

WebUI.click(findTestObject('Page_Qun l biu mu/span_Tao Moi'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Tên', 'Name', findTestObject('Page_To Template/label_Ten'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Mô tả', 'Description', findTestObject('Page_To Template/label_Mo ta'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Mẫu Riêng Tư', 'Private Model', findTestObject(
        'Page_To Template/label_Private Model'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Mẫu Công Khai', 'Public Model', findTestObject(
        'Page_To Template/label_Public Model'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('DỮ LIỆU TỪ XA', 'TELEMETRY LIST', findTestObject(
        'Page_To Template/h3_Du Lieu Telemetry'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Tên', 'Name', findTestObject('Page_To Template/th_Ten'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Đơn vị', 'Uom', findTestObject('Page_To Template/th_Uom'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Loại', 'Type', findTestObject('Page_To Template/th_Loai'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Thao tác', 'Action', findTestObject('Page_To Template/th_Thao tac'))

WebUI.setText(findTestObject('Page_To Template/input_()_name'), TemplateName)

WebUI.setText(findTestObject('Page_To Template/input_M t_description'), DescriptionTemplate)

WebUI.setText(findTestObject('Page_To Template/input_Ten_filter1'), TelemetryName1)

WebUI.setText(findTestObject('Page_To Template/input_Uom_filter1'), TelemetryUom1)

WebUI.click(findTestObject('Page_To Template/button_icon_Them_Telemetry'))

WebUI.click(findTestObject('Page_To Template/span_Luu'))

WebUI.setText(findTestObject('Page_Qun l biu mu/input_Ten_Filter'), TemplateName)

WebUI.sendKeys(findTestObject('Page_Qun l biu mu/input_Ten_Filter'), Keys.chord(Keys.ENTER))

WebUI.verifyElementText(findTestObject('Page_Qun l biu mu/a_hihu123DS'), TemplateName)

WebUI.verifyElementText(findTestObject('Page_Qun l biu mu/a_MoTaDS'), DescriptionTemplate)

String checktypeDS = WebUI.getText(findTestObject('Page_Qun l biu mu/a_TypeDS'), FailureHandling.STOP_ON_FAILURE)

if ((((checktypeDS == 'Tùy biến') || 'Biểu mẫu') || 'Custom') || 'Template') {
    println('type có xuất hiện')
} else {
    assert false : 'Type không xuất hiện'
}

