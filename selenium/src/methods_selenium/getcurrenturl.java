package methods_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getcurrenturl {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(3000);
		
		String URL = driver.getCurrentUrl();
		
	     System.out.println(URL);
		
	     if (URL.equals("https://www.amazon.n/"))
	    	 System.out.println("correct url");
	     
	     else {
	    	 System.out.println("incorrect url");
	     }
	      driver.close();
	     
	}

}
