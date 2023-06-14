package Base.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Pojoclass extends Baseclass{

	
	public  Pojoclass() {
		PageFactory.initElements(driver, this);

	}
	@FindBy(id="email")
	private WebElement email;
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	@FindBy(name="login")
	private WebElement loginbtn;
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
	
}
