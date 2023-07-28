package Com.Ecommerce.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Com.Ecommerce.BaseClass.Ecommerce_BaseClass;
import Com.Ecommerce.PageClasses.TC_ECommerce_Addtocart;
import Com.Ecommerce.PageClasses.TC_login;

public class TC_AddToCart extends  Ecommerce_BaseClass{
	
	@Test
	public void addproduct() throws InterruptedException {
		
		TC_login TL = new TC_login();
		logger.info("open URL");
		TL.username(Username);
		logger.info("enter the username");
		Thread.sleep(3000);
		TL.pass(Password);
		logger.info("enter the password");
		Thread.sleep(3000);
		TL.buttonclick();
		logger.info("click on the log in button");
		Thread.sleep(3000);
		
		 TC_ECommerce_Addtocart TEA = new  TC_ECommerce_Addtocart();
		 
		 Actions act = new Actions(driver);
		 
		 WebElement computer = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']"));
		 act.moveToElement(computer).perform();
		 
		 logger.info("Mousehover on computer");
		 
		 TEA.NoteBook();
		 logger.info("clicked on Notebook");
		 
		 TEA.selectproduct();
		 logger.info("macBook selected");
		 TEA.AddtoCart();
		 logger.info("add to cart");
		 TEA.productadded();
		 logger.info("verified message");
		// TEA.close();
		// logger.info("clicked on close tab");
		 TEA.cart();
		 
		 WebElement ele = driver.findElement(By.xpath("//h1[text()='Shopping cart']"));
		 
		 Actions Act = new Actions(driver);
		 Act.moveToElement(ele).build().perform();
		 
		 TEA.product();
		 
		 
		 
		 
		
		
	}

}
