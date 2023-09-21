package com.EveningBatch12Bestdotnettraining.TestCases.pom;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.EveningBatch12Bestdotnettraining.BaseTest.pom.Basetest;
import com.EveningBatch12Bestdotnettraining.Pages.pom.Landingpage;
import com.EveningBatch12Bestdotnettraining.Pages.pom.Launchingpage;

public class OpenApplicationTestCase extends Basetest{

	
	String Testcasename="Login Test case";
	
	@Test
	public void openBrowser() throws Exception  {
		
		test=extent.startTest(Testcasename);
		setUp("Chrome");
		Launchingpage l = new Launchingpage(driver,test);
		PageFactory.initElements(driver, l);
		Landingpage lp =  l.openApplication();
		PageFactory.initElements(driver, lp);
		lp.loginwithCredentials();
	}
	
	
	@AfterMethod
	public void EndTest() {
		
		extent.endTest(test);
		extent.flush();
		extent.close();
	}
}
