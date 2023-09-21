package com.EveningBatch12Bestdotnettraining.Utilty.pom;

import java.io.File;
import java.util.Date;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {

	
	public static ExtentReports extent;
	
	public static ExtentReports getReports() {
		
		if (extent == null) {
			
			Date d = new Date();
			String filename = d.toString().replaceAll(" ", "_").replaceAll(":", "_");
			
			String reportpath= ("D:\\eclipse workspace\\EveningBatch12Bestdotnettraining.pom\\Extent Reports\\extent"+filename+".html");
			
			extent = new ExtentReports(reportpath,true,DisplayOrder.NEWEST_FIRST);
			
			extent.loadConfig(new File("D:\\eclipse workspace\\EveningBatch12Bestdotnettraining.pom\\extent-config.xml"));
			
			extent.addSystemInfo("Selenium Version", "4.9.0").addSystemInfo("Project name", "Bestdotnettraining")
			.addSystemInfo("Framework name", "POM").addSystemInfo("Testername", "Shyam");
			
		}
		
		return extent;
	}
}
