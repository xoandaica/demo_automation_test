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

WebUI.callTestCase(findTestCase('dang_nhap_admin'), [:], FailureHandling.STOP_ON_FAILURE)

'Chọn sim'
WebUI.click(findTestObject('Object Repository/Page_VNPT IOT System/ins_Ngy sinh khch hng_iCheck-helper (2)'))

'Chọn sim\r\n'
WebUI.click(findTestObject('Object Repository/Page_VNPT IOT System/ins_PHB000-99_iCheck-helper (1)'))

'Chọn nút thiết lập nhóm'
WebUI.click(findTestObject('Object Repository/Page_VNPT IOT System/a_Thit lp nhm (1)'))

'Không chọn nhóm và lập tức nhấn nút thiết lập nhóm\r\n'
WebUI.click(findTestObject('Page_VNPT IOT System/a_Thit lp nhmdialog'))

'Xác nhận không thành công'
WebUI.verifyElementText(findTestObject('Object Repository/Page_VNPT IOT System/span_Bn cha chn nhm (1)'), 'Bạn chưa chọn nhóm !')

WebUI.closeBrowser()

