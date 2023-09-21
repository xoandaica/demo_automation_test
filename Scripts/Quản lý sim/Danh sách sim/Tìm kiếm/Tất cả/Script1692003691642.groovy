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

WebUI.callTestCase(findTestCase('Đăng nhập admin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_VNPT IOT System/input_S thu bao_simForm.msisdn (1)'), '841388228131')

WebUI.setText(findTestObject('Object Repository/Page_VNPT IOT System/input_S sim_simForm.msin (1)'), '1078025426')

WebUI.setText(findTestObject('Object Repository/Page_VNPT IOT System/input_IMSI_simForm.imsi'), '452021078025426')

WebUI.setText(findTestObject('Object Repository/Page_VNPT IOT System/input_M hp ng_simForm.contractCode (1)'), 'LAN-LD/00080106')

WebUI.setText(findTestObject('Object Repository/Page_VNPT IOT System/input_in thoi lin h_simForm.contactPhone (1)'), '01388218000')

WebUI.setText(findTestObject('Object Repository/Page_VNPT IOT System/input_Ngi lm hp ng_simForm.contractorInfo (1)'), 'LU HONG MING')

WebUI.setText(findTestObject('Object Repository/Page_VNPT IOT System/input_Ngy lm hp ng t_simForm.fromContractDate (1)'), 
    '16/05/2023')

WebUI.setText(findTestObject('Object Repository/Page_VNPT IOT System/input_Ngy lm hp ng n_simForm.toContractDate (1)'), 
    '16/05/2023')

WebUI.setText(findTestObject('Object Repository/Page_VNPT IOT System/input_Nhm SIM_simForm.simGroupName (2)'), '1000 SIM ĐỢT 2')

WebUI.click(findTestObject('Object Repository/Page_VNPT IOT System/a_Tm kim (2)'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_VNPT IOT System/td_348315'), '348315')

