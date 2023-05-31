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
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions

// Set Chrome options for headless mode
ChromeOptions chromeOptions = new ChromeOptions()
chromeOptions.addArguments("--headless", "--disable-gpu")

// Set the Chrome driver executable path
System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\chromedriver.exe")

// Instantiate the ChromeDriver with headless options
ChromeDriver driver = new ChromeDriver(chromeOptions)
DriverFactory.getExecutedBrowser().getName()=='HEADLESS_DRIVER'
// Set the WebDriver instance in Katalon's DriverFactory
//DriverFactory.changeWebDriver(driver)
blob:https://web.whatsapp.com/94c77058-9e3a-4522-95d3-b647e28cd54d
try {
	// Open the browser and navigate to the desired URL
	WebUI.openBrowser('')

	WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

	WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Username_username'), 'Admin')

	WebUI.setEncryptedText(findTestObject('Object Repository/Page_OrangeHRM/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

	WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Login'))

	WebUI.click(findTestObject('Page_OrangeHRM/input_Password_password'))
} finally {
	// Close the browser
	WebUI.closeBrowser()
}

