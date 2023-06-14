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
import com.github.javafaker.Faker as Faker

Faker faker = new Faker()

String name = faker.name().firstName()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://qatest.rimbahouse.com/login.php')

WebUI.setText(findTestObject('Object Repository/Cek Profil/Page_Admin Login/input_Selamat Datang Admin_username'), 'admin4')

WebUI.setEncryptedText(findTestObject('Object Repository/Cek Profil/Page_Admin Login/input_Selamat Datang Admin_password'), 
    'RAIVpflpDOg=')

WebUI.click(findTestObject('Object Repository/Cek Profil/Page_Admin Login/button_Login'))

WebUI.click(findTestObject('Object Repository/Cek Profil/Page_Menejemen Keuangan/span_rajarimba'))

WebUI.click(findTestObject('Object Repository/Cek Profil/Page_Menejemen Keuangan/a_Pengaturan'))

WebUI.setText(findTestObject('Object Repository/Cek Profil/Page_Menejemen Keuangan/input_Ganti Nama_name'), name)

WebUI.click(findTestObject('Object Repository/Cek Profil/Page_Menejemen Keuangan/button_Update'))

WebUI.delay(1)

WebUI.closeBrowser()

