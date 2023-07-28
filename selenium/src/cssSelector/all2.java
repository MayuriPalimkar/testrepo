package cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class all2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.facebook.com/campaign/landing.php");
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("mayuri");
		driver.findElement(By.name("lastname")).sendKeys("Palimkar");
		
		driver.findElement(By.name("reg_email__")).sendKeys("9834194368");
		driver.findElement(By.cssSelector("#password_step_input")).sendKeys("123456");
		
		WebElement day =driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.name("birthday_month"));
		WebElement year = driver.findElement(By.cssSelector("#year"));
		
		Select s1 = new Select(day);
		//System.out.println(s1.getOptions());
		s1.getOptions();
		s1.selectByIndex(3);
		
		Select s2 = new Select(month);
		s2.selectByVisibleText("Mar");
		
		Select s3 = new Select(year);
		s3.selectByValue("2019");
		
		driver.findElement(By.xpath("//input[@value=\"1\"]")).click();
		
		driver.findElement(By.xpath("(//button[text()=\"Sign Up\"])[1]")).click();
		
		
		Thread.sleep(4000);
		driver.close();
	}

}
