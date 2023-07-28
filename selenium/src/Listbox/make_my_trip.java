package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class make_my_trip {
	public static void main (String [] args) throws InterruptedException {
		
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/flights/");
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
		
		
		driver.findElement(By.xpath("//input[@id=\"fromCity\"]")).sendKeys("Pune");
		Thread.sleep(3000);
		List<WebElement> city = driver.findElements(By.xpath("//ul[@role=\"listbox\"]"));
		Thread.sleep(4000);
		
		//to print total size of the listbox
		System.out.println("total size-->"+city.size());
		Thread.sleep(5000);
		//to print all the values from the listbox
		
		for(int i = 0; i< city.size(); i++) {
			String citynames= city.get(i).getText();
			System.out.println(citynames);
			
			//to select specific values
			if(citynames.equals("Indapur(pune),Maharashtra")){
				System.out.println(city.get(i).getText());
				Thread.sleep(5000);
				city.get(i).click();
				
			}
		}
		
		
		Thread.sleep(5000);
		driver.close();
		
	}

	

}
