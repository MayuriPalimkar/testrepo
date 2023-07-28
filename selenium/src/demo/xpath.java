package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) {
       System.setProperty("Webdriver.Chrome.driver","C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/");
		
		driver.findElement(By.xpath("//input [@type = \"email\"]")).sendKeys("mayu@gmail.com");
		
		driver.close();


	}

}
