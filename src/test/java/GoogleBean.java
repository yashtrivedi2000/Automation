import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleBean {
	public GoogleBean(WebDriver driver) {
		super();
		this.driver = driver;
	}

	By _search_box = By.name("q");
	By _search_button = By.name("btnK");
	WebDriver driver = null;

	public void set_search_box(String query) {
		this.driver.findElement(_search_box).sendKeys(query);
	}

	public void click_search_button() {
		this.driver.findElement(_search_box).sendKeys(Keys.RETURN);
	}

}
