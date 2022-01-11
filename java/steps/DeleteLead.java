package steps;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteLead extends BaseClass {

    public static String leadID;
	/*@When("Click on {string} link")
	public void click_text(String link)
	{
		driver.findElement(By.linkText(link)).click();
	}
	
	@Then("{string} page will be displayed")
	public void page_display_lead(String page) {
		boolean flag=driver.findElement(By.xpath("//div[text()='"+page+"']")).isDisplayed();
		Assert.assertTrue(flag);
	}
	
	@When("Enter phone number in the textbox as {string}")
	public void enter_text(String text) throws InterruptedException
	{
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(text);
		
	}
	
	@When("Click on {string} button in findby division")
	public void click_on_button_in_findby_division(String phone) {
	    
		driver.findElement(By.xpath("//span[text()='"+phone+"']")).click();
	}
	
	@When("Click on {string} button")
	public void click_on_button(String button) {
	    
		driver.findElement(By.xpath("//button[text()='"+button+"']")).click();
	}
	
	@Then("{string} should be displayed")
	public void lead_list(String leadList)
	{
		driver.findElement(By.xpath("//span[text()='"+leadList+"']")).isDisplayed();
	}
	
	@When("Click on first LeadID link")
	public void firstLeadID() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}*/
	@Then("Store first LeadID in a variable")
	public void store_first_lead_id_in_a_variable() {
		boolean flag=driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).isDisplayed();
	    if(flag) {
	    	 leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
	    	System.out.println(leadID);
	    	}
	    else
	    	System.out.println("No Leads to delete");
	    
	}
	
	@When("Enter stored LeadId in the LeadID textbox")
	public void enter_stored_lead_id_in_the_textbox() {
		System.out.println("Lead ID to delete= "+leadID);
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
	    
	}
	@Then("Check whether Lead List has rows to display and display a message")
	public void check_whether_has_rows_to_display() {
		String text = driver.findElement(By.className("x-paging-info")).getText();
		System.out.println("Lead Id= "+leadID);
		if (text.contains("No records to display")) {
			System.out.println("Lead Deleted");
		} else 
			System.out.println("Lead is not Deleted");
	   
	}
	

}
