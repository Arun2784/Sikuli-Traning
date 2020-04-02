package SikuliConcept.Sikuli;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SikuliConcept {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Training//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.youtube.com/watch?v=j2dkdqfzY9Y&list=PLFGoYjJG_fqo4oVsa6l_V-_7-tzBnlulT");

		// Create the object of Screenclass

		Screen src = new Screen();

		Pattern playimg = new Pattern("3.png");

		src.wait(playimg, 2000);

		src.click();

		//src.click();

	}

}
