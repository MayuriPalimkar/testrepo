package Listbox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mmt1 {
public static void main (String [] args) throws InterruptedException {
		
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/bus-tickets/");
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
        String CityToSelect = "Pune,Maharashtra";
		driver.findElement(By.id("fromCity")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder=\"From\"]")).sendKeys("pun");
		//Thread.sleep(3000);
		
		List <WebElement>citynames=driver.findElements(By.xpath("//div[@id=\"react-autowhatever-1\"]"));
		Thread.sleep(9000);
		System.out.println(citynames.size());
		Thread.sleep(5000);
		
		for(int i =0; i< citynames.size(); i++) {
			//String fromcity = citynames.get(i).getText();
			
			if(citynames.get(i).getText() .contains("Pune,Maharashtra")) {
				Thread.sleep(4000);
				citynames.get(i).click();
				break;
			}
			}
		
		
		
		Thread.sleep(5000);
		driver.close();
}
}