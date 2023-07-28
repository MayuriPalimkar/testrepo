package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("Mayuri");
		
		driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("Palimkar");
		
		driver.findElement(By.xpath("//textarea[@class=\"form-control ng-pristine ng-untouched ng-valid\"]")).sendKeys("Parande nagar,Dighi");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("Palimkar@gmail.com");
		
		driver.findElement(By.xpath("//input[@type=\"tel\"]")).sendKeys("989012456");
		
		driver.findElement(By.xpath("//input[@value=\"FeMale\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value=\"Movies\"]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@id=\"msdd\"]")).click();
		driver.findElement(By.xpath("//a[text()='English']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value=\"Movies\"]")).click();
		
		
		WebElement Skills = driver.findElement(By.xpath("//select[@id='Skills']"));
		
		//to get total size of the list
		
		Select s1 = new Select(Skills);
		List<WebElement> Listskills = s1.getOptions();
		System.out.println(Listskills.size());
		// to get all the skiils from list
		for(int i = 0; i< Listskills.size(); i++) {
			String skillvalues= Listskills.get(i).getText();
			System.out.println(skillvalues);
		
			if(skillvalues.equals("APIs")) {
				Listskills.get(i).click();
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(5000);
		driver.close();
	}

}
