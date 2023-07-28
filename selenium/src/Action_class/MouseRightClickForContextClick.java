package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRightClickForContextClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.Chrome.driver","C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement button=driver.findElement(By.xpath("//span[@class=\"context-menu-one btn btn-neutral\"]"));
		
		Actions act = new Actions(driver);
		
		act.contextClick(button).build().perform();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()=\"Copy\"]")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		act.contextClick(button).build().perform();
		driver.findElement(By.xpath("//span[text()=\"Paste\"]")).click();
		Thread.sleep(3000);
	    System.out.println(driver.switchTo().alert().getText());
	    
	    driver.switchTo().alert().accept();
	    Thread.sleep(5000);
	    
	    driver.close();


	}

}
