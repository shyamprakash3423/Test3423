package com.EveningBatch12Bestdotnettraining.Pages.pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.EveningBatch12Bestdotnettraining.BasePage.pom.Basepage;

public class CompleteCsharpCoursepage extends Basepage{

	
	@FindBy(how=How.XPATH,using = "//button[contains(text(),'Enroll Now')]")
	public WebElement enroll;
	
	public CompleteCsharpCoursepage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public void watchDemo() {
		
	}
	
	public void enrollNow() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		enroll.click();
	}
	
	public void downloadCurricullum() {
		
	}
}
