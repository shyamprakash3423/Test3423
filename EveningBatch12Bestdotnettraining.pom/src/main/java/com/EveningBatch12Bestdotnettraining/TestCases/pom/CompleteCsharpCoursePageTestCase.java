package com.EveningBatch12Bestdotnettraining.TestCases.pom;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.EveningBatch12Bestdotnettraining.BaseTest.pom.Basetest;
import com.EveningBatch12Bestdotnettraining.Pages.pom.CompleteCsharpCoursepage;
import com.EveningBatch12Bestdotnettraining.Pages.pom.CoursesMenupage;
import com.EveningBatch12Bestdotnettraining.Pages.pom.Homepage;
import com.EveningBatch12Bestdotnettraining.Pages.pom.Landingpage;
import com.EveningBatch12Bestdotnettraining.Pages.pom.Launchingpage;
import com.EveningBatch12Bestdotnettraining.Pages.pom.MsDotnetCoursesMenupage;

public class CompleteCsharpCoursePageTestCase extends Basetest{

	
	@Test
	public void enrollCsharp() throws Exception {
		
		setUp("Chrome");
		Launchingpage l = new Launchingpage(driver,test);
		PageFactory.initElements(driver, l);
		Landingpage lp =   l.openApplication();
		PageFactory.initElements(driver, lp);
	   Homepage h =  lp.loginwithCredentials();
	   PageFactory.initElements(driver, h);
	   CoursesMenupage cm =   h.coursesMenu();
	   PageFactory.initElements(driver, cm);
	    MsDotnetCoursesMenupage ms = cm.msDotnetCourses();
	    PageFactory.initElements(driver, ms);
	    CompleteCsharpCoursepage ccc =  ms.completeCsharp();
	    PageFactory.initElements(driver, ccc);
	    ccc.enrollNow();
	   
	   
	}
}
