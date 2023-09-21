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

WebUI.click(findTestObject('Page_To Template/span_Luu'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Trường này là bắt buộc', 'This field is required.', 
    findTestObject('Page_To Template/span_Trng ny l bt buc'))

WebUI.setText(findTestObject('Page_To Template/input_()_name'), TemplateName)

WebUI.setText(findTestObject('Page_To Template/input_M t_description'), DescriptionTemplate)

WebUI.click(findTestObject('Page_To Template/span_Luu'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Mẫu dữ liệu đã tồn tại !', 'This Data Template name is already exist', 
    findTestObject('Page_To Template/span_Trng ny l bt buc'))

WebUI.setText(findTestObject('Page_To Template/input_()_name'), 'dhyjwsgetierfgfreuigtegfsdhjgffgeujkgrfekrgferfegrfkegeksfghfgsfdghhhhdhyjwsgetierfgfreuigtegfsdhjgffgeujkgrfekrgferfegrfkegeksfghfgsfdghhhhdhyjwsgetierfgfreuigtegfsdhjgffgeujkgrfekrgferfegrfkegeksfghfgsfdghhhhdhyjwsgetierfgfreuigtegfsdhjgffgesdhjjfrgsdkfh')

WebUI.click(findTestObject('Page_To Template/span_Luu'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Trường này không được vượt quá 255 ký tự', 
    'This field should have 255 characters or fewer', findTestObject('Page_To Template/span_Trng ny l bt buc'))

WebUI.setText(findTestObject('Page_To Template/input_()_name'), 'hi hi')

WebUI.click(findTestObject('Page_To Template/span_Luu'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Sai định dạng. Chỉ chấp nhận các ký tự (a-z A-Z 0-9-_) và kí tự đầu phải là chữ', 
    'Wrong Format. Only Accept (a-z A-Z 0-9-_) and first character must be a letter', findTestObject('Page_To Template/span_Trng ny l bt buc'))

WebUI.setText(findTestObject('Page_To Template/input_()_name'), 'Dấu')

WebUI.click(findTestObject('Page_To Template/span_Luu'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Sai định dạng. Chỉ chấp nhận các ký tự (a-z A-Z 0-9-_) và kí tự đầu phải là chữ', 
    'Wrong Format. Only Accept (a-z A-Z 0-9-_) and first character must be a letter', findTestObject('Page_To Template/span_Trng ny l bt buc'))

WebUI.setText(findTestObject('Page_To Template/input_()_name'), '@4#&()')

WebUI.click(findTestObject('Page_To Template/span_Luu'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Sai định dạng. Chỉ chấp nhận các ký tự (a-z A-Z 0-9-_) và kí tự đầu phải là chữ', 
    'Wrong Format. Only Accept (a-z A-Z 0-9-_) and first character must be a letter', findTestObject('Page_To Template/span_Trng ny l bt buc'))

WebUI.setText(findTestObject('Page_To Template/input_()_name'), '1fgfdg')

WebUI.click(findTestObject('Page_To Template/span_Luu'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Sai định dạng. Chỉ chấp nhận các ký tự (a-z A-Z 0-9-_) và kí tự đầu phải là chữ', 
    'Wrong Format. Only Accept (a-z A-Z 0-9-_) and first character must be a letter', findTestObject('Page_To Template/span_Trng ny l bt buc'))

WebUI.setText(findTestObject('Page_To Template/input_()_name'), 'TemplateName1')

WebUI.setText(findTestObject('Page_To Template/input_M t_description'), 'dhyjwsgetierfgfreuigtegfsdhjgffgeujkgrfekrgferfegrfkegeksfghfgsfdghhhhdhyjwsgetierfgfreuigtegfsdhjgffgeujkgrfekrgferfegrfkegeksfghfgsfdghhhhdhyjwsgetierfgfreuigtegfsdhjgffgeujkgrfekrgferfegrfkegeksfghfgsfdghhhhdhyjwsgetierfgfreuigtegfsdhjgffgesdhjjfrgsdkfh')

WebUI.click(findTestObject('Page_To Template/span_Luu'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Trường này không được vượt quá 255 ký tự', 
    'This field should have 255 characters or fewer', findTestObject('Page_To Template/span_loiDescription_Template'))

WebUI.setText(findTestObject('Page_To Template/input_()_name'), 'TemplateName1')

WebUI.setText(findTestObject('Page_To Template/input_M t_description'), 'Mô tả')

WebUI.click(findTestObject('Page_To Template/button_icon_Them_Telemetry'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Trường này là bắt buộc', 'This field is required.', 
    findTestObject('Page_To Template/span_loiName telemetry'))

WebUI.setText(findTestObject('Page_To Template/input_Ten_filter1'), 'hi hi')

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Ký tự đầu phải là chữ, chỉ chấp nhận các ký tự chữ, số và _ viết liền không dấu', 
    'First character must be a letter, only accept letter, number and \'_\' without whitespace', findTestObject('Page_To Template/span_loiName telemetry'))

WebUI.click(findTestObject('Page_To Template/button_icon_Them_Telemetry'))

WebUI.setText(findTestObject('Page_To Template/input_Ten_filter1'), 'dấu')

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Ký tự đầu phải là chữ, chỉ chấp nhận các ký tự chữ, số và _ viết liền không dấu', 
    'First character must be a letter, only accept letter, number and \'_\' without whitespace', findTestObject('Page_To Template/span_loiName telemetry'))

WebUI.click(findTestObject('Page_To Template/button_icon_Them_Telemetry'))

WebUI.setText(findTestObject('Page_To Template/input_Ten_filter1'), '@#%!$^&*')

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Ký tự đầu phải là chữ, chỉ chấp nhận các ký tự chữ, số và _ viết liền không dấu', 
    'First character must be a letter, only accept letter, number and \'_\' without whitespace', findTestObject('Page_To Template/span_loiName telemetry'))

WebUI.click(findTestObject('Page_To Template/button_icon_Them_Telemetry'))

WebUI.setText(findTestObject('Page_To Template/input_Ten_filter1'), 'dhyjwsgetierfgfreuigtegfsdhjgffgeujkgrfekrgferfegrt')

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Trường này không được vượt quá 50 ký tự', 
    'This field should have 50 characters or fewer', findTestObject('Page_To Template/span_loiName telemetry'))

WebUI.click(findTestObject('Page_To Template/button_icon_Them_Telemetry'))

WebUI.setText(findTestObject('Page_To Template/input_Uom_filter1'), 'dhyjwsgetierfgfreuigtegfsdhjgffgeujkgrfekrgferfegrt')

WebUI.click(findTestObject('Page_To Template/button_icon_Them_Telemetry'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Trường này không được vượt quá 50 ký tự', 
    'This field should have 50 characters or fewer', findTestObject('Page_To Template/span_loiUom telemetry'))

WebUI.setText(findTestObject('Page_To Template/input_()_name'), 't1')

WebUI.setText(findTestObject('Page_To Template/input_M t_description'), 't2')

WebUI.setText(findTestObject('Page_To Template/input_Ten_filter1'), 'a1')

WebUI.click(findTestObject('Page_To Template/button_icon_Them_Telemetry'))

WebUI.setText(findTestObject('Page_To Template/input_TenTelemetry2'), 'a1')

WebUI.click(findTestObject('Page_To Template/button_icon_Them_Telemetry'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Tên đã tồn tại', 'Name Existed', findTestObject(
        'Page_To Template/span_Key  ton tai'))

