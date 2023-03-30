package tests;

import org.sikuli.script.Screen;

public class Calcsikulix
{
	public static void main(String[] args) throws Exception
	{
		Screen s=new Screen();
		if(s.exists("src\\test\\resources\\images\\search.png",5000)!=null)
		{
			s.click("src\\test\\resources\\images\\search.png");
		}
		if(s.exists("src\\test\\resources\\images\\typehere.png",5000)!=null)
		{
			s.type("src\\test\\resources\\images\\typehere.png","calculator");
		}
        if(s.exists("src\\test\\resources\\images\\calculator.png",5000)!=null)
        {
        	s.click("src\\test\\resources\\images\\calculator.png");
        }
        if(s.exists("src\\test\\resources\\images\\1.png",5000)!=null)
        {
        	s.click("src\\test\\resources\\images\\1.png");
        }
        if(s.exists("src\\test\\resources\\images\\3.png",5000)!=null)
        {
        	s.click("src\\test\\resources\\images\\3.png");
        }
        if(s.exists("src\\test\\resources\\images\\plus.png",5000)!=null)
        {
        	s.click("src\\test\\resources\\images\\plus.png");
        }
        if(s.exists("src\\test\\resources\\images\\9.png",5000)!=null)
        {
        	s.click("src\\test\\resources\\images\\9.png");
        }
        if(s.exists("src\\test\\resources\\images\\equal.png",5000)!=null)
        {
        	s.click("src\\test\\resources\\images\\equal.png");
        }
	}

}
