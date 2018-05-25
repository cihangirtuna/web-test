package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import global.BaseBage;

public class LoginPage extends BaseBage {

	private By submitCreateButton;
	private By newEmailArea;
	private By emailArea;
	private By passwordlArea;
	private By loginButton;
	
	public LoginPage(WebDriver driver) {
		super(driver);
		submitCreateButton = By.id("SubmitCreate");
		newEmailArea = By.id("email_create");
		emailArea = By.id("email");
		passwordlArea = By.id("passwd");
		loginButton = By.id("SubmitLogin");
		
	}
	
	public void clickCreateButton() {
		clickBy(submitCreateButton);
	}
	
	public void writeNewEmail(String newEmail){
		write(newEmailArea, newEmail);
	}
	
	public void writeEmail(String email){
		write(emailArea, email);
	}
	
	public void writePassword(String pwd){
		write(passwordlArea, pwd);
	}
	
	public void clickLoginButton() {
		clickBy(loginButton);
	}
}
