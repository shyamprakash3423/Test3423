package com.EveningBatch12Bestdotnettraining.TestCases.pom;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.EveningBatch12Bestdotnettraining.BaseTest.pom.Basetest;
import com.EveningBatch12Bestdotnettraining.Pages.pom.Homepage;
import com.EveningBatch12Bestdotnettraining.Pages.pom.Landingpage;
import com.EveningBatch12Bestdotnettraining.Pages.pom.Launchingpage;
import com.EveningBatch12Bestdotnettraining.Pages.pom.PackagesMenuPage;
import com.EveningBatch12Bestdotnettraining.Pages.pom.SeleniumJavaCoursepage;
import com.EveningBatch12Bestdotnettraining.Pages.pom.SoftwareTestingPackagepage;

public class SeleniumJavaCoursepageTestCase extends Basetest{

	
	
	@Test
	public void seleniumjavaDemovideo() throws Exception {
		
		setUp("Chrome");
		Launchingpage l = new Launchingpage(driver,test);
		PageFactory.initElements(driver, l);
	 Landingpage lp =	l.openApplication();
	 PageFactory.initElements(driver, lp);
	   Homepage h = lp.loginwithCredentials();
	   PageFactory.initElements(driver, h);
	    PackagesMenuPage pm = h.packagesMenu();
	    PageFactory.initElements(driver, pm);
	    SoftwareTestingPackagepage st = pm.softwareTesting();
	    PageFactory.initElements(driver, st);
	    SeleniumJavaCoursepage scc = st.seleniumJava();
	    PageFactory.initElements(driver, scc);
	    scc.watchDemo();
	    
		
	}
	
	
}
