package mstr.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import mstr.config.Config;
import mstr.utility.CloseBrowser;
import mstr.utility.LaunchApp;

public class FlightFinderPage {
/*
	@FindBy(how=How.XPATH,using="//img[@src='/images/masts/mast_flightfinder.gif']")
	  WebElement objFlightFinderimg;
		
	  @FindBy(how=How.LINK_TEXT,using="SIGN-OFF")
	  WebElement objsignoff;
	  
	  
	  public void loadFlightFinderpage()
	  {
		  PageFactory.initElements(Config.driver, this);
	  }
	  
	  
	  public void verifyFlightFinderimg()
	  {
		  boolean flag=objFlightFinderimg.isDisplayed();
		  System.out.println("Flight Finder image is displayed "+flag);
	  }
	  
	  
	  public void clickonSignoff()
	  {
		  objsignoff.click();
	  }
		
		public static void main(String[] args) throws IOException, InterruptedException 
		{
			LaunchApp lc= new LaunchApp();
			lc.openBrowser("chrome");
			lc.enterApplicationURL("http://www.newtours.demoaut.com/mercurywelcome.php");
			lc.maximizeBrowser();
			lc.waittillLOginPageLoaded(15);
			
			Loginpage lg= new Loginpage();
			lg.loadLoginPage();
			lg.enterusername("Suvidyap2");
			lg.enterpassword("P@ssword2");
			lg.clicklogin();
			
			FlightFinderPage ff = new FlightFinderPage();
			ff.loadFlightFinderpage();
			ff.verifyFlightFinderimg();
			ff.clickonSignoff();
			
			CloseBrowser cb=new CloseBrowser();
			cb.closeBrowser();
			

		}

	}
	*/
	
	
	
	@FindBy(how= How.XPATH, using="//img[@src='/images/masts/mast_flightfinder.gif']")
	 WebElement objFlightFinderImg ;
	
	@FindBy(how= How.LINK_TEXT,using="SIGN-OFF")
	WebElement objsignOff ;
	
	public void loadFlightFinderPage()
	{
		PageFactory.initElements(Config.driver,this);
		
	}
	
	public void verifyFlightFinderimg()
	{
		boolean flag=  objFlightFinderImg.isDisplayed();
		System.out.println("FlightFinderImg is diplayed: "+  flag);
	}
	 
	public void clickonSignOff()
	{
		System.out.println("change here");
		objsignOff.click();
		System.out.println("****clickonSignOff");
	}
	
	public static void main(String[] args) throws IOException, InterruptedException {
		LaunchApp lapp=  new LaunchApp();
		lapp.openBrowser("chrome");
		lapp.enterApplicationURL("http://www.newtours.demoaut.com/mercurywelcome.php");
		lapp.maximizeBrowser();
		lapp.wailTillLoginPageLoad(15);
		
		Loginpage lpg = new  Loginpage();
		lpg.loadLoginPage();
		lpg.enterusername("Suvidyap2");
		lpg.enterpassword("P@ssword2");
		lpg.clicklogin();
		
		FlightFinderPage ff=  new FlightFinderPage();
		ff.loadFlightFinderPage();
		ff.verifyFlightFinderimg();
		ff.clickonSignOff();
		
		CloseBrowser cls = new  CloseBrowser();
		cls.closeBrowser();
		
		
		
		
		
		
	}
}
