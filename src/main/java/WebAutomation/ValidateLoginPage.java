package WebAutomation;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ValidateLoginPage {

	
	@Test
	public void homePage() {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yessinfotech.com/");
	
		String Actualtitle = driver.getTitle();
		System.out.println(Actualtitle);
		 
		String ExpextedResult = "Software training classes institute in Hadapsar Pune";
		
		if(Actualtitle.equals(ExpextedResult)) {
			System.out.println("wa are landing to the yassinfotech page successfully..!");
		}
		else
		{
			System.out.println("please check your website");
		}
		
		
		
		
		
		driver.close();
		
	}
}
