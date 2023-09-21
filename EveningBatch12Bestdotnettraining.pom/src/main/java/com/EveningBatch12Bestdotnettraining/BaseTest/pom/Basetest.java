package com.EveningBatch12Bestdotnettraining.BaseTest.pom;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.EveningBatch12Bestdotnettraining.BasePage.pom.Basepage;
import com.EveningBatch12Bestdotnettraining.Utilty.pom.ExtentManager;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class Basetest extends Basepage{
	
	
	public ExtentReports extent = ExtentManager.getReports();

	public void setUp(String Browser) throws Exception  {
		
		if (Browser=="Chrome") {
			
			test.log(LogStatus.INFO, "Chrome should be opened");
			ChromeOptions ops = new ChromeOptions();
			ops.addArguments("--remote-allow-origins=*");

		    System.setProperty("webdriver.chrome.driver", "K:\\chromedriver.exe");
			driver = new ChromeDriver(ops);
			driver.manage().window().maximize();
			
			test.log(LogStatus.INFO, "Chrome is opened");
		
          capture(driver, test);
		
		}
		
		else if (Browser=="Mozilla") {
			
			test.log(LogStatus.INFO, "Mozilla should be opened");
			
			driver = new FirefoxDriver();
			test.log(LogStatus.INFO, "Mozilla is opened");
		}
		
		else if (Browser=="Edge") {
			test.log(LogStatus.INFO, "Edge should be opened");
			
			driver=new EdgeDriver();
			test.log(LogStatus.INFO, "Edge is opened");
		}
		
		driver.manage().window().maximize();
	}
}
