package global;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseBage {


	public WebDriverWait wait;
	public WebDriver driver;

	public BaseBage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 20);
	}

	public WebElement findElement(By by) {
		waitPageLoad();
		waitVisibility(by);
		return findElement(by);
	}

	public void clickBy(By by) {
		waitPageLoad();
		waitVisibility(by);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(by));
		element.click();
	}

	public void write(By by, String text) {
		waitPageLoad();
		waitVisibility(by);
		findElement(by).sendKeys(text);
	}

	public void selectByValue(By by, String text) {
		waitPageLoad();
		Select select = new Select(findElement(by));
		select.selectByValue(text);
	}

	public void selectByText(By by, String text) {
		waitPageLoad();
		Select select = new Select(findElement(by));
		select.selectByVisibleText(text);
	}

	
	public String getText(By by) {
		waitPageLoad();
		waitVisibility(by);
		return findElement(by).getText();
	}

	public void waitVisibility(By by) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}

	public void waitPageLoad() {
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	}

	public String newEmail() {
		String timestamp = String.valueOf(new Date().getTime());
		return "hf_challenge_" + timestamp + "@hf" + timestamp.substring(7) + ".com";
	}

	public Boolean isTextEquals(By by, String expectedText) {
		waitPageLoad();
		String text = getText(by);
		if (text.equals(expectedText)) {
			return true;
		} else {
			return false;
		}
	}

	public Boolean isTextContains(By by, String expectedText) {
		waitPageLoad();
		String text = getText(by);
		if (text.contains(expectedText)) {
			return true;
		} else {
			return false;
		}
	}

	public Boolean isElementExists(By by) {
		waitPageLoad();
		if (findElement(by).isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}
	
	public Boolean checkUrlContains(String expectedText){
		waitPageLoad();
		String url = driver.getCurrentUrl();
		if (url.contains(expectedText)) {
			return true;
		} else {
			return false;
		}
	}
	
	
}
