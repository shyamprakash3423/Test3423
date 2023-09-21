package stepDefinitions;

import org.openqa.selenium.support.PageFactory;

import com.EveningBatch12Bestdotnettraining.BaseTest.pom.Basetest;
import com.EveningBatch12Bestdotnettraining.Pages.pom.Homepage;
import com.EveningBatch12Bestdotnettraining.Pages.pom.Landingpage;
import com.EveningBatch12Bestdotnettraining.Pages.pom.Launchingpage;
import com.EveningBatch12Bestdotnettraining.Pages.pom.PackagesMenuPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomepagestepDefinitions extends Basetest{

	String Testcasename ="Login with Credentials";
	
	Launchingpage l;
	Landingpage lp;
	Homepage h;
	PackagesMenuPage pm;
	
	
	
	@Given("User is in Landing page")
	public void user_is_in_Landing_page() throws Exception {
		test=extent.startTest(Testcasename);
	    setUp("Chrome");
	    l = new Launchingpage(driver,test);
	    PageFactory.initElements(driver, l);
	  lp=  l.openApplication();
	}

	@When("User performs Login")
	public void user_performs_Login() throws Exception {
	   PageFactory.initElements(driver, lp);
	  h = lp.loginwithCredentials();
	}

	@Then("User is redirected to Homepage")
	public void user_is_redirected_to_Homepage() {
	    System.out.println("Redirected to Homepage");
	    
	    
	}
	
	@Then("User will now click on Packages menu")
	public void user_will_now_click_on_Packages_menu() {
	   PageFactory.initElements(driver, h);
	   pm = h.packagesMenu();
	}

	@Then("User will Select software Testing Package")
	public void user_will_Select_software_Testing_Package() throws Exception {
		
		PageFactory.initElements(driver, pm);
		pm.softwareTesting();
	
		
		extent.endTest(test);
	    extent.flush();
	    extent.close();
	}



}
