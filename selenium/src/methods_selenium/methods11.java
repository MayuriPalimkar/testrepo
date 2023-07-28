
 
package methods_selenium;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class methods11 {

	public static void main(String[] args) throws InterruptedException {
		
     System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
     WebDriver driver = new ChromeDriver();
     
     driver.get("https://login.yahoo.com/?.intl=in");
     Point p1 = new Point(20,60);
     driver.manage().window().setPosition(p1);
     
     System.out.println(driver.manage().window().getPosition());
     Thread.sleep(5000);
     driver.close();
     

	}

}
