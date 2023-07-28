package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class reg_form {
	public static void main(String [] args) throws InterruptedException {
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		
        driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("Mayuri");
		
		driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("Palimkar");
		
		driver.findElement(By.xpath("//textarea[@class=\"form-control ng-pristine ng-untouched ng-valid\"]")).sendKeys("Parande nagar,Dighi");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("Palimkar@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type=\"tel\"]")).sendKeys("989012456");
		
		driver.findElement(By.xpath("//input[@value=\"FeMale\"]")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@value=\"Movies\"]")).click();
		
		
		driver.findElement(By.xpath("//div[@id=\"msdd\"]")).click();
		driver.findElement(By.xpath("//a[text()=\"English\"]")).click();
		driver.findElement(By.xpath("//input[@value=\"Movies\"]")).click();
		Thread.sleep(2000);
		
		WebElement Skills = driver.findElement(By.xpath("//select[@id =\"Skills\"]"));
		
		Select select1 = new Select(Skills);
		List<WebElement> skills1= select1.getOptions();
		System.out.println(skills1);
		
		System.out.println(skills1.size());
		
		for(int i =0; i< skills1.size();i++) {
			
		String skillsvalue=	skills1.get(i).getText();
		
		System.out.println(skillsvalue);
		
		if(skillsvalue.equals("APIs")) {
			skills1.get(i).click();
		}
		
		}
		
		
		driver.findElement(By.xpath("//span[@class=\"select2-selection select2-selection--single\"]")).click();
		List<WebElement> countries = driver.findElements(By.xpath("//ul[@id=\"select2-country-results\"]"));
		System.out.println(countries.size());
		
		for(int i =0; i< countries.size(); i++) {
			String countrynames=countries.get(i).getText();
			System.out.println(countrynames);
			
			if(countrynames.contains("India")) {
				countries.get(i).click();
			}
		}
		
		
		Thread.sleep(3000);
		
		
		
		
		
		
		
		Thread.sleep(5000);
		driver.close();
	}

}
