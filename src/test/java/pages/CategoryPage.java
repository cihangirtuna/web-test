package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import global.BaseBage;

public class CategoryPage extends BaseBage{
	
	private By fadedShortSleeve;

	public CategoryPage(WebDriver driver) {
		super(driver);
		fadedShortSleeve = By.xpath("//a[@title='Faded Short Sleeve T-shirts']/ancestor::li");	
	}

	public void clickFadedShortSleeve(){
		clickBy(fadedShortSleeve);
	}
	
}
