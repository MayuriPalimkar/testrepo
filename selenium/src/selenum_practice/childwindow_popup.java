package selenum_practice;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.zeromq.ZStar.Set;

public class childwindow_popup {

	public static void main(String[] args) {
System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();  //to maximize the webpage /browser
		driver.get("https://demo.automationtesting.in/Windows.html");
		
		driver.findElement(By.xpath("(//a[@class=\"analystic\"])[2]")).click();
		
		driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
		
		String parentwindow=driver.getWindowHandle();
		System.out.println(parentwindow);
		
		Set<String>ids=driver.getWindowHandles();
		
		ArrayList<String> al = new ArrayList<String>(ids);
		
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		
		for(String childwindow : ids) {
			
			System.out.println("childwindow id="+childwindow);
			
			if(!parentwindow.equalsIgnoreCase(childwindow)) {
				driver.switchTo().window(childwindow);
				
				String text = driver.findElement(By.xpath("//h1[contains(text(),'Selenium automates browsers.')]")).getText();
				
				System.out.println(text);
				driver.close();
			}
			driver.switchTo().window(parentwindow);
			
			Boolean text=driver.findElement(By.xpath("//h1[text()='Automation Demo Site ']")).isDisplayed();
			System.out.println(text);
		}
	}

}
