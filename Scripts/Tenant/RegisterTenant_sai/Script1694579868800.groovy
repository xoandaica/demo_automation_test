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

WebUI.check(findTestObject('Page_Register/input_Tenant Name_uk-checkbox'))

WebUI.click(findTestObject('Page_Register/span_SIGN UP'))

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

WebUI.click(findTestObject('Page_Register/span_SIGN UP'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Email đã được sử dụng !', 'Email already in use !', 
    findTestObject('Page_Register/span_Loi Email'))

WebUI.setText(findTestObject('Page_Register/input_Email()_email'), '123abcde')

WebUI.click(findTestObject('Page_Register/span_SIGN UP'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Trường này bắt buộc phải là email', 'This field must be an email', 
    findTestObject('Page_Register/span_Loi Email'))

WebUI.setText(findTestObject('Page_Register/input_Email()_email'), 'men 123@gmail.com')

WebUI.click(findTestObject('Page_Register/span_SIGN UP'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Trường này bắt buộc phải là email', 'This field must be an email', 
    findTestObject('Page_Register/span_Loi Email'))

WebUI.setText(findTestObject('Page_Register/input_Email()_email'), 'jsdrfgesuykgfkdsgfkjdsfghkdjshkgdhfgdfhdfhfghgfgfghdjsdrfgesuykgfkdsgfkjdsfghkdjshkgdhfgdfhdfhfghgfgfghdjsdrfgesuykgfkdsgfkjdsfghkdjshkgdhfgdfhdfhfghgfgfghdjsdrfgesuykgfkdsgfkjdsfghkdjshkgdhfgdfhdfhfghgfgfghdjsdrfgesuykgfkdsgfkjdsfghkdjshkgdhfgdh@gmail.com')

WebUI.click(findTestObject('Page_Register/span_SIGN UP'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Trường này không được vượt quá 255 ký tự', 
    'This field should have 255 characters or fewer', findTestObject('Page_Register/span_Loi Email'))

WebUI.setText(findTestObject('Page_Register/input_First Name() _first_name'), 'm!@#$%^&*()-=+`~\\/><.,;\'":?')

WebUI.setText(findTestObject('Page_Register/input_Last Name() _last_name'), 'm!@#$%^&*()-=+`~\\/><.,;\'":?')

WebUI.setText(findTestObject('Page_Register/input_Phone_phone'), 'rthdffgg')

WebUI.setText(findTestObject('Page_Register/input_Company_resName'), '5GHF%$&&)&)@')

WebUI.setText(findTestObject('Page_Register/input_Tenant Name_contactName'), '5GHF%$&&)&)@')

WebUI.click(findTestObject('Page_Register/span_SIGN UP'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Trường này không được bao gồm kí tự đặc biệt', 
    'This field must not include special characters', findTestObject('Page_Register/span_Loi Firt Name'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Trường này không được bao gồm kí tự đặc biệt', 
    'This field must not include special characters', findTestObject('Page_Register/span_Loi Last name'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Trường này bắt buộc phải là số điện thoại', 
    'This field must be a phone number', findTestObject('Page_Register/span_Loi Phone'))

WebUI.waitForElementNotPresent(findTestObject('Page_Register/span_loiCompany1'), 3)

WebUI.waitForElementNotPresent(findTestObject('Page_Register/span_Loi Tenant Name'), 3)

WebUI.setText(findTestObject('Page_Register/input_First Name() _first_name'), 'jsdrfgesuykgfkdsgfkjdsfghkdjshkgdhfgdfhdfhfghgfgfghdjsdrfgesuykgfkdsgfkjdsfghkdjshkgdhfgdfhdfhfghgfgfghdjsdrfgesuykgfkdsgfkjdsfghkdjshkgdhfgdfhdfhfghgfgfghdjsdrfgesuykgfkdsgfkjdsfghkdjshkgdhfgdfhdfhfghgfgfghdjsdrfgesuykgfkdsgfkjdsfghkdjshkgdhfgddgfdgdgdfsf')

WebUI.setText(findTestObject('Page_Register/input_Last Name() _last_name'), 'jsdrfgesuykgfkdsgfkjdsfghkdjshkgdhfgdfhdfhfghgfgfghdjsdrfgesuykgfkdsgfkjdsfghkdjshkgdhfgdfhdfhfghgfgfghdjsdrfgesuykgfkdsgfkjdsfghkdjshkgdhfgdfhdfhfghgfgfghdjsdrfgesuykgfkdsgfkjdsfghkdjshkgdhfgdfhdfhfghgfgfghdjsdrfgesuykgfkdsgfkjdsfghkdjshkgdhfgddgfdgdgdfsf')

WebUI.setText(findTestObject('Page_Register/input_Phone_phone'), '358670436856745867455')

WebUI.setText(findTestObject('Page_Register/input_Company_resName'), 'jsdrfgesuykgfkdsgfkjdsfghkdjshkgdhfgdfhdfhfghgfgfghdjsdrfgesuykgfkdsgfkjdsfghkdjshkgdhfgdfhdfhfghgfgfghdjsdrfgesuykgfkdsgfkjdsfghkdjshkgdhfgdfhdfhfghgfgfghdjsdrfgesuykgfkdsgfkjdsfghkdjshkgdhfgdfhdfhfghgfgfghdjsdrfgesuykgfkdsgfkjdsfghkdjshkgdhfgddgfdgdgdfsf')

WebUI.setText(findTestObject('Page_Register/input_Tenant Name_contactName'), 'jsdrfgesuykgfkdsgfkjdsfghkdjshkgdhfgdfhdfhfghgfgfghdjsdrfgesuykgfkdsgfkjdsfghkdjshkgdhfgdfhdfhfghgfgfghdjsdrfgesuykgfkdsgfkjdsfghkdjshkgdhfgdfhdfhfghgfgfghdjsdrfgesuykgfkdsgfkjdsfghkdjshkgdhfgdfhdfhfghgfgfghdjsdrfgesuykgfkdsgfkjdsfghkdjshkgdhfgddgfdgdgdfsf')

WebUI.click(findTestObject('Page_Register/span_SIGN UP'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Trường này không được vượt quá 255 ký tự', 
    'This field should have 255 characters or fewer', findTestObject('Page_Register/span_Loi Firt Name'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Trường này không được vượt quá 255 ký tự', 
    'This field should have 255 characters or fewer', findTestObject('Page_Register/span_Loi Last name'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Trường này không được vượt quá 20 ký tự', 
    'This field should have 20 characters or fewer', findTestObject('Page_Register/span_Loi Phone'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Trường này không được vượt quá 255 ký tự', 
    'This field should have 255 characters or fewer', findTestObject('Page_Register/span_loiCompany1'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Trường này không được vượt quá 255 ký tự', 
    'This field should have 255 characters or fewer', findTestObject('Page_Register/span_Loi Tenant Name'))

WebUI.setText(findTestObject('Page_Register/input_Phone_phone'), '1232%((&*')

WebUI.click(findTestObject('Page_Register/span_SIGN UP'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Trường này bắt buộc phải là số điện thoại', 
    'This field must be a phone number', findTestObject('Page_Register/span_Loi Phone'))

WebUI.closeBrowser()

