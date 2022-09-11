package POM_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteZarodhaHomePage {
	//Declaration
		@FindBy(xpath = "//span[@class='user-id']")private WebElement userid;
		
		//intialization
		public KiteZarodhaHomePage(WebDriver driver) {
			PageFactory.initElements(driver, this);
			
		}
		//implimentation
		public String verifyuserid() {
			String actId=userid.getText();
			return actId;
		}
}
