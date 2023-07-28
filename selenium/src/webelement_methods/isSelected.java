package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected {
	
	public static void main(String [] args) throws InterruptedException {
		System.setProperty("Webdriver.Chrome.driver","C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[contains(text(),'Create new')]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='radio']")).click();
		Thread.sleep(2000);
		
		Boolean B1 = driver.findElement(By.xpath("//input[@type='radio']")).isSelected();
		
		System.out.println(B1);
		Thread.sleep(2000);
		Boolean B2 = driver.findElement(By.xpath("(//input[@type='radio'])[2]")).isSelected();
		System.out.println(B2);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		Thread.sleep(2000);
		Boolean B3 = driver.findElement(By.xpath("(//input[@type='radio'])[2]")).isSelected();
		System.out.println(B3);
		Thread.sleep(2000);
		
	Boolean B4 =	driver.findElement(By.xpath("(//input[@type='radio'])[3]")).isSelected();
		System.out.println(B4);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@type='radio'])[3]")).click();
		Thread.sleep(2000);
		
		Boolean B5 = driver.findElement(By.xpath("(//input[@type='radio'])[3]")).isSelected();
		System.out.println(B5);
		
		
		
		
		
		
		
		
		
		Thread.sleep(3000);
		driver.close();

}
}