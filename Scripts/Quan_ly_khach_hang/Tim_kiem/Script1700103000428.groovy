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

WebUI.callTestCase(findTestCase('Quan_ly_khach_hang/xem_danh_sach'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_VNPT IOT System/input_M khch hng_cusForm.customerCode'), 'HCMDD15422574')

WebUI.setText(findTestObject('Object Repository/Page_VNPT IOT System/input_Tn_cusForm.firstName'), 'Nguyễn Thị Hồng Như')

WebUI.setText(findTestObject('Object Repository/Page_VNPT IOT System/input_in thoi_cusForm.phone'), '84837013101')

WebUI.click(findTestObject('Object Repository/Page_VNPT IOT System/div_Loi'))

WebUI.click(findTestObject('Object Repository/Page_VNPT IOT System/div_Doanh nghip (1)'))

WebUI.click(findTestObject('Object Repository/Page_VNPT IOT System/div_Trng thi (1)'))

WebUI.click(findTestObject('Object Repository/Page_VNPT IOT System/div_Kch hot'))

WebUI.click(findTestObject('Object Repository/Page_VNPT IOT System/a_Tm kim (22)'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_VNPT IOT System/td_HCMDD15422574'), 'HCMDD15422574')

WebUI.closeBrowser()

