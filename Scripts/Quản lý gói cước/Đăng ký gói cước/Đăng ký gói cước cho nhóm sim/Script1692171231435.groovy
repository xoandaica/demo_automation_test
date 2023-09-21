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

WebUI.callTestCase(findTestCase('Quản lý gói cước/Đăng ký gói cước/Xem danh sách'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_VNPT IOT System/a_ng k gi cc cho nhm SIM'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_VNPT IOT System/select_Nhm SIMNhm sim ca bplink21000 SIM T _2ac817'), 
    '1201', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_VNPT IOT System/select_Gi ccconanKH1conanTinh1conanTQ1Ez20 _c1d4d1'), 
    '902', true)

WebUI.click(findTestObject('Object Repository/Page_VNPT IOT System/a_Gn'))

WebUI.click(findTestObject('Object Repository/Page_VNPT IOT System/button_ng (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_VNPT IOT System/div_Thay i gi cc khng thnh cng'), 'Thay đổi gói cước không thành công !')

WebUI.click(findTestObject('Object Repository/Page_VNPT IOT System/button_Hy b_uk-modal-close uk-close'))

WebUI.closeBrowser()

