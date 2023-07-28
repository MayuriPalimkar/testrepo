package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload_popup {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.Chrome.driver","C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/upload");
		
		driver.findElement(By.xpath("//input[@id=\"file-upload\"]")).sendKeys("C:\\Users\\Mayuri\\Desktop\\employee.xlsx");
		
		Thread.sleep(4000);
		
		driver.findElement(By.id("file-submit")).click();
		
		Thread.sleep(3000);
		
		Boolean text=driver.findElement(By.xpath("//h3[contains(text(),'File Uploaded!')]")).isDisplayed();
		System.out.println(text);
		
		Thread.sleep(4000);
		driver.close();

	}

}
