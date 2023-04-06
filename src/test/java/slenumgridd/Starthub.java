package slenumgridd;

import org.openqa.grid.selenium.GridLauncherV3;

public class Starthub
{
	public static void main(String[] args)
	{
		String x[]=new String[] {"-role","hub","-port","4449"};
		GridLauncherV3.main(x);
	}
}
