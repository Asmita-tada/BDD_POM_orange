package orange.stepDefinations;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import orange.pages.OrangeLoginPage;
import orange.util.OrangeTestBase;

public class loginStepDefination extends OrangeTestBase
{     

	
	public OrangeLoginPage lp = new OrangeLoginPage();
	
	public loginStepDefination() throws IOException {
		super();
	}

	@Given("^User is already on OrnageHRM login page$")
	public void user_is_already_on_OrnageHRM_login_page()
	{
		
        initializeOrange();
        PageFactory.initElements(driver, lp);
	}

	@When("^title of loginpage is OrangeHRM$")
	public void title_of_loginpage_is_OrangeHRM() 
	{
	   lp.getTitleOfOrangeHRM();
	}

	@Then("^user enters \"(.*)\" and \"(.*)\" final$")
	public void user_enters_and_final(String user_name, String pass_word) throws Throwable
	{
	    lp.enterUserAndPassword(user_name, pass_word);
    
	}

	@Then("^user clicks on login butoon$")
	public void user_clicks_on_login_butoon()  
	{
	   lp.clickOnLoginBtn();
	}

	@Then("^user is on Homepage$")
	public void user_is_on_Homepage() throws Throwable 
	{
		Assert.assertTrue(lp.validateOnDash());
		lp.validateOnDash();
	  
	}
	
	@When("user click on PIM on Homepage")
	public void user_click_on_pim_on_homepage() 
	{
		 lp.clickonPim();
		
	   
	}

	@Then("user click on add employee on Orangepage")
	public void user_click_on_add_employee_on_orangepage() 
	{
	   lp.addEmp();
	   
	}

	@Then("user enters firstname and lastname and midname and save")
	public void user_enters_firstname_and_lastname_and_midname_and_save(DataTable arg1) throws InterruptedException {
     lp.add_empInfo(arg1);
	}

	@Then("user exit")
	public void user_exit() {
		driver.quit();
	    
	}

}
