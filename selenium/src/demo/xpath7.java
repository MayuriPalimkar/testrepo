package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class xpath7 {
	public static void main(String [] args) throws InterruptedException {
		System.setProperty("Webdriver.Chrome.driver","C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/campaign/landing.php?");
        String title= driver.getTitle();
        System.out.println(title);
        
        
       driver.findElement(By.name("firstname")).sendKeys("Mayuri");
       driver.findElement(By.name("lastname")).sendKeys("Palimkar");
       Thread.sleep(2000);
     //  driver.findElement(By.name("reg_form_box")).click();
       driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("8626078177");
       driver.findElement(By.name("reg_passwd__")).sendKeys("8627abc");
       Thread.sleep(2000);
       
       WebElement day =  driver.findElement(By.id("day"));
       
       WebElement Month =  driver.findElement(By.name("birthday_month"));
       WebElement Year =  driver.findElement(By.name("birthday_year"));
       
       String DOB = "15/03/1995";
       String date []= DOB.split("/");
      
       listbox(day,date[0]);
       listbox(Month,date[1]);
       listbox(Year,date[2]);
       
       
       
       
    
        Thread.sleep(5000);
        driver.close();
        
}
	public static void listbox(WebElement element, String title) {
		
		Select s1 = new Select(element);
		s1.selectByVisibleText(title);
		
	}
}