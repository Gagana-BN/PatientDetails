package TestPractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

//import TestPom.Testcases.HomePageTestcases;

public class LoginTest123 {
	WebDriver driver;
	public LoginTest123(WebDriver ldriver)
	{
	this.driver=ldriver;
	}
	@FindBy(xpath="//input[@id='session_username']") WebElement uname;
	@FindBy(xpath="//input[@id='session_password']") WebElement pwd;
	@FindBy(xpath="//input[@id='signinbutton']") WebElement loginbutton;
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/nav[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/i[1]") WebElement Addbutton;
	@FindBy(xpath="//button[contains(text(),'Add New Patient')]") WebElement Addnewpatientbutton;
	@FindBy(xpath="//select[@id='patient_salutation']")
	@CacheLookup
	WebElement patientsalutation;
	@FindBy(xpath="//input[@id='patient_firstname']") WebElement FirstName;
	@FindBy(xpath="//input[@id='patient_middlename']") WebElement MiddleName;
	@FindBy(xpath="//input[@id='patient_lastname']") WebElement LastName;
	@FindBy(xpath="//input[@id='patient_mobilenumber']") WebElement MobileNumber;
	@FindBy(xpath="//input[@id='patient_secondarymobilenumber']") WebElement secondaryNumber;
	@FindBy(xpath="//input[@id='patient_email']") WebElement MailId;
	@FindBy(xpath="//label[contains(text(),'Female')]") WebElement Gender;
	@FindBy(id="patient_age") WebElement PatientAge;
	@FindBy(id="patient_age_month") WebElement BirthMonth;
	@FindBy(xpath="//select[@id='patient_primary_language']")
	@CacheLookup
	WebElement primarylanguage;
	@FindBy(xpath="//select[@id='patient_secondary_language']")
	@CacheLookup
	WebElement secondarylanguage;
	@FindBy(xpath="//select[@id='patient_patient_type_id']")
	@CacheLookup
	WebElement patienttype;
	
	
	@FindBy(id="search_pincode") WebElement Pincode;
	@FindBy(id="search_state") WebElement state;
	@FindBy(id="search_city") WebElement city;
	@FindBy(id="patient_occupation") WebElement occupation;
	@FindBy(id="patient_address_1") WebElement FirstAddress;
	@FindBy(id="patient_address_2") WebElement SecondAddress;
	@FindBy(id="patient_employee_id") WebElement EmployId;
	@FindBy(id="patient_other_identifier_mr_no") WebElement MedRec;
	@FindBy(id="patient_aadhar_card_number") WebElement AdharCard;
	@FindBy(id="patient_pan_number") WebElement pancard;
	@FindBy(id="patient_driving_license_number") WebElement DrivingLicence;
	@FindBy(id="patient_health_id_number") WebElement HealthId;
	@FindBy(xpath="//select[@id='patient_referral_type_referral_type_id']")
	@CacheLookup
	WebElement patientreferraltype;
	@FindBy(id="patient_patient_type_comment") WebElement pidcomment;
	
	
	@FindBy(xpath="//a[normalize-space()='Other Details']") WebElement otherdetailsTab;
	@FindBy(xpath="/html[1]/body[1]/div[23]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/div[5]/div[1]/label[1]") WebElement BloodGroup;
	@FindBy(xpath="//label[@for='maritalstatus_single']") WebElement Maritalstatus;
	@FindBy(xpath="//html[1]/body[1]/div[23]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/label[1]") WebElement oneeyed;
	@FindBy(xpath="//input[@id='patient_emergencycontactname']") WebElement EmergencyContactName;
	@FindBy(xpath="//input[@id='patient_emergencymobilenumber']") WebElement EmergencyContactNum;
	@FindBy(xpath="//button[normalize-space()='Breastfeeding']") WebElement SpecialStatus;
	@FindBy(xpath="//a[normalize-space()='History']") WebElement HistoryTab;
	@FindBy(xpath="//button[@id='speciality_histories_eye_disease']") WebElement OphthalmicHistory;
	
	
	@FindBy(xpath="//input[@id='patient_opthal_history_comment']") WebElement OphthalmicHistorycomment;
	@FindBy(xpath="//button[@id='personal_histories_thyroid_disorder']") WebElement SystemicHistory;
	@FindBy(xpath="//a[normalize-space()='Allergies']") WebElement AllergyyTab;
	
	@FindBy(xpath="//button[@id='drug_allergies_nsaids']") WebElement nsaidsallergies;
	@FindBy(xpath="//button[@id='nsaids_naproxen']") WebElement naproxenallergies;
	@FindBy(xpath="//button[@id='contact_allergies_transpore']") WebElement transporeallergies;
	@FindBy(xpath="//button[@id='food_allergies_lactose']") WebElement lactoseallergies;
	@FindBy(xpath="/html[1]/body[1]/div[23]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[4]/div[2]/input[1]") WebElement otherallergiess;
	
	@FindBy(xpath="/html[1]/body[1]/div[23]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[1]/input[1]") WebElement SystemicHistorycomment;
	@FindBy(xpath="//input[@id='patient_other_history_attributes_medical_history']") WebElement MedicalHistory;
	@FindBy(xpath="//input[@id='patient_other_history_attributes_family_history']") WebElement FamilyHistory;
	@FindBy(xpath="/html[1]/body[1]/div[23]/div[1]/div[1]/form[1]/div[2]/input[1]") WebElement createappointmentbutton;
public void loginToEhr(String usernameApp,String passwordApp) throws InterruptedException	
{
	try {
		Thread.sleep(8000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	uname.sendKeys(usernameApp);
	pwd.sendKeys(passwordApp);
	loginbutton.click();
	Thread.sleep(8000);
	Addbutton.click();	
	Thread.sleep(8000);
	Addnewpatientbutton.click();
}
public void NameField(String FirstnameApp,String MiddlenameApp,String LastNameApp)
{
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Select sel = new Select(patientsalutation);
	sel.selectByVisibleText("Mr.");
	FirstName.sendKeys(FirstnameApp);
	MiddleName.sendKeys(MiddlenameApp);
	LastName.sendKeys(LastNameApp);
}
public void ContactNUmber(String FirstnumberApp,String SecondaryNumberApp,String EmailIdApp ) throws InterruptedException
{
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	MobileNumber.sendKeys(FirstnumberApp);
	secondaryNumber.sendKeys(SecondaryNumberApp);
	MailId.sendKeys(EmailIdApp);
	Thread.sleep(8000);
	Gender.click();
}
public void PatientAgelangtype(String PatientAgeApp,String BirthMonthApp,String pidcommentApp)
{
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	PatientAge.sendKeys(PatientAgeApp);
	BirthMonth.sendKeys(BirthMonthApp);
	Select sel1 = new Select(primarylanguage);
	sel1.selectByVisibleText("English");
	Select sel2 = new Select(secondarylanguage);
	sel2.selectByVisibleText("Gujarati");
	Select sel4 = new Select(patienttype);
	sel4.selectByVisibleText("ECHS");
	pidcomment.sendKeys(pidcommentApp);
}
public void Address(String PincodeApp,String stateApp,String cityApp,String FirstAddressApp,String SecondAddressApp,String occupationApp,String EmployIDApp)
{
	Pincode.sendKeys(PincodeApp);	
	state.sendKeys(stateApp);
	city.sendKeys(cityApp);
	FirstAddress.sendKeys(FirstAddressApp);
	SecondAddress.sendKeys(SecondAddressApp);
	occupation.sendKeys(occupationApp);
	EmployId.sendKeys(EmployIDApp);
	
}
public void Record(String MedRecApp,String AdharCardApp,String pancardApp,String DrivingLicenceApp,String HealthIdApp)
{
	MedRec.sendKeys(MedRecApp);
	AdharCard.sendKeys(AdharCardApp);
	pancard.sendKeys(pancardApp);
	DrivingLicence.sendKeys(DrivingLicenceApp);
	HealthId.sendKeys(HealthIdApp);
	Select sel3 = new Select(patientreferraltype);
	sel3.selectByVisibleText("Self");
	otherdetailsTab.click();
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	BloodGroup.click();
	Maritalstatus.click();
	oneeyed.click();
}

public void EmerContactss(String EmergencyContactNameApp,String EmergencyContactNumApp)
{
	EmergencyContactName.sendKeys(EmergencyContactNameApp);
	EmergencyContactNum.sendKeys(EmergencyContactNumApp);
	SpecialStatus.click();
	HistoryTab.click();
}
public void OpthHistory(String OphthalmicHistorycommentApp)
{
	OphthalmicHistory.click();	
	
	OphthalmicHistorycomment.sendKeys(OphthalmicHistorycommentApp);
}
public void SystHistory(String SystemicHistoryApp)
{
	SystemicHistory.click();	
	SystemicHistorycomment.sendKeys(SystemicHistoryApp);
}

public void FamMedHisto(String MedicalHistoryAPP,String FamilyHistoryApp)
{
	MedicalHistory.sendKeys(MedicalHistoryAPP);
	FamilyHistory.sendKeys(FamilyHistoryApp);
	
	
}
public void Allergies(String OtherAllergy)
{
	AllergyyTab.click();
	nsaidsallergies.click();	
	naproxenallergies.click();
	transporeallergies.click();
	lactoseallergies.click();
	otherallergiess.sendKeys(OtherAllergy);	
	try {
		Thread.sleep(8000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	createappointmentbutton.click();
}

}