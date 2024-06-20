package com.opencart.utilty;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.opencart.testbase.TestBase;

public class Util extends TestBase{

	public static void capturescreenshot(String filename) {
		String path = "D:\\Repo_Folder\\Demoblaze_Project_Repo\\OpencartProject09march\\ScreenShots\\";
		try {
		TakesScreenshot ts = (TakesScreenshot)driver;
	    File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(path+filename+".png");
		
			FileHandler.copy(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
