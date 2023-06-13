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

WebUI.click(findTestObject('Tambah anggota/Page_Menejemen Keuangan/a_Tambah Anggota'))

WebUI.setText(findTestObject('Tambah anggota/Page_Menejemen Keuangan/input_Nama Anggota_nama'), 'Rhoshandiatellyneshiaunneveshenkescianneshaimondrischlyndasaccarna erenquellenendrasamecashaunettethalemeicoleshiwhalhinive\'onchelleca undenesheaalausondrilynnejeanetrimyranaekuesaundrilynnezekeriakenv aunetradevonneyavondalatarneskcaevontaepreonkeinesceellaviavelzad awnefriendsettajessicannelesciajoyvaelloydietteyvettesparklenesceaund rieaquenttaekatilyaevea\'shauwneoraliaevaekizzieshiyjuanewandaleccian nereneitheliapreciousnesceverroneccaloveliatyronevekacarrionnehenriet taescecleonpatrarutheliacharsalynnmeokcamonaeloiesalynnecsiannemer ciadellesciaustillaparissalondonveshadenequamonecaalexetiozetiaquani aenglaundneshiafrancethosharomeshaunnehawaineakowethauandavern ellchishankcarlinaaddoneillesciachristondrafawndrealaotrelleoctavionne miariasarahtashabnequckagailenaxeteshiataharadaponsadeloriakoentesc acraigneckadellanierstellavonnemyiatangoneshiadianacorvettinagodtaw ndrashirlenescekilokoneyasharrontannamyantoniaaquinettesequioadauri lessiaquatandamerceddiamaebellecescajamesauwnneltomecapolotyoaj ohnyaetheodoradilcyana.')

WebUI.setText(findTestObject('Tambah anggota/Page_Menejemen Keuangan/input_Alamat_alamat'), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur ut lectus quis dolor dictum rhoncus non sed dolor. Nam dui ante, lobortis id gravida sit.')

WebUI.setText(findTestObject('Tambah anggota/Page_Menejemen Keuangan/input_Tanggal Lahir_date'), '12010300')

WebUI.click(findTestObject('Tambah anggota/Page_Menejemen Keuangan/button_Kirim'))

WebUI.closeBrowser()

