package locators_by_index;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo2 {

	public static void main(String [] args) throws InterruptedException {
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class= \"_2KpZ6l _2doB4z\"]")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//div[@class = \"xtXmba\"])[4]")).click();
		driver.findElement(By.xpath("(//div[@class = \"xtXmba\"])[10]")).click();
		
		Thread.sleep(5000);
		driver.close();
		
}
}