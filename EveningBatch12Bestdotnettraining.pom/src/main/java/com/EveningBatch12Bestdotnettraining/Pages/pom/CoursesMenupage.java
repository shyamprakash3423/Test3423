package com.EveningBatch12Bestdotnettraining.Pages.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.EveningBatch12Bestdotnettraining.BasePage.pom.Basepage;

public class CoursesMenupage extends Basepage{

	
	public CoursesMenupage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public MsDotnetCoursesMenupage msDotnetCourses() {
		
		System.out.println("Select a course");
		MsDotnetCoursesMenupage ms = new MsDotnetCoursesMenupage(driver);
		PageFactory.initElements(driver, ms);
		return ms;
	}
	
	public void clientsideUITechnology() {
		
	}
	
	
	public void cloudComputing() {
		
	}
	
	public void testingTools() {
		
	}
}
