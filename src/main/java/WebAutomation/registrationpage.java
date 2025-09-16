package WebAutomation;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class registrationpage {
	@Test
	public void homePage() {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	
		String Actualtitle = driver.getTitle();
		Assert.assertEquals(Actualtitle, "Google1");
		System.out.println("landing successfully to google page");
		driver.close();
		
	}
	
}
