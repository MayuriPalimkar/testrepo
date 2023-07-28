package Com.Ecommerce.TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Com.Ecommerce.BaseClass.Ecommerce_BaseClass;
import Com.Ecommerce.PageClasses.TC_newRegistration;



public class TC_newRegistrationTestCases extends  Ecommerce_BaseClass {
	// WebDriver driver;
	@Test
	public void Test() {
	TC_newRegistration TNR = new TC_newRegistration( driver);

	TNR.newReg();
	TNR.selectGender();
	
	TNR.fname("Mahesh");
	
	TNR.lname("Palimkar");
	
	TNR.email("mayuripalimkar@gmail.com");
	
	TNR.pass("mayuri153");
	
	TNR.cpass("mayuri153");
	
	TNR.button();
	
	TNR.verify();
	
	
}
}