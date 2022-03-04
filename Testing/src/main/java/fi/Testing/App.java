package fi.Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App 
{
	WebDriver driver;
	public void launchBrowser() 
	{
		System.setProperty("webdriver.chrome.driver", 
		"I:\\CDAC\\SoftwareEnginnering\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		  driver.get("https://www.google.com/");

	}
	
	public void navigate_to_flipkart()
	{
		driver.navigate().to("https://www.flipkart.com/");
		System.out.println("This is the title of the website"+driver.getTitle());	
	}
	
	public void login_Check() throws InterruptedException
	{
		driver.findElement(By.xpath("//div[@class='_1XBjg- row']//form//input[@type='text']")).sendKeys("mohnishpali@gmail.com");
		driver.findElement(By.xpath("//div[@class='_1XBjg- row']//form//input[@type='password']")).sendKeys("Mohhnish23232");
		driver.findElement(By.xpath("//div[@class='_1XBjg- row']//form//button[@type='submit']")).click();
	}
	
    public static void main( String[] args ) throws InterruptedException 
    {
    	App obj = new App();
    	obj.launchBrowser();
    	obj.navigate_to_flipkart();
    	obj.login_Check();
    }
}