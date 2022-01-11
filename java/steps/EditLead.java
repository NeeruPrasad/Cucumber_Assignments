package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditLead extends BaseClass {

	

	/*@When("Click on {string}")
	public void click_text(String link)
	{
		driver.findElement(By.linkText(link)).click();
	}
	
	@Then("{string} page should be displayed")
	public void page_display(String page) {
		boolean flag=driver.findElement(By.xpath("//div[text()='"+page+"']")).isDisplayed();
		Assert.assertTrue(flag);
	}*/
	
	@And("Enter phone number in the textbox as {string}")
	public void enter_text(String text) throws InterruptedException
	{
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(text);
		
	}
	
	@When("Click on {string} button in findby division")
	public void click_on_button_in_findby_division(String phone) {
	    
		driver.findElement(By.xpath("//span[text()='"+phone+"']")).click();
	}
	
	@And("Click on {string} button to find Leads")
	public void click_on_button(String button) {
	    
		driver.findElement(By.xpath("//button[text()='"+button+"']")).click();
	}
	
	@Then("{string} should be displayed")
	public void lead_list(String leadList) throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='"+leadList+"']")).isDisplayed();
	}
	
	@When("Click on first LeadID link")
	public void firstLeadID() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}
	
	/*@Then("Click on {string} button")
	public void click_on_update_button(String button) {
	    
		driver.findElement(By.xpath("//input[@value='"+button+"']")).click();
	}*/
	
	@When("Enter company name in the textbox as {string}")
	public void enter_companyName(String text) throws InterruptedException
	{
		
			WebElement e= driver.findElement(By.id("updateLeadForm_companyName"));
			e.clear();
			e.sendKeys(text);
		
	}
	
}
