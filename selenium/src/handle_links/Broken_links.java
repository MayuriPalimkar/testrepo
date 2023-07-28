package handle_links;

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

	public static void main(String[] args) throws IOException  {
		
System.setProperty("webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		int Brokenlinks = 0;
		for(WebElement element : links) {
		
			String url=element.getAttribute("href");
			
			if(url==null || url.isEmpty()) {
				System.out.println("Url is empty");
			}
			URL link = new URL(url);
			
			HttpsURLConnection httpscode = (HttpsURLConnection) link.openConnection();
			httpscode.connect();
			
			if(httpscode.getResponseCode()>400) {
				System.out.println(httpscode.getResponseCode()+"-->"+url+"  is broken link");
				Brokenlinks ++;
			}else {
				System.out.println(httpscode.getResponseCode()+"-->"+url+"  is valid link");
			}
		}
		System.out.println("Number of broken links-->"+Brokenlinks);
		
		driver.quit();
	}

}
