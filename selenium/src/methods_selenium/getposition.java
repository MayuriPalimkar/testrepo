package methods_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getposition {
	
    public static void main(String[] args) throws InterruptedException {
    	
    	System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
    	
    	WebDriver driver = new ChromeDriver();
    	
         Thread.sleep(4000);
    	
    	driver.manage().window().maximize();
    	
    	driver.get("https://www.amazon.in/");
    	
    	Thread.sleep(3000);
    	
    	System.out.println("driver.manage().window().getPosition()");
    	
    	driver.close();
	
}
}
