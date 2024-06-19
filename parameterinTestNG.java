package TestNGprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterinTestNG {
	WebDriver driver;
	@BeforeTest
	public  void setup() throws InterruptedException
	{
		System.setProperty("webdriver.msedge.driver", "C:\\Users\\admin\\Desktop\\selenium with jar\\microsoftEdgedriver\\abc\\msedgedriver.exe");
		 driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
	}
	@Test(priority = 1)
	@Parameters({"username","password"})
	public void loginpage(String username,String password) throws InterruptedException
	{
		WebElement user=driver.findElement(By.xpath("//input[@name='username']"));
		user.sendKeys(username);
		Thread.sleep(2000);
		WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys(password);
		Thread.sleep(2000);
		
	}
	@AfterTest
	public void logout()
	{
		driver.quit();
	}
}
