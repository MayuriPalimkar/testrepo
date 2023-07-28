package demo;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver_method1 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.Chrome.driver","C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		WebDriver driver = new ChromeDriver();
		//get method- used to open an application
		driver.get("https://www.facebook.com/");  //return type is void
		 Thread.sleep(4000);
		 
		
		 //getCurrentUrl - to get the current url
		 
		 System.out.println(driver.getCurrentUrl());
       //getTitle - to get the title of current webpage
		 System.out.println(driver.getTitle());
		 
		 //maximize-to maximize the current webpage
		 driver.manage().window().maximize();//return is void
		 Thread.sleep(4000);
		//navigate to method is used to navigate to another webpage 
		 driver.navigate().to("https://www.amazon.in/");
		 Thread.sleep(2000);
		 //navigate back method is used to navigate back from current webpage
		 driver.navigate().back();
		 Thread.sleep(2000);
		//navigate forward is used to move forward to next wepage 
		 driver.navigate().forward();
		 Thread.sleep(2000);
		 
		 //refresh method is used to refresh the current webpage
		 driver.navigate().refresh();
		 Thread.sleep(2000);
		 
		 //set size
		 Dimension d1 = new Dimension(500, 800);
		 driver.manage().window().setSize(d1);
		 driver.manage().window().getSize();
		 
		 //set position
		 Point p1 = new Point(500, 800);
		 driver.manage().window().setPosition(p1);
		 driver.manage().window().getPosition();
		 
		 
		 //
		 //close method- used to close method
		 driver.close();    //return type is void
		 
		 
		
	}

}
