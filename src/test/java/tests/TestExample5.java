package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestExample5 
{
	public static void main(String[] args) throws Exception
	{
		//way-4:- automate web push notifications using sikulix
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Screen s1=new Screen();
		if(s1.exists("src\\test\\resources\\images\\block.png",5000)!=null)
		{
			s1.click("src\\test\\resources\\images\\block.png");
		}
		Thread.sleep(4000);
		driver.close();
	}

}
