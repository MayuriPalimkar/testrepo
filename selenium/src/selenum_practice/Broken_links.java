package selenum_practice;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_links {

	public static void main(String[] args) throws IOException {
System.setProperty("webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		int Brokenlinks =0;
		//to read the links
		for(WebElement link : links ) {
			String url =link.getAttribute("href");
		
		
		if(url== null || url.isEmpty()) {
			System.out.println("URL is empty");
		}
		
	    URL links1 = new URL(url);
	    
	    HttpsURLConnection httpscode = (HttpsURLConnection) links1.openConnection();
	    
	    httpscode.connect();
	    
	   int code= httpscode.getResponseCode();	
	   
	   if(code>=400) {
		   System.out.println(code+" "+url+" is broken link");
		   Brokenlinks++;
	   }else {
		   System.out.println(code+" "+url +" is valid link");
	   }
		
		
		
		
		}
		System.out.println("total broken links are -->"+Brokenlinks);
		

	}

}
