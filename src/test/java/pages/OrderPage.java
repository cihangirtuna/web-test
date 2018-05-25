package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import global.BaseBage;

public class OrderPage extends BaseBage{

	private By proceedToCheckoutButtonInSummary;
	private By proceedToCheckoutButtonInAddress;
	private By proceedToCheckoutButtonInShipping;
	private By aggreeCheckbox;
	private By payByBankWireButton;
	private By confirmMyOrderButton;
	private By header;
	private By shippingTab;
	private By paymentTab;
	private By orderCompleteText;
	
	public OrderPage(WebDriver driver) {
		super(driver);
		proceedToCheckoutButtonInSummary = By.xpath("//*[contains(@class,'cart_navigation')]/a[@title='Proceed to checkout']");
		proceedToCheckoutButtonInAddress = By.name("processAddress");
		proceedToCheckoutButtonInShipping = By.name("processCarrier");
		aggreeCheckbox = By.id("uniform-cgv");
		payByBankWireButton = By.className("bankwire");
		confirmMyOrderButton = By.xpath("//*[@id='cart_navigation']/button");
		header = By.cssSelector("h1");
		shippingTab = By.xpath("//li[@class='step_done step_done_last four']");
		paymentTab = By.xpath("//li[@id='step_end' and @class='step_current last']");
		orderCompleteText = By.xpath("//*[@class='cheque-indent']/strong");
	}
	
	public void clickProceedToCheckoutButtonInSummaryTab(){
		clickBy(proceedToCheckoutButtonInSummary);
	}
	
	public void clickProceedToCheckoutButtonInAddressTab(){
		clickBy(proceedToCheckoutButtonInAddress);
	}
	
	public void clickProceedToCheckoutButtonInShippingTab(){
		clickBy(proceedToCheckoutButtonInShipping);
	}

	public void checkedAggreeCheckbox(){
		clickBy(aggreeCheckbox);
	}
	
	public void clickPayByBankWireButton(){
		clickBy(payByBankWireButton);
	}
	
	public void clickConfirmMyOrderButton(){
		clickBy(confirmMyOrderButton);
	}
	
	public void checkHeader(String text){
		Assert.assertTrue(isTextEquals(header, text));
	}
	
	public void checkShippingTabIsExist(){
		Assert.assertTrue(isElementExists(shippingTab));
	}
	
	public void checkPaymentTabIsExist(){
		Assert.assertTrue(isElementExists(paymentTab));
	}
	
	public void checkOrderCompleteText(String text){
		Assert.assertTrue(isTextContains(orderCompleteText, text));
	}
	
	public void checkOrderComplateUrl(String url){
		Assert.assertTrue(checkUrlContains(url));
	}
}
