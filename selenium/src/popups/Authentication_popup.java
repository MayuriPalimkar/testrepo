package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentication_popup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.Chrome.driver","C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		String text=driver.findElement(By.xpath("//p[contains(text(), 'Congratulations! You must have the proper credentials.')]")).getText();
		

		Thread.sleep(5000);
		System.out.println(text);
		
		driver.close();
	}

}
