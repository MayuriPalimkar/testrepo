package Framewors;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orange_HRM_withDDF {

	public static void main(String[] args) {
System.setProperty("Wedriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		String name = "Paul Collings";
		
		String uname =driver.findElement(By.xpath("//p[@class=\"oxd-userdropdown-name\"]")).getText();
		
		if(name.equals(uname)) {
			System.out.println("log in successful");
		}
		else {
			System.out.println("Incorrect username or password");
		}

		driver.quit();
	}

}
