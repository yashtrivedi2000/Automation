import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestFirefox {

	public static void main(String[] args) throws InterruptedException {

		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver",path+"\\Drivers\\GEKODRIVER\\geckodriver.exe");
		WebDriver wd=new FirefoxDriver();
		wd.get("https://www.google.com/");
		GoogleBean gb= new GoogleBean(wd);
		gb.set_search_box("Yash Trivedi");
		gb.click_search_button();
		wd.close();
		wd.quit();
		
		

	}

}
