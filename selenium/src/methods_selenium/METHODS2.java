package methods_selenium;

import java.awt.Point;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class METHODS2 {
	
	public static void main(String [] args) throws InterruptedException {
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.yahoo.com/?.intl=in");  //get method
		String url = driver.getCurrentUrl();   //getcurrentUrl
		System.out.println(url);
		
		String title = driver.getTitle();    //getTitle 
		System.out.println(title);
		
		driver.manage().window().maximize();   //maximize
		
		driver.navigate().to("https://www.w3schools.com/");   //navigate
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		Dimension d1 = new Dimension(200, 500);  //setsize
		driver.manage().window().setSize(d1);
		
		System.out.println(driver.manage().window().getSize());   //getsize
		
	//	Point p1 = new Point(20,50);
		driver.manage().window().getPosition();  //getposition
		
		
		
		
		
		
		
		Thread.sleep(5000);
		driver.close();
	}

}
