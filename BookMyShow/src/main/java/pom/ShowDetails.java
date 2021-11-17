package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * 
 * @author girija
 *
 */
public class ShowDetails {

	public  ShowDetails(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}

	@FindBy(xpath="//button[text()='Login To Proceed']")
	private WebElement loginToProceedBtn;

	@FindBy(xpath="//span[text()='FrontRow Open Mics ']/../../../../../..//button[text()='Proceed']]")
	private WebElement proceedBtnForFrontRowOpenMics;
	
	@FindBy(xpath=" //button[text()='Proceed']")
	private WebElement proceedBtn;
	
	


	//	@FindBy(xpath="//button[text()='Proceed']")
	//	private WebElement proceedBtn;
	//	
	//	public WebElement getProceedBtn() {
	//		return proceedBtn;
	//	}

	public WebElement getProceedBtnForFrontRowOpenMics() {
		return proceedBtnForFrontRowOpenMics;
	}




	public WebElement getProceedBtn() {
		return proceedBtn;
	}




	public WebElement getLoginToProceedBtn() {
		return loginToProceedBtn;
	}


}
