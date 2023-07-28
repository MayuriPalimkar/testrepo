package com.openMRS.Utilities;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.openMRS.baseClass.baaseclass2;

public class GenericUtilities extends baaseclass2 {
	
	public static String getscreenshotAs(String TestcaseName, WebDriver driver) throws IOException {
	TakesScreenshot TS = (TakesScreenshot) driver;
	
	File Source = TS.getScreenshotAs(OutputType.FILE);
	
	String TimeStamp= new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
	
	String Name = "-Screenshot-" + TimeStamp;
	
	Path resourcedirectory = Paths.get("src","test","resources");
	
	String absolutepath = resourcedirectory.toFile().getAbsolutePath();
	
	System.out.println(absolutepath);
	
	String destination = absolutepath+"//Screenshot//"+TimeStamp +""+Name+".png";
	
	FileUtils.copyFile(Source, new File (destination));
	
	return destination;
	
	}
	
	
	

}
