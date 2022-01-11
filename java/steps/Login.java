package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login extends BaseClass {
	
	/*public ChromeDriver driver;
	
	@Given("Open the Chrome Browser")
	public void open_the_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	    
	}
	@Given("Load the application url")
	public void load_the_application_url() {
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	   
	}*/
	@Given("Enter username as {string}")
	public void enter_username_as_demo_sales_manager(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	   
	}
	@Given("Enter password as {string}")
	public void enter_password_as_crmsfa(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
	  
	}
	@When("Click on login button")
	public void click_on_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	    
	}
	@Then("HomePage should be displayed")
	public void home_page_should_be_displayed() {
		boolean flag=driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		Assert.assertTrue(flag);
	    
	}
	@But("Error Message should be displayed")
	public void error_message()
	{
		System.out.println("Error Message");
	}
	
	

}
