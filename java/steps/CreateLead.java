package steps;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead extends BaseClass{

	
	@When("Click on {string} link")
	public void click_text(String link)
	{
		driver.findElement(By.linkText(link)).click();
	}
	
	@Then("{string} page should be displayed")
	public void page_display(String page) {
		boolean flag=driver.findElement(By.xpath("//div[text()='"+page+"']")).isDisplayed();
		Assert.assertTrue(flag);
	}
	@Then("Enter {string} text as {string}")
	public void enter_text(String text1,String text2)
	{
		System.out.println("createLeadForm_"+text1+"");
		driver.findElement(By.id("createLeadForm_"+text1+"")).sendKeys(text2);
	}
	@Then("Click on {string} button")
	public void createLead(String text)
	{
		driver.findElement(By.xpath("//input[@value='"+text+"']")).click();
	}
	
}
