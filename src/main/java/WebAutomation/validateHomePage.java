package WebAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class validateHomePage {

	@Test
	public void homePage() {
		System.out.println("hi");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yessinfotech.com/");
		driver.close();
	}
	
}
