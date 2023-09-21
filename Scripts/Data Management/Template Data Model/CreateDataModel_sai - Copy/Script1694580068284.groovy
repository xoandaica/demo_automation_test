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

WebUI.verifyElementText(findTestObject('Page_Dashboard/span_Quan ly Du Lieu'), 'Quản lý Dữ Liệu')

WebUI.click(findTestObject('Page_Dashboard/span_Quan ly Du Lieu'))

WebUI.verifyElementText(findTestObject('Page_Dashboard/a_Mau Du Lieu'), 'Mẫu Dữ Liệu')

WebUI.click(findTestObject('Page_Dashboard/a_Mau Du Lieu'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Page_Qun l biu mu/span_Mau Du Lieu'), 'Mẫu Dữ Liệu')

WebUI.click(findTestObject('Page_Qun l biu mu/span_Tao Moi'))

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('Page_To Template/span_Tao Moi'), 'Tạo Mới')

WebUI.click(findTestObject('Page_To Template/span_Huy'))

WebUI.waitForElementNotPresent(findTestObject('Page_To Template/span_Tao Moi'), 2)

WebUI.click(findTestObject('Page_Qun l biu mu/span_Tao Moi'))

WebUI.verifyElementText(findTestObject('Page_To Template/label_Ten'), 'Tên')

WebUI.verifyElementText(findTestObject('Page_To Template/label_Mo ta'), 'Mô tả')

WebUI.verifyElementText(findTestObject('Page_To Template/label_Private Model'), 'Private Model')

WebUI.verifyElementText(findTestObject('Page_To Template/label_Public Model'), 'Public Model')

WebUI.verifyElementText(findTestObject('Page_To Template/h3_Du Lieu Telemetry'), 'DỮ LIỆU TELEMETRY')

WebUI.verifyElementText(findTestObject('Page_To Template/th_Ten'), 'Tên')

WebUI.verifyElementText(findTestObject('Page_To Template/th_Uom'), 'Uom')

WebUI.verifyElementText(findTestObject('Page_To Template/th_Loai'), 'Loại')

WebUI.verifyElementText(findTestObject('Page_To Template/th_Thao tac'), 'Thao tác')

WebUI.setText(findTestObject('Page_To Template/input_M t_description'), DescriptionTemplate)

WebUI.setText(findTestObject('Page_To Template/input_Ten_filter1'), TelemetryName1)

WebUI.delay(5)

WebUI.setText(findTestObject('Page_To Template/input_Uom_filter1'), TelemetryUom1)

WebUI.setText(findTestObject('Page_To Template/input_()_name'), TemplateName)

WebUI.click(findTestObject('Page_To Template/button_icon_Them_Telemetry'))

WebUI.click(findTestObject('Page_To Template/span_Luu'))

boolean elementLoiTemplateName = WebUI.waitForElementVisible(findTestObject('Page_To Template/span_Trng ny l bt buc'), 3)

if (elementLoiTemplateName == true) {
    String MaLoiThemTemplateName = WebUI.getText(findTestObject('Page_To Template/span_Trng ny l bt buc'), FailureHandling.STOP_ON_FAILURE)

    if (MaLoiThemTemplateName == 'Trường này là bắt buộc') {
        println('Trường này là bắt buộc')
    } else if (MaLoiThemTemplateName == 'Trường này không được vượt quá 255 ký tự') {
        println('Lỗi vượt quá 255 kí tự')
    } else if (MaLoiThemTemplateName == 'Ký tự đầu phải là chữ, chỉ chấp nhận các ký tự chữ, số và _ viết liền không dấu ') {
        println('Lỗi sai kí tự')
    } else {
        assert false : 'lỗi khác'
    }
} else {
    println('FTemplateName đúng định dạng và không báo lỗi')
}

boolean elementLoiTemplateDescription = false

elementLoiTemplateDescription = WebUI.waitForElementVisible(findTestObject('Page_To Template/span_loiDescription_Template'), 
    3)

WebUI.comment('loi element ' + elementLoiTemplateDescription)

if (elementLoiTemplateDescription == true) {
    String MaLoiThemTemplateDescription = WebUI.getText(findTestObject('Page_To Template/span_loiDescription_Template'), 
        FailureHandling.STOP_ON_FAILURE)

    if (MaLoiThemTemplateDescription == 'Trường này không được vượt quá 255 ký tự') {
        println('Lỗi vượt quá 255 kí tự')
    } else {
        assert false : 'lỗi khác'
    }
} else {
    println('Description đúng định dạng và không báo lỗi')
}

boolean elementLoiTelemetryName = WebUI.waitForElementVisible(findTestObject('Page_To Template/span_loiName telemetry'), 
    3)

if (elementLoiTelemetryName == true) {
    String MaLoiThemTelemetryName = WebUI.getText(findTestObject('Page_To Template/span_loiName telemetry'), FailureHandling.STOP_ON_FAILURE)

    if (MaLoiThemTelemetryName == 'Trường này là bắt buộc') {
        println('Trường này là bắt buộc')
    } else if (MaLoiThemTelemetryName == 'Trường này không được vượt quá 50 ký tự') {
        println('Lỗi vượt quá 50 kí tự')
    } else if (MaLoiThemTelemetryName == 'Key đã tồn tại') {
        println('LTên đã tồn tại')
    } else if (MaLoiThemTelemetryName == 'Ký tự đầu phải là chữ, chỉ chấp nhận các ký tự chữ, số và _ viết liền không dấu') {
        println('Lỗi sai kí tự')
    } else {
        assert false : 'lỗi khác'
    }
} else {
    println('Telemetry Name đúng định dạng và không báo lỗi')
}

boolean elementLoiTelemetryUom = false

elementLoiTelemetryUom = WebUI.waitForElementVisible(findTestObject('Page_To Template/span_loiUom telemetry'), 3)

// WebUI.getText(findTestObject('Page_To Template/span_loiUom telemetry'))
WebUI.comment('loi element' + elementLoiTelemetryUom)

if (elementLoiTelemetryUom == true) {
    String MaLoiThemTelemetryUom = WebUI.getText(findTestObject('Page_To Template/span_loiUom telemetry'), FailureHandling.STOP_ON_FAILURE)

    if (MaLoiThemTelemetryUom == 'Trường này không được vượt quá 50 ký tự') {
        println('Lỗi vượt quá 50 kí tự')
    } else {
        assert false : 'lỗi khác'
    }
} else {
    println('Telemetry Uom đúng định dạng và không báo lỗi')
}

WebUI.setText(findTestObject('Page_To Template/input_M t_description'), 't1')

WebUI.setText(findTestObject('Page_To Template/input_()_name'), 't1')

WebUI.setText(findTestObject('Page_To Template/input_Ten_filter1'), 'a1')

WebUI.click(findTestObject('Page_To Template/button_icon_Them_Telemetry'))

WebUI.setText(findTestObject('Page_To Template/input_TenTelemetry2'), 'a1')

WebUI.click(findTestObject('Page_To Template/button_icon_Them_Telemetry'))

elementLoiTelemetryName1 = WebUI.waitForElementVisible(findTestObject('Page_To Template/span_Key  ton tai'), 3)

if (elementLoiTelemetryName1 == true) {
    String MaLoiThemTelemetryName1 = WebUI.getText(findTestObject('Page_To Template/span_Key  ton tai'), FailureHandling.STOP_ON_FAILURE)

    if (MaLoiThemTelemetryName1 == 'Trường này là bắt buộc') {
        println('Trường này là bắt buộc')
    } else if (MaLoiThemTelemetryName1 == 'Trường này không được vượt quá 50 ký tự') {
        println('Lỗi vượt quá 50 kí tự')
    } else if (MaLoiThemTelemetryName1 == 'Key đã tồn tại') {
        println('Tên đã tồn tại')
    } else if (MaLoiThemTelemetryName1 == 'Ký tự đầu phải là chữ, chỉ chấp nhận các ký tự chữ, số và _ viết liền không dấu') {
        println('Lỗi sai kí tự')
    } else {
        assert false : 'lỗi khác'
    }
} else {
    println('Telemetry Name đúng định dạng và không báo lỗi')
}

