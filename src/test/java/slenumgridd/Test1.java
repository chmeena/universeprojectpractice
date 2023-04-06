package slenumgridd;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1
{
		@Test
		@Parameters({"url","bn"})
		
		public void method(String x, String y)throws Exception
		{
			URL u=new URL(x);
			DesiredCapabilities dc=new DesiredCapabilities();
			dc.setCapability("browserName",y);
			RemoteWebDriver driver=new RemoteWebDriver(u,dc);
			driver.get("http://google.co.in");
			driver.quit();
		}
}
