package com.EveningBatch12Bestdotnettraining.Pages.pom;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.EveningBatch12Bestdotnettraining.BasePage.pom.Basepage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Launchingpage extends Basepage{

	
	public Launchingpage(WebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}

	public Landingpage openApplication() throws Exception {
		test.log(LogStatus.INFO, "Application should be opened");
		driver.get("https://www.bestdotnettraining.com/");
		test.log(LogStatus.INFO, "Application is  opened");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		capture(driver, test);
		Landingpage lp = new Landingpage(driver,test);
		PageFactory.initElements(driver, lp);
		return lp;
	}
}
