package captchautomation;

import java.io.File;

import net.sourceforge.tess4j.Tesseract;

public class TestCaptcha1 
{
	public static void main(String[] args) throws Exception
	{
		File f=new File("src\\test\\resources\\images\\captcha.png");
		Tesseract t=new Tesseract();
		t.setDatapath("src\\test\\resources");
		String x= t.doOCR(f);
		System.out.println(x);
	

	}

}
