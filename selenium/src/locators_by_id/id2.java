package locators_by_id;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class id2 {

	public static void main(String [] args) throws InterruptedException {
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		String title = driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type =\"text\"]")).sendKeys("Mayuri");
		driver.findElement(By.xpath("//input[@placeholder =\"Last Name\"]")).sendKeys("palimkar");
		driver.findElement(By.xpath("//textarea [@rows = \"3\"]")).sendKeys("dighi,pune");
		
		driver.findElement(By.xpath("//input [contains(@class,\"form-control ng-pristine ng-untouched "
				+ "ng-valid-email ng-invalid ng-invalid-required\")]")).sendKeys("mayuri@gmail.com");
		driver.findElement(By.xpath("//input [@ng-model=\"Phone\"]")).sendKeys("8626078177");
		driver.findElement(By.xpath("//input [contains(@value,\"FeMal\")]")).click();
		driver.findElement(By.xpath("//input [contains(@value,\"Mov\")]")).click();
		//driver.findElement(By.xpath("//div [@id = \"msdd\"]")).click();
		//driver.findElement(By.xpath("//a[text()=\"English\"]")).click();
		//driver.findElement(By.xpath("//label[text()=\"Languages\"]")).click();
		driver.findElement(By.xpath("//select[@type=\"text\"]")).click();
		driver.findElement(By.id("countries")).click();
		driver.findElement(By.xpath("//span[@tabindex=\"-1\"]")).click();
		driver.findElement(By.xpath("//li[text()=\"India\"]")).click();
		driver.findElement(By.xpath("//select[@id=\"yearbox\"]")).click();
		driver.findElement(By.id("firstpassword")).sendKeys("mayuri123");
		driver.findElement(By.id("secondpassword")).sendKeys("mayuri123");
		driver.findElement(By.id("submitbtn")).click();
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(6000);
		driver.close();
		
		
		
}
}