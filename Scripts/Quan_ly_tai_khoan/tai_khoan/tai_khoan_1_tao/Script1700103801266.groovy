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

WebUI.callTestCase(findTestCase('Quan_ly_tai_khoan/tai_khoan/xemds'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_VNPT IOT System/a_To mi (3)'))

WebUI.setText(findTestObject('Object Repository/Page_VNPT IOT System/input_Tn ng nhp()_user.accountName'), 'createacc')

WebUI.setText(findTestObject('Object Repository/Page_VNPT IOT System/input_H v tn()_user.fullName'), 'createacc')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_VNPT IOT System/input_Mt khu()_user.password'), 'FGqGPohAJxNfiZg7R0wNoQ==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_VNPT IOT System/input_Nhc li mt khu()_confirmPassword'), 'FGqGPohAJxNfiZg7R0wNoQ==')

WebUI.setText(findTestObject('Object Repository/Page_VNPT IOT System/input_Th in t()_user.email'), 'thanhnm@vnpt-technology.vn')

WebUI.setText(findTestObject('Object Repository/Page_VNPT IOT System/input_S in thoi ()_user.phone'), '046378432')

WebUI.click(findTestObject('Object Repository/Page_VNPT IOT System/a_Lu (5)'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_VNPT IOT System/div_Thm mi thnh cng (3)'), 'Thêm mới thành công !')

WebUI.closeBrowser()

