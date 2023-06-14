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
import java.util.Random as Random
import java.util.Date as Date

Random random = new Random()

int randomNumber = random.nextInt(500000) + 20000

Date today = new Date()

String todayDate = today.format('ddMMyyyy')

WebUI.openBrowser('')

WebUI.navigateToUrl('https://qatest.rimbahouse.com/login.php')

WebUI.setText(findTestObject('Object Repository/Cek Profil/Page_Admin Login/input_Selamat Datang Admin_username'), 'admin4')

WebUI.setEncryptedText(findTestObject('Object Repository/Cek Profil/Page_Admin Login/input_Selamat Datang Admin_password'), 
    'RAIVpflpDOg=')

WebUI.click(findTestObject('Object Repository/Cek Profil/Page_Admin Login/button_Login'))

WebUI.click(findTestObject('Keuangan/Page_Menejemen Keuangan/a_Manajemen Keuangan'))

WebUI.click(findTestObject('Keuangan/Page_Menejemen Keuangan/a_Daftar Kas'))

WebUI.click(findTestObject('Tambah anggota/Page_Menejemen Keuangan/button_Edit'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Keuangan/Page_Menejemen Keuangan/input_Jumlah_jumlah'), randomNumber.toString())

WebUI.setText(findTestObject('Keuangan/Page_Menejemen Keuangan/input_Tanggal Setor_tanggal'), todayDate)

WebUI.click(findTestObject('Tambah anggota/Page_Menejemen Keuangan/button_Update'))

WebUI.getText(findTestObject('Tambah anggota/Page_Menejemen Keuangan/div_Mengedit Data Sukses'))

WebUI.closeBrowser()

