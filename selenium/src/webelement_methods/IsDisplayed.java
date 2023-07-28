package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String [] args) throws InterruptedException {
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/register");
		
		WebElement input = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		System.out.println(input.isDisplayed());
		
		WebElement input1 = driver.findElement(By.xpath("//h1[text()='Register']"));
		System.out.println(input1.isDisplayed());
		
		driver.quit();
		
}
}