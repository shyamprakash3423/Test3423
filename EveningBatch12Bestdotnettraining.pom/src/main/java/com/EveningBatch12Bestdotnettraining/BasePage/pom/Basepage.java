package com.EveningBatch12Bestdotnettraining.BasePage.pom;





import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class Basepage {

	
	public   WebDriver driver;
	
	public ExtentTest test;
	
	
	public void capture(WebDriver driver,ExtentTest test) throws IOException {
		
		Date d = new Date();
		
		String filename = d.toString().replaceAll(" ", "_").replaceAll(":", "_");
		
		String imagepath="D:\\eclipse workspace\\EveningBatch12Bestdotnettraining.pom\\Screenshots\\image"+filename+".png";
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, new File(imagepath));
		
		test.log(LogStatus.INFO, test.addScreenCapture(imagepath));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		
		
	}
	
	
	
}
