package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchbrowser {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource\\chromedriver.exe");
	}
}
