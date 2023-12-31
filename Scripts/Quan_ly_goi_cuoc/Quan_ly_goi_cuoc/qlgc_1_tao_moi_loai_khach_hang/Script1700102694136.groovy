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

WebUI.callTestCase(findTestCase('Quan_ly_goi_cuoc/Quan_ly_goi_cuoc/list'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_VNPT IOT System/a_To mi (1) (1)'))

WebUI.setText(findTestObject('Object Repository/Page_VNPT IOT System/input_()_rate.planCode'), 'ratecust')

WebUI.setText(findTestObject('Object Repository/Page_VNPT IOT System/input_()_rate.dispatchCode'), 'ratecust')

WebUI.setText(findTestObject('Object Repository/Page_VNPT IOT System/input_()_rate.subFree (1)'), '100000')

WebUI.setText(findTestObject('Object Repository/Page_VNPT IOT System/input_()_rate.planName'), 'ratecust')

WebUI.setText(findTestObject('Object Repository/Page_VNPT IOT System/input_Dung lng min ph (MB) ()_rate.limitDataUsage (1)'), 
    '100000')

WebUI.click(findTestObject('Object Repository/Page_VNPT IOT System/div_()_selectize-input items not-full has-o_fa0bd5 (1)'))

WebUI.click(findTestObject('Object Repository/Page_VNPT IOT System/div_Khch hng (1)'))

WebUI.click(findTestObject('Object Repository/Page_VNPT IOT System/div_()_selectize-input items not-full has-o_fa0bd5_1 (1)'))

WebUI.click(findTestObject('Object Repository/Page_VNPT IOT System/div_H Ni (1)'))

WebUI.click(findTestObject('Object Repository/Page_VNPT IOT System/div_EVNHNI_C01EVNHNI_C02EVNHNI_C03EVNHNI_C0_62e982'))

WebUI.click(findTestObject('Object Repository/Page_VNPT IOT System/div_jvasia'))

WebUI.click(findTestObject('Object Repository/Page_VNPT IOT System/a_Lu (3)'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_VNPT IOT System/div_Thm mi thnh cng (1)'), 'Thêm mới thành công !')

WebUI.closeBrowser()

