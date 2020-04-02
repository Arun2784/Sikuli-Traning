package SikuliConcept.Sikuli;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SikulGoogleSearch {

	public static void main(String[] args) throws FindFailed {
		
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Training//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.google.com/");

		// Create the object of Screenclass
		
		
		Screen sr = new Screen();
		
		Pattern google_search = new Pattern("2.png");
		sr.wait(google_search,1000);
		
		sr.click();
		
		
		
		
		


	}

}
