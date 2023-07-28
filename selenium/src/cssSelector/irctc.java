package cssSelector;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class irctc {
	public static void main(String [] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.irctc.co.in/nget/profile/user-registration");
		Thread.sleep(4000);
		
		driver.findElement(By.id("userName")).sendKeys("Mayuri");
		driver.findElement(By.name("usrPwd")).sendKeys("1234567891Ma");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id=\"cnfUsrPwd\"]")).sendKeys("1234567891Ma");
		Thread.sleep(2000);
		//driver.findElement(By.)
		driver.findElement(By.xpath("//div[@class=\"ng-tns-c65-17 ui-dropdown ui-widget ui-state-default ui-corner-all\"]")).click();
		Thread.sleep(3000);
		List<WebElement> listq = driver.findElements(By.xpath("//div[@class=\"ui-dropdown-items-wrapper ng-tns-c65-17\"]"));
		Thread.sleep(2000);
		System.out.println("total q-->"+listq.size());
		
		Thread.sleep(3000);
		driver.close();
		

}
}