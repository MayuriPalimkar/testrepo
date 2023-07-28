package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mmt {
	
public static void main (String [] args) throws InterruptedException {
		
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/bus-tickets/");
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.xpath("//input[@id=\"fromCity\"]")).click();
		Thread.sleep(2000);
		List<WebElement>fcity=driver.findElements(By.xpath("//ul[@class=\"react-autosuggest__suggestions-list\"][1]//li"));

		//to print total size in the list
		System.out.println(" "+fcity.size());
		String option="Mumbai,Maharashtra";
		//to print all values from listbox
		for (int i=0; i< fcity.size();i++) {
			String fcitynames=fcity.get(i).getText();
			System.out.println(fcitynames);
			
			if(fcitynames=="Mumbai,Maharashtra") {
			System.out.println(fcity.get(i).getText());
				fcity.get(i).click();
			}
			/*if(fcity.get(i).getText().contains(option)) {
				fcity.get(i).click();
				break;
			}*/
		}
		
		
		
		
		driver.findElement(By.xpath("//input[@id=\"toCity\"]")).click();
		
	List<WebElement> city =	driver.findElements(By.xpath("//li[@id=\"react-autowhatever-1-section-1-item-0\"]"));
		
	
	//to print the size of list
	System.out.println("total size-->"+city.size());
	
	//to print values from list
	
	for (int i =0; i< city.size();i++) {
		String citynames=city.get(i).getText();
		System.out.println(citynames);
		
		if(city.get(i).getText().equals("Pune,Maharashtra")) {
			//System.out.println(city.get(i).getText());
			city.get(i).click();
		}
	}
	Thread.sleep(7000);
		driver.close();
		
}
}