package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestExample2 
{
	public static void main(String[] args)
	{
		//way-1:- change browser settings to avoid web push notifications
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.addArguments("--disable-notifications");//Chrome native cmd as argument
		//open browser
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		//launch site
		driver.get("https://www.irctc.co.in/nget/train-search");
		

	}

}
