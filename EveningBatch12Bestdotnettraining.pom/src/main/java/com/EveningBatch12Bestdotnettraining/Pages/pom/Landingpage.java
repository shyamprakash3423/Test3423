package com.EveningBatch12Bestdotnettraining.Pages.pom;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.EveningBatch12Bestdotnettraining.BasePage.pom.Basepage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Landingpage extends Basepage{
	
	
	@FindBy(how=How.LINK_TEXT,using = "Login")
	public WebElement loginmenu;
	
	
	@FindBy(how=How.ID,using = "EmailId")
	public WebElement email;
	
	
	@FindBy(how=How.NAME,using = "Password")
	public WebElement password;
	
	
	public Landingpage(WebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}

	public void gmailLogin() {
		
	}
	
	public void facebookLogin() {
		
	}

	
	public Homepage loginwithCredentials() throws Exception  {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		test.log(LogStatus.INFO, "Click on login Menu");
		loginmenu.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		capture(driver, test);
		test.log(LogStatus.INFO, "Popup Containing Login should be displayed");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		test.log(LogStatus.INFO, "Enter Useremail");
		email.sendKeys("Shyam2022@gmail.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		capture(driver, test);
		test.log(LogStatus.INFO, "Useremail is entered");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		test.log(LogStatus.INFO, "Enter Password");
		password.sendKeys("Shyam@2022");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		capture(driver, test);
		test.log(LogStatus.INFO, "Password is Entered");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		test.log(LogStatus.INFO, "Click on the Login button");
		password.sendKeys(Keys.ENTER);
		test.log(LogStatus.INFO, "redirected to Homepage");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		capture(driver, test);
		Homepage h =new Homepage(driver);
		PageFactory.initElements(driver, h);
		return h;
		
	}
}
