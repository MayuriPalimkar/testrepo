package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class regisration_form {
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
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type=\"tel\"]")).sendKeys("989012456");
		
		driver.findElement(By.xpath("//input[@value=\"FeMale\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value=\"Movies\"]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@id=\"msdd\"]")).click();
		driver.findElement(By.xpath("//a[text()='English']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value=\"Movies\"]")).click();
		
		WebElement year = driver.findElement(By.xpath("//select[@id='yearbox']"));
		WebElement month = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		WebElement day = driver.findElement(By.xpath("//select[@placeholder='Day']"));
		
		//to get the total size of the year
		
		Select s1 = new Select(year);
		List <WebElement>listyear=s1.getOptions();
		System.out.println("total years-->"+listyear.size());
		
		//to print all values from year listbox
		for (int i=1; i<listyear.size();i++) {
			String yearvalues=listyear.get(i).getText();
			System.out.print(" "+yearvalues);
		//to select value from the list	
			if(yearvalues.equals("1923")) {
				listyear.get(i).click();
			}
		}
		
		//to get  total size of month listbox
		Select s2 = new Select(month);
		List<WebElement> listmonths=s2.getOptions();
		System.out.println("Total months-->"+listmonths.size());
		
		// to print all the values from the list month
		
		for (int j = 1;j< listmonths.size(); j++) {
			String monthvalues= listmonths.get(j).getText();
			System.out.print(" "+monthvalues);
			Thread.sleep(2000);
			// to select specific value from the list
			
			if(monthvalues.equals("June")) {
				listmonths.get(j).click();
			}
			}
		
		//to get total size from day list
		Select s3 = new Select(day);
		List<WebElement>Listdays=s3.getOptions();
		System.out.println("total days-->"+Listdays.size());
		
		//to print all the values from list days
		
		for(int k=0; k< Listdays.size();k++) {
			String dayvalues=Listdays.get(k).getText();
			System.out.print(" "+dayvalues);
			
			//to select specific value from the list
			
			if(dayvalues.equals("19")) {
			Listdays.get(k).click();
			
			
			
			}
		}
		
		
		
		Thread.sleep(5000);
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
