package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox4 {
	public static void main(String [] args) throws InterruptedException {
		System.setProperty("Webdriver.Chrome.driver","C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/campaign/landing.php");
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name = \"firstname\"]")).sendKeys("Mayuri");
		driver.findElement(By.xpath("//input[@name = \"lastname\"]")).sendKeys("Palimkar");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name = \"reg_email__\"]")).sendKeys("986532147");
		driver.findElement(By.xpath("//input[@id = \"password_step_input\"]")).sendKeys("123456");
		
		Thread.sleep(3000);
		
		WebElement day = driver.findElement(By.xpath("//select[@id = \"day\"]"));
		WebElement month = driver.findElement(By.xpath("//select[@id = \"month\"]"));
		WebElement year = driver.findElement(By.xpath("//select[@id = \"year\"]"));
		Thread.sleep(2000);
		//Question 1
		// how to get the total size of the list
		Select s1 = new Select(day);
		List<WebElement> Listday = s1.getOptions();
		System.out.println("Total days-->"+Listday.size());
		
		//Question 2 
		//how will you print all the values
		for (int i =1; i< Listday.size(); i++) {
			String dayvalues = Listday.get(i).getText();
			System.out.println(dayvalues);
		
			
			//question 3 
			//how to select specific value from the drpdown
			
			if(dayvalues.equals("14")) {
				Listday.get(i).click();
			}
		}
		Thread.sleep(1000);
		//how to get total size in the list
		Select s2 = new Select (month);
		List<WebElement> Listmonth = s2.getOptions();
		System.out.println("Total months-->"+Listmonth.size());
		 //how to print all the values from the list
		for(int j = 1; j< Listmonth.size(); j++) {
			String monthvalues = Listmonth.get(j).getText();
			System.out.println(monthvalues);
			
			//to select specific value from the list
			
			if (monthvalues.equals("May")) {
				Listmonth.get(j).click();
			}
		}
		
		Thread.sleep(1000);
		//get total size of the list
		Select s3 = new Select(year);
		List<WebElement> Listyear = s3.getOptions();
		System.out.println("Total years-->"+Listyear.size());
		
		//to print the values from year list
		for(int k=1; k< Listyear.size(); k++) {
			String yearvalues = Listyear.get(k).getText();
			System.out.print(" "+yearvalues);
			
			if(yearvalues.equals("2018")) {
				Listyear.get(k).click();
			}
		}
		
		Thread.sleep(7000);
		driver.close();
	}

}
