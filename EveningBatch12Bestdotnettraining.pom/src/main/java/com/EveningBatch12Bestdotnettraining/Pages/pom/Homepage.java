package com.EveningBatch12Bestdotnettraining.Pages.pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.EveningBatch12Bestdotnettraining.BasePage.pom.Basepage;

public class Homepage extends Basepage{
	
	
	@FindBy(how=How.LINK_TEXT,using = "Packages")
	public WebElement packagesmenu;
	
	
	@FindBy(how=How.LINK_TEXT,using = "Courses")
	public WebElement coursesmenu;

	public Homepage(WebDriver driver) {
		this.driver=driver;
	}

	public void newBatchesandWebinars() {
		
	}
	
	public PackagesMenuPage packagesMenu() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		packagesmenu.click();
		
		PackagesMenuPage pm = new PackagesMenuPage(driver);
		PageFactory.initElements(driver, pm);
		return pm; 
	}
	
	public void pricingMenu() {
		
	}
	
	public CoursesMenupage coursesMenu() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		coursesmenu.click();
		CoursesMenupage cm =new CoursesMenupage(driver);
		PageFactory.initElements(driver, cm);
		return cm;
		
	}
	
	public void videosMenu() {
		
	}
}
