package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Baseclass {
	public WebDriver driver;
public void initilizeBrowser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Roshanali\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver D=new ChromeDriver();
	D.get("https://kite.zerodha.com/");
	//maximize
	D.manage().window().maximize();
	//global wait
	D.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

}
}
