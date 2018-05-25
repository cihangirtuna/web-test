package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import global.BaseBage;

public class HomePage extends BaseBage {

	private By loginButton;

	public HomePage(WebDriver driver) {
		super(driver);
		loginButton = By.className("login");
	}

	public void goHomePage() {
		driver.navigate().to("http://automationpractice.com/index.php");
		waitPageLoad();
	}

	public void clickLoginButton() {
		clickBy(loginButton);
	}

}
