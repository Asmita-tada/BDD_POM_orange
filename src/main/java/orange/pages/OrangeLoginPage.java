package orange.pages;

import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.cucumber.datatable.DataTable;
import orange.util.OrangeTestBase;

public class OrangeLoginPage extends OrangeTestBase {
	
	@FindBy(name = "username")
    public WebElement uname;
    
    @FindBy(name = "password")
    public WebElement pwd;
   
    @FindBy(xpath = "//form[@class='oxd-form']/div[3]")
    WebElement loginBtn;
   
    @FindBy(xpath = "//span[@class='oxd-topbar-header-breadcrumb']")
   WebElement dash;  
    
    @FindBy(linkText = "PIM")
    public WebElement pim;
    
    @FindBy(linkText = "Add Employee")
    public WebElement aemp;
    
    @FindBy(name = "firstName")
    public WebElement fname;
    
    @FindBy(name = "lastName")
    public WebElement lname;
    
    @FindBy(name = "middleName")
    public WebElement mname;
    
    @FindBy(xpath = "//button[@type='submit']")
    WebElement submit;  
    
    @FindBy(linkText = "Add Employee")
    WebElement Addemp;
    
    public OrangeLoginPage() throws IOException
    {  		    
    	super();
    }
    
    
    public String getTitleOfOrangeHRM()
    {
            return driver.getTitle();
    }
    
    public void enterUserAndPassword(String user_name, String pass_word) throws InterruptedException {
    	Thread.sleep(5000);
       uname.sendKeys(user_name);
       pwd.sendKeys(pass_word);

    }
    
    public void clickOnLoginBtn() {
    	//driver.findElement(By.xpath("//form[@class='oxd-form']/div[3]")).click();
        loginBtn.click();
    }
    
    public boolean validateOnDash() {
    	//boolean flag1 =	driver.findElement(By.xpath("//span[@class='oxd-topbar-header-breadcrumb']")).isDisplayed();
       boolean flag1 = dash.isDisplayed();
       return flag1;
    }
    
    public void clickonPim()
    {
    	pim.click();
    }
    
    public void addEmp()
    {
    	aemp.click();
    }
    
    public void add_empInfo(DataTable arg1) throws InterruptedException
    {
    	for(Map<String, String> data : arg1.asMaps(String.class, String.class)) 
		{
			Thread.sleep(3000);
		fname.sendKeys(data.get("fname"));
		lname.sendKeys(data.get("lname"));
		mname.sendKeys(data.get("midname"));	
		Thread.sleep(3000);
		submit.click();
		Thread.sleep(3000);
		 Addemp.click();
		}
    }

}
