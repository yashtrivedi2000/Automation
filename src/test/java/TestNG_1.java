import org.openqa.selenium.By;
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
		
		wd.get("https://www.google.com/");
		GoogleBean gb= new GoogleBean(wd);
		gb.set_search_box("Yash Trivedi");
		gb.click_search_button();
		Thread.sleep(3000);
	}
	@AfterTest
	public void FinishingTest() {
		wd.close();
		//wd.quit();
	}

}
