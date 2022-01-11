package steps;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MergeLeads extends BaseClass{
	
	public static String leadID;
	
	
	@When("Click on Image beside From Lead text box")
	public void click_on_image_beside_from_lead_text_box() {
		
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
	}
	@Then("Find Leads window should be displayed")
	public void find_leads_window_should_be_displayed() {
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(2));
		
	}
	
	@And("Click on first LeadID and go back to main window and store in a variable")
	public void firstLead() throws InterruptedException
	{
		Thread.sleep(1000);
		leadID=driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody[1]/tr[1]/td[1]/div[1]/a[1]")).getText();
		driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody[1]/tr[1]/td[1]/div[1]/a[1]")).click();
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
		System.out.println(leadID);
	}
	
	
	@When("Click on Image beside To Lead text box")
	public void click_on_image_beside_to_lead_text_box() throws InterruptedException {
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
	}
	
	
	@And("Click on second LeadID and go back to main window")
	public void secondLead() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/following::table/tbody[1]/tr[1]/td[1]/div[1]/a[1]")).click();
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
		
	}
	
	@Then("An alert displays accept it")
	public void alertopens()
	{
		Alert a=driver.switchTo().alert();
		a.accept();
	}
	
	@When("Enter stored LeadId in the LeadID")
	public void enter_stored_lead_id_in_the_textbox() {
		System.out.println("Merged Lead= "+leadID);
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
	    
	}
	@Then("Check whether Lead List has rows to display and display a merge message")
	public void check_whether_has_rows_to_display() {
		String text = driver.findElement(By.className("x-paging-info")).getText();
		System.out.println("Lead Id= "+leadID);
		if (text.contains("No records to display")) {
			System.out.println("Lead Merged");
		} else 
			System.out.println("Lead is not Merged");
	   
	}
	
	
	
	
	
	
	
}
