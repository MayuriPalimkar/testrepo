package webtables;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstprogram {

	public static void main(String[] args) {
	
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement element=driver.findElement(By.xpath("//h3[contains(text(),\"Example\")]"));
		
		js.executeScript("arguments[0].scrollIntoView();", element);
		
		//how many rows in table
		int Row=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
		System.out.println("Row size-->"+Row);
		
		//how many col
		int col = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th")).size();
		System.out.println("col size-->"+col);
		
		
		//retrieve specific data
		String data=driver.findElement(By.xpath("//table[@id=\"customers\"]//tbody//tr[4]//td[3]")).getText();
		System.out.println(data);
		
		//retrieve all row and col data
		
		for(int i=2; i<= Row; i++) {  //indexing of table start from 1
			for(int j=1; j<=col; j++) {
				String data1 =driver.findElement(By.xpath("//table[@id=\"customers\"]//tbody//tr["+i+"]//td["+j+"]")).getText();
				System.out.print(" "+data1);
				
			}
			System.out.println("||");
		}
		
	}

}
