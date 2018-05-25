package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import global.BaseBage;

public class ProductPage extends BaseBage{

	private By addCartButton;
	private By proceedToCheckoutButton;
	
	public ProductPage(WebDriver driver) {
		super(driver);
		addCartButton = By.name("Submit");
		proceedToCheckoutButton = By.xpath("//*[@id='layer_cart']//a[@class and @title='Proceed to checkout']");
	}

	public void clickAddCartButton(){
		clickBy(addCartButton);
	}
	
	public void clickProceedToCheckoutButton(){
		clickBy(proceedToCheckoutButton);
	}
}
