package StepDefinition;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditLead extends Base {

	@When ("click on CRMSFA link button")
	public void CRMSFA() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}

	@Then ("home page should be displayed")
	public void VerifyHomePage() {
		String title = driver.getTitle();
		if (title.equals("My Home")) {
			System.out.println("My Home Page is displayed");
		} else {
			System.out.println("My Home Page is not displayed");
		}
	}

	@When ("click on Leads button")
	public void LeadsButton() {
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
	}

	@Then ("My leads page is opened")
	public void verifyLeadsPage() {
		String title = "My Leads";
		String acttitle = driver.getTitle();
		Assert.assertEquals(title, acttitle);
	}

	@When("click on find leads button")
	public void FindLead() {
		driver.findElement(By.linkText("Find Leads")).click();

	}

	@Then("find leads page is opened")
	public void verifyFindLead() {
		String title1 = "Find Leads";
		String acttitle1 = driver.getTitle();
		Assert.assertEquals(title1, acttitle1);
	}

	@When ("click on Phone")
	public void clickPhone() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
	}

	@Given ("Phone Number")
	public void enterPhoneNumber() {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
	}

	@When ("click on find leads search button")
	public void FindLeadButton() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

	}

	@Then (" leads list is displayed")
	public void verifyLeadList() {
		String title2 = "Leads List";
		String acttitle2 = driver.findElement(By.xpath("//span[text()='Lead List']")).getText();
		Assert.assertEquals(title2, acttitle2);

	}

	@When ("click on first lead Id")
	public void firstLead() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}
	
	@Then ("view lead page is opened")
	public void verifyViewLead() {
		String title3 = "View Lead";
		String acttitle3 = driver.getTitle();
		Assert.assertEquals(title3, acttitle3);
	}
	
	@When ("click on edit button")
	public void EditButton() {
		driver.findElement(By.linkText("Edit")).click();
	}

	@Then ("edit lead has been displayed")
	public void verifyeditlead() {
		String title3 = "Edit Lead";
		String acttitle3 = driver.findElement(By.xpath("//div[text()='Edit Lead']")).getText();
		Assert.assertEquals(title3, acttitle3);
	}
	
	@Given ("company Name")
	public void companyName() {
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TCS");
	}
	
	@When ("click on update button")
	public void updateButton() {
		driver.findElement(By.name("submitButton")).click();
	}
	
	@Then ("view lead page is displayed")
	public void verifyViewLead2() {
		String title4 = "View Lead";
		String acttitle4 = driver.getTitle();
		Assert.assertEquals(title4, acttitle4);
	}

}
