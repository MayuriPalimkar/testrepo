package popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowbrowserpopup {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.Chrome.driver","C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Windows.html");
		
		driver.findElement(By.xpath("//a[contains(text(),'Open New Seperate Windows')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick=\"newwindow()\"]")).click();
		
		String parentwindow=driver.getWindowHandle();
		System.out.println(parentwindow);
		
		
		Set<String> childwindows=driver.getWindowHandles();
		
		for(String childwindow : childwindows) {
			System.out.println("childwindow id-->"+childwindow);
			
			if(!parentwindow.equalsIgnoreCase(childwindow)) {
				driver.switchTo().window(childwindow);
				String text=driver.findElement(By.xpath("//h1[contains(text(),'Selenium automates browsers.')]")).getText();
				System.out.println(text);
				driver.close();
			}
		}
		driver.switchTo().window(parentwindow);
		Boolean data=driver.findElement(By.xpath("//h1[text()=\"Automation Demo Site \"]")).isDisplayed();
		System.out.println(data);
		
		Thread.sleep(3000);
		driver.close();
		
		
		
		
		
		
		
		Thread.sleep(4000);
		
	}

}
