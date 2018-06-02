import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
	
	WebDriver driver=new FirefoxDriver();
	
	driver.get("https://facebook.com");
	
	String title=driver.getTitle();
	
	System.out.println(title);
	
	String url=driver.getCurrentUrl();
	
	System.out.println(url);
	
	driver.manage().window().maximize();
	
	Dimension dim=new Dimension(300,300);
	driver.manage().window().setSize(dim);
	
	driver.quit();
	
	
	
	
	}

}
