package Demoqa;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistrationPage {

	public static void main(String[] args) throws IOException 
	{
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Reema\\Desktop\\Selenium\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-extensions");
		
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.get("https://demoqa.com/register");
		takesSS(driver);
		
	}




public static void takesSS(WebDriver driver) throws IOException
{
	TakesScreenshot ts =(TakesScreenshot) driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File trg = new File("C:\\Users\\Reema\\eclipse-workspace\\Mudrantar\\ScreenShot\\SnapRegister.jpg");
	FileHandler.copy(src, trg);
}
}
