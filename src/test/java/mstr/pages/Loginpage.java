package mstr.pages;

import java.io.IOException;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import mstr.config.Config;
import mstr.utility.LaunchApp;

public class Loginpage {
	
	@FindBy(how = How.XPATH,  using ="//input[@name='userName']")
	WebElement objusername;

	@FindBy(how= How.XPATH, using ="//input[@name='password']")
	WebElement objpassword;	
	
	@FindBy(how= How.XPATH, using ="//input[@name='login']")
	WebElement objlogin;
	
	
	public void loadLoginPage()
	{
		PageFactory.initElements(Config.driver, this);  //*****PageFactory.initElements(driver, page);
	}
	
	public void enterusername(String username)
	{
		
		objusername.sendKeys(username);
	}
	
	public void enterpassword(String password)
	{
		objpassword.sendKeys(password);
	}
	
	public void clicklogin() throws InterruptedException
	{
				
		objlogin.click();
		System.out.println("*****clicklogin");
	}

	
	public static void main(String[] args) throws IOException, InterruptedException {
		LaunchApp  lapp= new LaunchApp();
		lapp.openBrowser("chrome");
		lapp.enterApplicationURL("http://www.newtours.demoaut.com/mercurywelcome.php");
		lapp.maximizeBrowser();
		lapp.wailTillLoginPageLoad(15);
		
		Loginpage lg =new  Loginpage();
		lg.loadLoginPage();
		lg.enterusername("Suvidyap2");
		lg.enterpassword("P@ssword2");
		lg.clicklogin();
			
	}
}
