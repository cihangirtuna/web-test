package global;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
	public WebDriver driver;
	
	public String existingUserEmail = "hf_challenge_123456@hf12345.com";
	public String existingUserPassword = "12345678";
	public String fullName = "Joe Black";
	
    @Before
    public void setup () {
        driver = new ChromeDriver();
    }
	
    @After
    public void close(){
    	driver.quit();
    }

}
