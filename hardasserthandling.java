package testNgpgm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class hardasserthandling {
	WebDriver driver;
	@BeforeTest
	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\selenium with jar\\chromedriver-win64\\chromedriver.exe");
		 driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
	
	}
	@Test
	public void titlematch() throws InterruptedException
	{
		System.out.println("Test case 1");
		System.out.println("Test case 2");
		
		String Expected="OrangeHRM";
		
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(Expected, title);
		System.out.println("test pass");
		
		System.out.println("Test case 3");

		System.out.println("Test case 4");
		Thread.sleep(2000);

	}
	@AfterTest
	public void logout()
	{
		driver.quit();
	}
	
}
