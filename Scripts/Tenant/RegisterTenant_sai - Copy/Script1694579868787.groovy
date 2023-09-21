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

WebUI.click(findTestObject('Page_Login/a_Dang ky'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Trường này là bắt buộc', 'This field is required', 
    findTestObject('Page_Register/span_Loi Firt Name'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Trường này là bắt buộc', 'This field is required', 
    findTestObject('Page_Register/span_Loi Last name'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Trường này là bắt buộc', 'This field is required', 
    findTestObject('Page_Register/span_Loi Email'))

//String emailc2 = emailName
//String[] splEmail = emailc2.split("@")
//String username = splEmail[0]
//WebUI.comment("username="+ username)
WebUI.setText(findTestObject('Page_Register/input_First Name() _first_name'), firtName)

WebUI.setText(findTestObject('Page_Register/input_Last Name() _last_name'), lastName)

WebUI.setText(findTestObject('Page_Register/input_Email()_email'), emailName)

WebUI.setText(findTestObject('Page_Register/input_Phone_phone'), sdt)

WebUI.setText(findTestObject('Page_Register/input_Country_k-input ng-pristine ng-untouched ng-valid ng-not-empty'), country)

WebUI.sendKeys(findTestObject('Page_Register/input_Country_k-input ng-pristine ng-untouched ng-valid ng-not-empty'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('Page_Register/input_Company_resName'), company)

WebUI.setText(findTestObject('Page_Register/input_Tenant Name_contactName'), tenantName)

WebUI.check(findTestObject('Page_Register/input_Tenant Name_uk-checkbox'))

WebUI.click(findTestObject('Page_Register/span_SIGN UP'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Trường này không được vượt quá 255 ký tự', 
    'This field should have 255 characters or fewer', findTestObject('Page_Register/span_Loi Email'))

boolean elementLoiFirtName = WebUI.waitForElementVisible(findTestObject('Page_Register/span_Loi Firt Name'), 3)

if (elementLoiFirtName == true) {
    String loiFirstName = WebUI.getText(findTestObject('Page_Register/span_Loi Firt Name'), FailureHandling.STOP_ON_FAILURE)

    if (loiFirstName == 'This field must not include special characters') {
        println('Sai định dạng: chữ tiếng việt có dấu, kí tự đặc biệt, dấu cách')
    } else if (loiFirstName == 'This field should have 255 characters or fewer') {
        println('Lỗi vượt quá 255 ký tự')
    } else if (loiFirstName == 'This field is required') {
        println('thiếu trường bắt buộc')
    } else {
        assert false : 'lỗi khác'
    }
} else {
    println('FirtName đúng định dạng và không báo lỗi')
}

boolean elementLoiLastName = WebUI.waitForElementVisible(findTestObject('Page_Register/span_Loi Last name'), 3)

if (elementLoiLastName == true) {
    String loiLasttName = WebUI.getText(findTestObject('Page_Register/span_Loi Last name'), FailureHandling.STOP_ON_FAILURE)

    if (loiLasttName == 'This field must not include special characters') {
        println('Sai định dạng: chữ tiếng việt có dấu, kí tự đặc biệt, dấu cách')
    } else if (loiLasttName == 'This field should have 255 characters or fewer') {
        println('Lỗi vượt quá 255 ký tự')
    } else if (loiLasttName == 'This field is required') {
        println('thiếu trường bắt buộc')
    } else {
        assert false : 'lỗi khác'
    }
} else {
    println('LastName đúng định dạng và không báo lỗi')
}

boolean elementLoiEmail = WebUI.waitForElementVisible(findTestObject('Page_Register/span_Loi Email'), 3)

if (elementLoiEmail == true) {
    String loiEmail = WebUI.getText(findTestObject('Page_Register/span_Loi Email'), FailureHandling.STOP_ON_FAILURE)

    if (loiEmail == 'This field must be an email') {
        println('Sai định dạng email')
    } else if (loiEmail == 'This field should have 255 characters or fewer') {
        println('Lỗi vượt quá 255 ký tự')
    } else if (loiEmail == 'This field is required') {
        println('thiếu trường bắt buộc')
    } else {
        assert false : 'lỗi khác'
    }
} else {
    println('Email đúng định dạng và không báo lỗi')
}

boolean elementLoiPhone = WebUI.waitForElementVisible(findTestObject('Page_Register/span_Loi Phone'), 3)

WebUI.comment('loi element' + elementLoiPhone)

if (elementLoiPhone == true) {
    String loiPhone = WebUI.getText(findTestObject('Page_Register/span_Loi Phone'), FailureHandling.STOP_ON_FAILURE)

    if (loiPhone == 'This field must be a phone number') {
        println('Sai định dạng phone')
    } else {
        println('phone đúng định dạng')
    }
} else {
    println('phone đúng định dạng và không là trường bắt buộc')
}

boolean elementLoiTenantName = WebUI.waitForElementVisible(findTestObject('Page_Register/span_Loi Tenant Name'), 3)

if (elementLoiTenantName == true) {
    String loiTenantName = WebUI.getText(findTestObject('Page_Register/span_Loi Tenant Name'), FailureHandling.STOP_ON_FAILURE)

    if (loiTenantName == 'This field must not include special characters') {
        println('Sai định dạng Tenant Name')
    } else if (loiTenantName == 'This field should have 255 characters or fewer') {
        println('Lỗi vượt quá 255 ký tự')
    } else {
        assert false : 'lỗi khác'
    }
} else {
    println('Tenant Name đúng định dạng và không báo lỗi')
}

WebUI.closeBrowser()

