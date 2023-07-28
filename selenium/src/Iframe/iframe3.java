package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/frames");
		
		Thread.sleep(4000);
		//driver.switchTo().frame("frame1Wrapper");
		
		driver.switchTo().frame("frame1");
		
		WebElement text=driver.findElement(By.xpath("//h1[@id=\"sampleHeading\"]"));
        String text1 =text.getText();
        System.out.println(text1);
        Thread.sleep(6000);
        
        driver.switchTo().defaultContent();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//div[@class=\"header-wrapper\"]")).click();
        
        Thread.sleep(4000);
        driver.close();
        
        
		
        
		
		
	}

}
