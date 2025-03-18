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

WebUI.openBrowser('https://practice.automationtesting.in/my-account/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/TC05-Script Mode ELement/Page_My Account  Automation Practice Site/input__email'), 
    't33789an@gmail.com')

WebUI.setText(findTestObject('Object Repository/TC05-Script Mode ELement/Page_My Account  Automation Practice Site/input__password'), 
    'hangminhan')

WebUI.click(findTestObject('Object Repository/TC05-Script Mode ELement/Page_My Account  Automation Practice Site/input_Anti-spam_register'))

WebUI.verifyElementText(findTestObject('Object Repository/TC05-Script Mode ELement/Page_My Account  Automation Practice Site/strong_minhanmai'), 
    't33789an')

WebUI.click(findTestObject('Object Repository/TC05-Script Mode ELement/Page_My Account  Automation Practice Site/a_Sign out'))

WebUI.closeBrowser()

