package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import global.BaseBage;


public class MyAccountPage extends BaseBage{
	
	private By header;
	private By nameSurname;
	private By infoAccount;
	private By logoutButton;
	private By womenLink;
	
	public MyAccountPage(WebDriver driver) {
		super(driver);
		header = By.cssSelector("h1");
		nameSurname = By.className("account");
		infoAccount = By.className("info-account");
		logoutButton = By.className("logout");
		womenLink = By.linkText("Women");
	}
	
	public void checkHeader(String text){
		Assert.assertTrue(isTextEquals(header, text));
	}
	
	public void checkNameSurname(String text){
		Assert.assertTrue(isTextEquals(nameSurname, text));
	}

	public void checkAccountInfo(String text){
		Assert.assertTrue(isTextContains(infoAccount, text));
	}
	
	public void checkLogoutElement(){
		Assert.assertTrue(isElementExists(logoutButton));
	}
	
	public void checkMyAccountUrl(String url){
		Assert.assertTrue(checkUrlContains(url));
	}
	
	public void clickWomenLink(){
		clickBy(womenLink);
	}

}
