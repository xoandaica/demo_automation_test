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

WebUI.click(findTestObject('Object Repository/Page_VNPT IOT System/a_Lch s thu bao (2) (1) (1)'))

WebUI.navigateToUrl('http://10.15.12.243/HistorySimAction')

WebUI.setText(findTestObject('Object Repository/Page_VNPT IOT System/input_S thu bao_historySimForm.msisdn (2) (1) (1)'), 
    '84842085834')

WebUI.setText(findTestObject('Object Repository/Page_VNPT IOT System/input_Khch hng_historySimForm.customerName (2) (1) (1)'), 
    'Trung Tâm Điều Độ Hệ Thống Điện Thành Phố Hà Nội')

WebUI.setText(findTestObject('Object Repository/Page_VNPT IOT System/input_n ngy_historySimForm.toDate (2) (1) (1)'), '26/06/2023')

WebUI.setText(findTestObject('Object Repository/Page_VNPT IOT System/input_T ngy_historySimForm.fromDate (2) (1) (1)'), 
    '26/06/2023')

WebUI.click(findTestObject('Object Repository/Page_VNPT IOT System/a_Tm kim (11) (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_VNPT IOT System/td_26062023 100000 (2) (1) (1)'), '26/06/2023 10:00:00', 
    FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Page_VNPT IOT System/td_84842085834 (1) (1)'), '84842085834')

WebUI.verifyElementText(findTestObject('Object Repository/Page_VNPT IOT System/td_Trung Tm iu  H Thng in Thnh Ph H Ni (2) (1) (1)'), 
    'Trung Tâm Điều Độ Hệ Thống Điện Thành Phố Hà Nội')

WebUI.closeBrowser()

