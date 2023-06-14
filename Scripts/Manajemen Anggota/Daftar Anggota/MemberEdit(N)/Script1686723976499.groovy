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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://qatest.rimbahouse.com/login.php')

WebUI.setText(findTestObject('Object Repository/Cek Profil/Page_Admin Login/input_Selamat Datang Admin_username'), 'admin4')

WebUI.setEncryptedText(findTestObject('Object Repository/Cek Profil/Page_Admin Login/input_Selamat Datang Admin_password'), 
    'RAIVpflpDOg=')

WebUI.click(findTestObject('Object Repository/Cek Profil/Page_Admin Login/button_Login'))

WebUI.click(findTestObject('Tambah anggota/Page_Menejemen Keuangan/a_Manajemen Anggota'))

WebUI.click(findTestObject('Tambah anggota/Page_Menejemen Keuangan/a_Daftar Anggota'))

WebUI.click(findTestObject('Tambah anggota/Page_Menejemen Keuangan/button_Edit'))

WebUI.setText(findTestObject('Tambah anggota/Page_Menejemen Keuangan/input_Nama Anggota_nama'), 'Bayu sukma ayudinda')

WebUI.setText(findTestObject('Tambah anggota/Page_Menejemen Keuangan/input_Alamat_alamat'), 'Jl. Asia Afrika No.86, Braga, Kec. Regol, Kota Bandung, Jawa Barat 40251')

WebUI.setText(findTestObject('Tambah anggota/Page_Menejemen Keuangan/input_Tanggal Lahir_umur'), '25073000')

WebUI.click(findTestObject('Tambah anggota/Page_Menejemen Keuangan/button_Update'))

WebUI.getText(findTestObject('Tambah anggota/Page_Menejemen Keuangan/div_Mengedit Data Sukses'))

WebUI.closeBrowser()

