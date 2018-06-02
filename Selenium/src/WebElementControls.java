import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementControls {

	public static void main(String[] args) {
	
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://accounts.google.com/signin/v2/sl/pwd?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Ftab%3Dwm&ltmpl=default&service=mail&scc=1&passive=1209600&sacu=1&ignoreShadow=0&acui=0&flowName=GlifWebSignIn&flowEntry=ServiceLogin#Email=chaitanyakrishna2689@gmail.com");
	
	   WebElement we= driver.findElement(By.xpath("//input[@type='password']"));
	
	   String backattrib= we.getAttribute("aria-label");
	   
	   System.out.println(backattrib);
	   
	   
	   
	   
	    
	}

}
