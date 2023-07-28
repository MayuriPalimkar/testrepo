package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_contains2 {
	
public static void main(String [] args) throws InterruptedException {
		
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		WebDriver driver = new ChromeDriver();
		
        driver.get("https://www.linkedin.com/login");
        
        driver.findElement(By.xpath("//a [contains(text(),'Join ')]")).click();
        
        driver.findElement(By.xpath("//input[@class = \"input__input\"]")).sendKeys("mayuri@gmail.com");
        
        driver.close();
}
}