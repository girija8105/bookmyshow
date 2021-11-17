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
public class TicketOptions {
	
	public TicketOptions(WebDriver driver) {
		PageFactory.initElements(driver, this);	
		}
		
	@FindBy(xpath="//span[text()='B Praak Live ']/../../../../..//button[text()='Proceed to Pay']")
	private WebElement proceedToPayBtnForBpraak;
	
	@FindBy(xpath="//span[text()='NamduK - [1 & aaf] Kannada standup comedy ']/../../../../..//button[text()='Proceed to Pay']")
	private WebElement proceedToPayBtnForNamdukKannadaStandupComedy;
	
	@FindBy(xpath="//span[text()='Pottery Workshop(s) for Skill-building and Therapy ']/../../../../..//button[text()='Proceed to Pay']")
	private WebElement proceedToPayBtnForPotteryWorkshop;
	
	@FindBy(xpath="//button[text()='Proceed to Pay']")
	private WebElement proceedToPayBtn;

	public WebElement getProceedToPayBtn() {
		return proceedToPayBtn;
	}

	public WebElement getProceedToPayBtnForBpraak() {
		return proceedToPayBtnForBpraak;
	}

	public WebElement getProceedToPayBtnForNamdukKannadaStandupComedy() {
		return proceedToPayBtnForNamdukKannadaStandupComedy;
	}

	public WebElement getProceedToPayBtnForPotteryWorkshop() {
		return proceedToPayBtnForPotteryWorkshop;
	}
	
	


}
