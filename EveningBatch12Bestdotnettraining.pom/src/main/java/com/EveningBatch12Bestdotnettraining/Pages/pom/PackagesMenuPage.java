package com.EveningBatch12Bestdotnettraining.Pages.pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.EveningBatch12Bestdotnettraining.BasePage.pom.Basepage;

public class PackagesMenuPage extends Basepage {

	
	@FindBy(how=How.LINK_TEXT,using = "Software Testing")
	public WebElement softwareTestingpackage;
	
	public PackagesMenuPage(WebDriver driver) {
		this.driver=driver;
	}

	public void goldMembership() {
		
	}
	
	public void azureDevopsExpert() {
		
	}
	
	public void azureSuiteandSuitePlus() {
		
	}
	
	public SoftwareTestingPackagepage softwareTesting() throws Exception {
		
		Thread.sleep(2000);
		
		softwareTestingpackage.click();
		
		SoftwareTestingPackagepage st = new SoftwareTestingPackagepage(driver);
		PageFactory.initElements(driver, st);
		return st;
	}
}
