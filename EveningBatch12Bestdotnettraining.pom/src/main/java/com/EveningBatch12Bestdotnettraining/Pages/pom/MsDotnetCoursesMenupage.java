package com.EveningBatch12Bestdotnettraining.Pages.pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.EveningBatch12Bestdotnettraining.BasePage.pom.Basepage;

public class MsDotnetCoursesMenupage extends Basepage{

	
	
	@FindBy(how=How.LINK_TEXT,using = "Complete C#, OOPs and Windows Programing")
	public WebElement csharp;
	
	public MsDotnetCoursesMenupage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}


	public CompleteCsharpCoursepage completeCsharp() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		csharp.click();
		CompleteCsharpCoursepage ccc = new CompleteCsharpCoursepage(driver);
		PageFactory.initElements(driver, ccc);
		return ccc;
	}
	
	
	public void aspDotnetCore() {
		
	}
	
	public void aspDotnetMVC() {
		
	}
	
	public void linq() {
		
	}
}
