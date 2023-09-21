package com.EveningBatch12Bestdotnettraining.Pages.pom;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.EveningBatch12Bestdotnettraining.BasePage.pom.Basepage;

public class SeleniumJavaCoursepage extends Basepage{

	public SeleniumJavaCoursepage(WebDriver driver) {
		this.driver=driver;
	}

	public void watchDemo() throws Exception {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		ArrayList<String>tab = new ArrayList<String>(driver.getWindowHandles());
		for (int i = 0; i < tab.size(); i++) {
			
			System.out.print(tab.size());
			System.out.println(driver.switchTo().window(tab.get(i)).getCurrentUrl());
		}
		
		driver.switchTo().window(tab.get(1));
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//body/div[6]/div[2]/div[2]/div[2]/section[1]/div[1]/div[1]/button[1]")).click();
	}
	
	public void enrollNow() {
		
	}
	
	
	public void downloadCurricullum() {
		
	}
}
