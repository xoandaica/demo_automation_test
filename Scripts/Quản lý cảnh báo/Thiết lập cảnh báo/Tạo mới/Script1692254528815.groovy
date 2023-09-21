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

WebUI.callTestCase(findTestCase('Quản lý cảnh báo/Thiết lập cảnh báo/Xem danh sách'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_VNPT IOT System/a_To mi (2)'))

WebUI.setText(findTestObject('Object Repository/Page_VNPT IOT System/input__alert.name'), 'testalert')

WebUI.click(findTestObject('Object Repository/Page_VNPT IOT System/div_Nhm SIMNhm SIM2131232131234354435345ngh_048616'))

WebUI.click(findTestObject('Object Repository/Page_VNPT IOT System/div_213123213123'))

WebUI.setText(findTestObject('Object Repository/Page_VNPT IOT System/input_Gi ti_alert.emailReceive'), 'testalert@testalert.testalert')

WebUI.setText(findTestObject('Object Repository/Page_VNPT IOT System/input_Ch _alert.emailSubject'), 'testalert')

WebUI.setText(findTestObject('Object Repository/Page_VNPT IOT System/textarea_Ni dung_alert.emailContent'), 'testalert')

WebUI.click(findTestObject('Object Repository/Page_VNPT IOT System/a_Lu (4)'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_VNPT IOT System/div_Thm mi thnh cng (2)'), 'Thêm mới thành công !')

WebUI.closeBrowser()

