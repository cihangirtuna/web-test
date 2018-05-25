package tests;

import org.junit.Test;

import global.BaseTest;
import pages.CategoryPage;
import pages.CreateAccountPage;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;
import pages.OrderPage;
import pages.ProductPage;

public class TestClass extends BaseTest {

	@Test
	public void signInTest() {
		HomePage homePage = new HomePage(driver);
		homePage.goHomePage();
		homePage.clickLoginButton();

		LoginPage loginPage = new LoginPage(driver);
		loginPage.writeNewEmail(loginPage.newEmail());
		loginPage.clickCreateButton();

		CreateAccountPage createAccountPage = new CreateAccountPage(driver);
		createAccountPage.selectMrs();
		createAccountPage.writeFirstName("Firstname");
		createAccountPage.writeLastName("Lastname");
		createAccountPage.writePassword("Qwerty");
		createAccountPage.selectDay("1");
		createAccountPage.selectMonth("1");
		createAccountPage.selectYear("2000");
		createAccountPage.writeCompanyName("Company");
		createAccountPage.writeFirstAddressField("Qwerty, 123");
		createAccountPage.writeSecondAddressField("zxcvb");
		createAccountPage.writeCityName("Qwerty");
		createAccountPage.selectState("Colorado");
		createAccountPage.writePostCode("12345");
		createAccountPage.writeOther("Qwerty");
		createAccountPage.writePhone("12345123123");
		createAccountPage.writeMobilePhone("12345123123");
		createAccountPage.writeAlias("hf");
		createAccountPage.clickSubmitButton();

		MyAccountPage myAccountPage = new MyAccountPage(driver);
		myAccountPage.checkHeader("MY ACCOUNT");
		myAccountPage.checkNameSurname("Firstname Lastname");
		myAccountPage.checkAccountInfo("Welcome to your account.");
		myAccountPage.checkLogoutElement();
		myAccountPage.checkMyAccountUrl("controller=my-account");
	}

	@Test
	public void logInTest() {

		HomePage homePage = new HomePage(driver);
		homePage.goHomePage();
		homePage.clickLoginButton();

		LoginPage loginPage = new LoginPage(driver);
		loginPage.writeEmail(existingUserEmail);
		loginPage.writePassword(existingUserPassword);
		loginPage.clickLoginButton();

		MyAccountPage myAccountPage = new MyAccountPage(driver);
		myAccountPage.checkHeader("MY ACCOUNT");

		myAccountPage.checkNameSurname(fullName);
		myAccountPage.checkAccountInfo("Welcome to your account.");
		myAccountPage.checkLogoutElement();
		myAccountPage.checkMyAccountUrl("controller=my-account");

	}

	@Test
	public void checkoutTest() {

		HomePage homePage = new HomePage(driver);
		homePage.goHomePage();
		homePage.clickLoginButton();

		LoginPage loginPage = new LoginPage(driver);
		loginPage.writeEmail(existingUserEmail);
		loginPage.writePassword(existingUserPassword);
		loginPage.clickLoginButton();

		MyAccountPage myAccountPage = new MyAccountPage(driver);
		myAccountPage.clickWomenLink();

		CategoryPage categoryPage = new CategoryPage(driver);
		categoryPage.clickFadedShortSleeve();
		categoryPage.clickFadedShortSleeve();

		ProductPage productPage = new ProductPage(driver);
		productPage.clickAddCartButton();
		productPage.clickProceedToCheckoutButton();

		OrderPage orderPage = new OrderPage(driver);
		orderPage.clickProceedToCheckoutButtonInSummaryTab();
		orderPage.clickProceedToCheckoutButtonInAddressTab();
		orderPage.checkedAggreeCheckbox();
		orderPage.clickProceedToCheckoutButtonInShippingTab();
		orderPage.clickPayByBankWireButton();
		orderPage.clickConfirmMyOrderButton();

		orderPage.checkHeader("ORDER CONFIRMATION");
		orderPage.checkShippingTabIsExist();
		orderPage.checkPaymentTabIsExist();
		orderPage.checkOrderCompleteText("Your order on My Store is complete.");
		orderPage.checkOrderComplateUrl("controller=order-confirmation");

	}
}
