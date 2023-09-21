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

checkButtonXoa = WebUI.getAttribute(findTestObject('Page_Qun l biu mu/span_Xoa'), 'class')

WebUI.comment('Giá trị attribute: ' + checkButtonXoa)

if (checkButtonXoa.contains('hideElement')) {
    println('Button disnabled')
} else {
    assert false : 'Button is enabled'
}

WebUI.click(findTestObject('Page_Qun l biu mu/ins_Checkbox1'))

checkButtonXoa = WebUI.getAttribute(findTestObject('Page_Qun l biu mu/span_Xoa'), 'class')

WebUI.comment('Giá trị attribute: ' + checkButtonXoa)

if (checkButtonXoa.contains('hideElement')) {
    assert false : 'Button is disnabled'
} else {
    println('Button enabled')
}

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('XÓA', 'DELETE', findTestObject('Page_Qun l biu mu/span_Xoa'))

WebUI.click(findTestObject('Page_Qun l biu mu/span_Xoa'))

WebUI.waitForElementPresent(findTestObject('Page_Qun l biu mu/div_Ban co chac chan muon xoa khong'), 2)

WebUI.click(findTestObject('Page_Qun l biu mu/button_Khong'))

WebUI.waitForElementNotPresent(findTestObject('Page_Qun l biu mu/div_Ban co chac chan muon xoa khong'), 2)

WebUI.setText(findTestObject('Page_Qun l biu mu/input_Ten_Filter'), TemplateName)

WebUI.sendKeys(findTestObject('Page_Qun l biu mu/input_Ten_Filter'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_Qun l biu mu/ins_CheckboxFull'))

WebUI.click(findTestObject('Page_Qun l biu mu/span_Xoa'))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Bạn có chắc chắn muốn xóa không?', 'Are you sure you want to delete?', 
    findTestObject('Page_Qun l biu mu/div_Ban co chac chan muon xoa khong'))

WebUI.click(findTestObject('Page_Qun l biu mu/button_Co'))

WebUI.setText(findTestObject('Page_Qun l biu mu/input_Ten_Filter'), TemplateName)

WebUI.sendKeys(findTestObject('Page_Qun l biu mu/input_Ten_Filter'), Keys.chord(Keys.ENTER))

CustomKeywords.'verifyElementPresendNTM.verifyElementPresendNTM1.checkAnhViet'('Không có dữ liệu nào được tìm thấy', 'There are no items to display', 
    findTestObject('Page_Qun l biu mu/span_Khng c d liu no c tm thy'))

