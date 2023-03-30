package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestExample8
{
	public static void main(String[] args) throws Exception
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		Screen s=new Screen();
		if(s.exists("src\\test\\resources\\images\\username.png",5000)!=null)
		{
		s.type("src\\test\\resources\\images\\username.png","admin");
		}
		if(s.exists("src\\test\\resources\\images\\password.png",5000)!=null)
		{
		s.type("src\\test\\resources\\images\\password.png","admin");
		}
		if(s.exists("src\\test\\resources\\images\\signin.png",5000)!=null)
		{
			s.click("src\\test\\resources\\images\\signin.png");
		}

	}

}
