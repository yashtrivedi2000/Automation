import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class TestNG_1 {
	WebDriver wd=null;
	@BeforeTest
	public void setUp() {
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver",path+"\\Drivers\\GEKODRIVER\\geckodriver.exe");
		wd=new FirefoxDriver();
		
		
		

	}
	@org.testng.annotations.Test
	public void Test() throws InterruptedException
	{
		
		wd.get("https://web.whatsapp.com/");
		Thread.sleep(6000);
		wd.findElement(By.xpath("//span[contains(@title, \"Miss Yumm\" )]")).click();
		for (int i = 0; i < 10; i++) {
			wd.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div[2]/div/div[2]")).sendKeys("Hello"+Keys.ENTER);;
			Thread.sleep(1000);
			
		}
		wd.findElement(By.xpath("//span[contains(@title, \"Honey\" )]")).click();
		for (int i = 0; i < 10; i++) {
			wd.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div[2]/div/div[2]")).sendKeys("Hello"+Keys.ENTER);;
			Thread.sleep(1000);
			
		}
		wd.findElement(By.xpath("//span[contains(@title, \"Keyur\" )]")).click();
		for (int i = 0; i < 10; i++) {
			wd.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div[2]/div/div[2]")).sendKeys("Hello"+Keys.ENTER);;
			Thread.sleep(1000);
			
		}
		wd.findElement(By.xpath("//span[contains(@title, \"Davda\" )]")).click();
		for (int i = 0; i < 10; i++) {
			wd.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div[2]/div/div[2]")).sendKeys("Hello"+Keys.ENTER);;
			Thread.sleep(1000);
			
		}
		Thread.sleep(5000);
		
	}
	@AfterTest
	public void FinishingTest() {
		wd.close();
		//wd.quit();
	}

}
