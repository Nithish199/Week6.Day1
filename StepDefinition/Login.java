package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public ChromeDriver driver;
	
	@Given("open the chrome browser")
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	@Given("load the application")
	public void loadApplicationUrl() {
		driver.get("http://leaftaps.com/opetaps");
	}
	@Given("enter the username as Demosalesmanager")
	public void enterUsername() {
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	}
	@Given("enter the password as crmsfa")
	public void enterPassword() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	}
	@When("click on login button")
	public void clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	@Then("hompage should be displayed")
	public void verifyHomePage() {
		String title = driver.getTitle();
		if(title.equals("Leaftaps")) {
			System.out.println("Homepage is displayed");
		}else
		{
			System.out.println("Homepage is not displayed");
		}
	}
}
