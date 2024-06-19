package testNgpgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class prioritytestng {

	WebDriver driver;
	@BeforeTest
	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\selenium with jar\\chromedriver-win64\\chromedriver.exe");
		 driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		Thread.sleep(2000);
	
	}
	@Test(priority = 1)
	public void Firstname() throws InterruptedException
	{
	 WebElement fname=driver.findElement(By.name("firstName"));
	 fname.sendKeys("Manoj");
	 Thread.sleep(2000);
	}
	@Test(priority = 2)
	public void Lastname() throws InterruptedException
	{
		 WebElement Lname=driver.findElement(By.name("lastName"));
		 Lname.sendKeys("Kumar");
		 Thread.sleep(2000);
		
	}
	@Test(priority = 3)
	public void PhoneNumber() throws InterruptedException
	{
		 WebElement Phone=driver.findElement(By.name("phone"));
		 Phone.sendKeys("12345");
		 Thread.sleep(2000);
		
	}
	@Test(priority = 4)
	public void Email() throws InterruptedException
	{
		 WebElement em=driver.findElement(By.name("userName"));
		 em.sendKeys("Manoj@123");
		 Thread.sleep(2000);
		
	}
	@AfterTest
	public  void logout()
	{
		driver.quit();
	}


}
