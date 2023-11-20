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

WebUI.callTestCase(findTestCase('Quan_ly_sim/Quan_ly_hop_dong/xem_ds'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_VNPT IOT System/input_Tn khch hng_contractForm.customerName (1)'), 
    'Nguyễn Thị Mơ')

WebUI.setText(findTestObject('Object Repository/Page_VNPT IOT System/input_Ngi lm hp ng_contractForm.contractorInfo (1)'), 
    'Nguyễn Thị Mơ')

WebUI.setText(findTestObject('Object Repository/Page_VNPT IOT System/input_in thoi lin h_contractForm.contactPhone (1)'), 
    '84842013448')

WebUI.setText(findTestObject('Object Repository/Page_VNPT IOT System/input_M hp ng_contractForm.contractCode (1)'), 'VPC-LD/00112816')

WebUI.setText(findTestObject('Object Repository/Page_VNPT IOT System/input_M trung tm_contractForm.centerCode (1)'), '6')

WebUI.click(findTestObject('Object Repository/Page_VNPT IOT System/a_Tm kim (3)'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_VNPT IOT System/td_VPCDD00121781'), 'VPCDD00121781')

WebUI.closeBrowser()

