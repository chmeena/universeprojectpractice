package slenumgridd;

import org.openqa.grid.selenium.GridLauncherV3;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Registeredge
{
	public static void main(String[] args)
	{
		WebDriverManager.edgedriver().setup();
		String x[]=new String[] {"-role","node",
				"-hub","http://192.168.43.206:4449/grid/register",
				"-browser","browserName=MicrosoftEdge",
				"-port","5559"};
		GridLauncherV3.main(x);
	}
}
