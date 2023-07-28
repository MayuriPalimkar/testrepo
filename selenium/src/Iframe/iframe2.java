package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class iframe2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
	/*	driver.switchTo().frame("singleframe");
		
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Automation");
		
		driver.switchTo().defaultContent();*/
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[text()=\"Iframe with in an Iframe\"]")).click();
		
		WebElement outerframe = driver.findElement(By.xpath("//div[@id=\"Multiple\"]/iframe"));
		
		driver.switchTo().frame(outerframe);
		
		String text = driver.findElement(By.xpath("//h5[text()=\"Nested iFrames\"]")).getText();
		System.out.println(text);
		
		//WebElement innerframe = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		WebElement innerframe = driver.findElement(By.xpath("//div[@class=\"iframe-container\"]/iframe"));
		
		driver.switchTo().frame(innerframe);
		
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Automation");
		
		driver.switchTo().parentFrame();
		
		System.out.println("outer frame-->"+text);
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()=\"Home\"]")).click();
		Thread.sleep(4000);
		driver.close();
		
		
		
		
		
		driver.close();
		
		
		

	}

}
