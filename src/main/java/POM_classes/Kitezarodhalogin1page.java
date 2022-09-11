package POM_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kitezarodhalogin1page {
	//step Declaration
	@FindBy(xpath="//input[@id='userid'] ")private WebElement UN;
	@FindBy(xpath="//input[@id='password'] ")private WebElement pwd;
	@FindBy(xpath="//button[@class='button-orange wide'] ")private WebElement loginbtn;

	//initialization
	public Kitezarodhalogin1page(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//implementation
 public void enterUN(String username){
	 UN.sendKeys("DPG458");
 }
 public void enterpwd(String password){
	pwd.sendKeys("Amol@1234");
 }
 public void clickloginbtn() {
	 loginbtn.click();
 }


}

