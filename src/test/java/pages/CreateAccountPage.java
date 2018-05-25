package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import global.BaseBage;

public class CreateAccountPage extends BaseBage {

	private By mrs;
	private By customerFirstName;
	private By customerLastName;
	private By passwordField;
	private By daySelect;
	private By monthSelect;
	private By yearSelect;
	private By companyNameField;
	private By firstAddressField;
	private By secondAddressField;
	private By cityField;
	private By stateSelect;
	private By postCodeField;
	private By otherField;
	private By phoneField;
	private By mobilePhoneField;
	private By aliasField;
	private By submitButton;

	public CreateAccountPage(WebDriver driver) {
		super(driver);
		mrs = By.id("id_gender2");
		customerFirstName = By.id("customer_firstname");
		customerLastName = By.id("customer_lastname");
		passwordField = By.id("passwd");
		daySelect = By.id("days");
		monthSelect = By.id("months");
		yearSelect = By.id("years");
		companyNameField = By.id("company");
		firstAddressField = By.id("address1");
		secondAddressField = By.id("address2");
		cityField = By.id("city");
		stateSelect = By.id("id_state");
		postCodeField = By.id("postcode");
		otherField = By.id("other");
		phoneField = By.id("phone");
		mobilePhoneField = By.id("phone_mobile");
		aliasField = By.id("alias");
		submitButton = By.id("submitAccount");
	}

	public void selectMrs() {
		clickBy(mrs);
	}

	public void writeFirstName(String name) {
		write(customerFirstName, name);
	}

	public void writeLastName(String lastName) {
		write(customerLastName, lastName);
	}

	public void writePassword(String password) {
		write(passwordField, password);
	}

	public void selectDay(String day) {
		selectByValue(daySelect, day);
	}

	public void selectMonth(String month) {
		selectByValue(monthSelect, month);
	}

	public void selectYear(String year) {
		selectByValue(yearSelect, year);
	}

	public void writeCompanyName(String companyName) {
		write(companyNameField, companyName);
	}

	public void writeFirstAddressField(String address) {
		write(firstAddressField, address);
	}

	public void writeSecondAddressField(String address) {
		write(secondAddressField, address);
	}

	public void writeCityName(String cityName) {
		write(cityField, cityName);
	}

	public void selectState(String state) {
		selectByText(stateSelect, state);
	}
	
	public void writePostCode(String postCode) {
		write(postCodeField, postCode);
	}
	
	public void writeOther(String others) {
		write(otherField, others);
	}
	
	public void writePhone(String phone) {
		write(phoneField, phone);
	}
	
	public void writeMobilePhone(String mobilePhone) {
		write(mobilePhoneField, mobilePhone);
	}
	
	public void writeAlias(String alias) {
		write(aliasField, alias);
	}
	
	public void clickSubmitButton() {
		clickBy(submitButton);
	}
}
