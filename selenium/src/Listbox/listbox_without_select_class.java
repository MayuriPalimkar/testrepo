package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class listbox_without_select_class {
	
	static  WebDriver driver;
	
	public static void main(String [] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Mayuri");
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("palimkar");
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("palimkar@gmail.com");
		driver.findElement(By.xpath("//input[@name=\"reg_email_confirmation__\"]")).sendKeys("palimkar@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"password_step_input\"]")).sendKeys("12345678");
		//Thread.sleep(2000);
		
		String day = "//select[@id=\"day\"]/option";
		String month = "//select[@id=\"month\"]/option";
		String year = "//select[@id=\"year\"]/option";
		Thread.sleep(3000);
		String DOB = "15-Jun-2019";
		String Date[]= DOB.split("-");
		//Date[0] =15
		//Date[1] = Jun
		//Date[2] = 2019
		
		dropdown(day,Date[0]);
		dropdown(month,Date[1]);
		dropdown(year,Date[2]);
		
		
		
		Thread.sleep(5000);
		driver.close();
		
		
	}

	public static void dropdown(String element,String values) {
		List <WebElement> V1 = driver.findElements(By.xpath(element));
		//List <WebElement> V2 = driver.findElements(By.xpath(month));
		//List <WebElement> V3 = driver.findElements(By.xpath(year));
		System.out.println(V1);
		System.out.println(V1.size());
		
		for(int i =0; i< V1.size(); i++) {
			System.out.println(V1.get(i).getText());
			
			if(V1.get(i).getText().equals(values)){
				//System.out.println(V1.get(i).getText());
				V1.get(i).click();
			}
			
		}
	}
	
	
	
	
}
