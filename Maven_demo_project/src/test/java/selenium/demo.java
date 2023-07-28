package selenium;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class demo {
		public static void main(String[] args) throws InterruptedException  {
			
			System.setProperty("Webdriver.Chrome.driver","C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
			
			WebDriver driver = new ChromeDriver();

		    driver.get("https://www.facebook.com/login/");
		    driver.findElement(By.xpath("//input [@type = \"password\"]")).sendKeys("Neha123");
		 
		    Thread.sleep(5000);
		     driver.close();
		    
		}

	}


