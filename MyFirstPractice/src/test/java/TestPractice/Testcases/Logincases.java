package TestPractice.Testcases;

import org.apache.commons.math3.analysis.function.Log1p;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import TestPractice.utilities.ExcelData;
import TestPractice.pages.BaseClass;
import TestPractice.pages.LoginTest123;
import TestPractice.utilities.BrowserFactory;

public class Logincases extends BaseClass{
	
	
	
	
@Test
public void LoginApp() throws InterruptedException
{
	Logger log = Logger.getLogger(Log1p.class);
	logger=report.createTest("Login to EHR");
	ExcelData excel=new ExcelData();
	LoginTest123 LoginTest123=PageFactory.initElements(driver, LoginTest123.class);
	logger.info("starting application");
	LoginTest123.loginToEhr(excel.getStringData("Sheet1", 0, 0), excel.getStringData("Sheet1", 0, 1));
	logger.info("username and password entered");
	LoginTest123.NameField(excel.getStringData("Sheet1", 0, 2), excel.getStringData("Sheet1", 0, 3), excel.getStringData("Sheet1", 0, 4));
	logger.info("Patient name is filled");
	LoginTest123.ContactNUmber("8660387412", "9902109662",excel.getStringData("Sheet1", 0, 7));
	logger.info("contact number field is filled");
	LoginTest123.PatientAgelangtype("22", "2","Patient Id");
	logger.info("Age field is filled");
	LoginTest123.Address("573215", excel.getStringData("Sheet1", 0, 11), excel.getStringData("Sheet1", 0, 12), excel.getStringData("Sheet1", 0, 13), excel.getStringData("Sheet1", 0, 14), excel.getStringData("Sheet1", 0, 15), excel.getStringData("Sheet1", 0, 16));
	logger.info("Address field is filled");
	LoginTest123.Record("88mrn22o11", "77666666666", "99999999", excel.getStringData("Sheet1", 0, 20), excel.getStringData("Sheet1", 0, 21));
	logger.info("Mrno and other ID proofs card number filled");
	LoginTest123.EmerContactss("Niranj", "990877777");
	logger.info("Emergency contact field is filled");
	LoginTest123.OpthHistory(excel.getStringData("Sheet1", 0, 24));
	logger.info("opthalmic history is selected and comments were added");
	LoginTest123.SystHistory(excel.getStringData("Sheet1", 0, 25));
	logger.info("systemic history is selected and comments were added");
	LoginTest123.FamMedHisto(excel.getStringData("Sheet1", 0, 26), excel.getStringData("Sheet1", 0, 27));
	logger.info("Family and medical history fields were filled");
	LoginTest123.Allergies("other allergies");
	logger.info("Allergies were captured");
	logger.info("succesfully created patient");
}

}
