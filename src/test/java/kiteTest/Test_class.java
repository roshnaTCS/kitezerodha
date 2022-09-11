package kiteTest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM_classes.KiteZarodhaHomePage;
import POM_classes.KiteZarodhalogin2page;
import POM_classes.Kitezarodhalogin1page;
import base.Baseclass;
import utility.Utility_class;


public class Test_class extends Baseclass {
	//to declare all useful member as global
	Kitezarodhalogin1page login1;
	KiteZarodhalogin2page login2;
	KiteZarodhaHomePage Home;
	
	@BeforeClass
	public void openBrowser() throws Throwable{
		initilizeBrowser();
	
		//all object of pom class
		 login1=new Kitezarodhalogin1page(driver);
		 login2=new KiteZarodhalogin2page(driver);
		 Home=new KiteZarodhaHomePage(driver);
	}

	@BeforeMethod
	public void logintoApplication() throws Throwable {
		//enter un
		login1.enterUN(Utility_class.getTD(0, 0));
		System.out.println(Utility_class.getTD(0, 0));
		
		//enter pwd
		login1.enterpwd(Utility_class.getTD(0, 1));
		System.out.println((Utility_class.getTD(0, 1)));
		
		//click on login btn
		 login1.clickloginbtn();
		
		//enter pin
		login2.enterPIN(Utility_class.getTD(0, 2));
		
		//click on continue button
		login2.clickctnbtn();
	}
@Test
	public void verifyuserID() throws Throwable {
		Reporter.log("Running verify user id",true);
  String actlD = Home.verifyuserid();
  String expID = Utility_class.getTD(0, 0);

Assert.assertEquals(expID, actlD);
}
@AfterMethod
public void logOutApplication() {
	Reporter.log("Logout Application",true);
}
@AfterClass
public void closeBrowser() {
	Reporter.log("close the application",true);
}
}