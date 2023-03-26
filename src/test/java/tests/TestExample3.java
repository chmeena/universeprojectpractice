package tests;

import java.awt.Robot;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.sun.glass.events.KeyEvent;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestExample3 
{
	public static void main(String[] args) throws Exception 
	{
		//way-2 :-working with web push notifications using java robot
        ChromeOptions co=new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        RemoteWebDriver driver=new ChromeDriver(co);
        driver.manage().window().maximize();
        //launch site
      	driver.get("https://www.irctc.co.in/nget/train-search");
      	Robot r = new Robot();
      	r.keyPress(KeyEvent.VK_TAB);
      	r.keyRelease(KeyEvent.VK_TAB);
      	Thread.sleep(5000);
      	r.keyPress(KeyEvent.VK_TAB);
      	r.keyRelease(KeyEvent.VK_TAB);
      	Thread.sleep(5000);
      	r.keyPress(KeyEvent.VK_ENTER);
      	r.keyRelease(KeyEvent.VK_ENTER);
      	
	}

}
