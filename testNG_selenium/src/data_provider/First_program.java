package data_provider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class First_program {

	WebDriver driver;
	@Test(dataProvider = "LoginData")
	public void setup(String uname, String pwd) {
		System.setProperty("Webdriver.Chrome.driver","C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement username =driver.findElement(By.name("username"));
		username.sendKeys(uname);
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys(pwd);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String exp_prof = "Paul Collings";
		boolean profile =driver.findElement(By.xpath("//p[text()=\"Paul Collings\"]")).isDisplayed();
		Assert.assertTrue(profile);
		driver.quit();
	}
	
	@DataProvider(name = "LoginData")
	public Object[][] LoginData(){
		Object data[][] = new Object[5][2];
		
		//correct uname correct pwd
		data[0][0]= "Admin";
		data[0][1] = "admin123";
				
				//correct uname incorrect pwd
		
		data[1][0]= "Admin";
		data[1][1] = "admin1234";
		
		//incorrect uname correct pass
		data[2][0]= "Admin12";
		data[2][1] = "admin123";
		
		//in uname and  inc pass
		data[3][0]= "Adminmn";
		data[3][1] = "admin12345";
		
		//empty unmae correct pass
		data[4][0]= "";
		data[4][1] = "admin123";
				
		return data;
		
	}
}
