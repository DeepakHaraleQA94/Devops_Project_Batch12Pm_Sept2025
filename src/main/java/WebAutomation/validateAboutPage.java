package WebAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class validateAboutPage {

	@Test
	public void homePage() {
		System.out.println("hi");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yessinfotech.com/");
		driver.close();
	}
	
	
}
