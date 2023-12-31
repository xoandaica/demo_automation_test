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

WebUI.callTestCase(findTestCase('Quan_ly_tai_khoan/Quyen/xem_ds'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_VNPT IOT System/a_To mi (5)'))

WebUI.click(findTestObject('Object Repository/Page_VNPT IOT System/div_i tng'))

WebUI.click(findTestObject('Object Repository/Page_VNPT IOT System/div_n hng'))

WebUI.click(findTestObject('Object Repository/Page_VNPT IOT System/div_c quync quyn'))

WebUI.click(findTestObject('Object Repository/Page_VNPT IOT System/div_Chi tit'))

WebUI.click(findTestObject('Object Repository/Page_VNPT IOT System/a_Lu (10)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_VNPT IOT System/div_Thm mi thnh cng (4)'), 0)

WebUI.closeBrowser()

