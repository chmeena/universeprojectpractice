package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TesExample9
{
	public static void main(String[] args)
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver(co);
		driver.get("https://imgur.com/upload");
		WebElement picsel=driver.findElement(By.xpath("//label[@for='file-input']"));
		picsel.click();
		picsel.sendKeys("C:\\Users\\saigu\\Pictures\\2121.jpg");
		

	}

}
