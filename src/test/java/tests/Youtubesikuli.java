package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Youtubesikuli 
{
	public static void main(String[] args)
	{ 
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		FluentWait<RemoteWebDriver> wait=new FluentWait<RemoteWebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(25));
		wait.pollingEvery(Duration.ofSeconds(1));
		driver.get("https://youtube.com");
		WebElement search=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='search']")));
		search.sendKeys("selenium automation",Keys.ENTER);
	}
}
