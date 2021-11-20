package StepDefinition;

import org.openqa.selenium.By;

public class CreateLead extends Base {

	public void CRMSFA() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}

	public void VerifyHomePage() {
		String title = driver.getTitle();
		if (title.equals("My Home")) {
			System.out.println("My Home Page is displayed");
		} else {
			System.out.println("My Home Page is not displayed");
		}
	}

	public void LeadsButton() {
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
	}

	public void verifyLeadsPage() {
		String title1 = driver.getTitle();
		if (title1.equals("My Leads")) {
			System.out.println("My Leads Page is displayed");
		} else {
			System.out.println("My Leads Page is not displayed");
		}
	}

	public void CreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();

	}

	public void verifyCreateLead() {
		String title2 = driver.getTitle();
		if (title2.equals("Create Lead")) {
			System.out.println("Create Lead Page is displayed");
		} else {
			System.out.println("Create Lead Page is not displayed");
		}
	}

	public void enterCompanyName() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("HCL");
	}

	public void enterFirstName() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nithish");
	}

	public void enterLastName() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("K");
	}

	public void enterPhoneNumber() {
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
	}

	public void SubmitButton() {
		driver.findElement(By.name("SubmitButton")).click();

	}

	public void verifyLeadPage() {
		String title3 = driver.getTitle();
		if (title3.equals("View Lead")) {
			System.out.println("View Lead Page is displayed");
		} else {
			System.out.println("View Lead Page is not displayed");
		}

	}
}
