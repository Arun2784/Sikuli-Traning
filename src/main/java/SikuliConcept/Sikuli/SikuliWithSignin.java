package SikuliConcept.Sikuli;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SikuliWithSignin {

	public static void main(String[] args) throws FindFailed {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Training//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.google.com/");
		
		
		Screen src = new Screen();
		
		Pattern Sign_in = new Pattern("sign_in.png");
		
		src.wait(Sign_in,1000);
		
		src.click();
		
		
		
		
		
		
		
	}

}
