package POM_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteZarodhalogin2page {
	//declaration
		@FindBy(xpath="//input[@id='pin']")private WebElement PIN;
		@FindBy(xpath="//button[@class='button-orange wide']")private WebElement ctnbtn;
		
		
		//intialization
		public KiteZarodhalogin2page (WebDriver driver) {
			PageFactory.initElements(driver, this);
			
		}
		//implimentation
		public void enterPIN(String pinvalue) {
			PIN.sendKeys(pinvalue);
		}
		public void clickctnbtn() {
			ctnbtn.click();
		}		
}
