package com.EveningBatch12Bestdotnettraining.Pages.pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.EveningBatch12Bestdotnettraining.BasePage.pom.Basepage;

public class SoftwareTestingPackagepage extends Basepage {

	
	@FindBy(how=How.XPATH,using = "//h2[contains(text(),'Selenium testing with Java')]")
	public WebElement seleniumjava;
	
	public SoftwareTestingPackagepage(WebDriver driver) {
		this.driver=driver;
	}


	public void manualTesting() {
		
	}
	
	
	public SeleniumJavaCoursepage seleniumJava() throws Exception {
		
		Thread.sleep(2000);
		
		seleniumjava.click();
		SeleniumJavaCoursepage scc = new SeleniumJavaCoursepage(driver);
		PageFactory.initElements(driver, scc);
		return scc;
	}
	
	public void seleniumCsharp() {
		
	}
	
	public void liveProjects() {
		
	}
}
