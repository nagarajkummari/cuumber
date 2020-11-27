package stepDefination;


import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class StepDefination {
	WebDriver driver;
	@Given("^user is on landing page url \"([^\"]*)\"$")
	public void user_is_on_landing_page(String baseurl) throws Throwable {
    	System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
    	driver = new ChromeDriver();
    	driver.get(baseurl);
    	driver.manage().window().maximize();

    }

	@When("^user login (.+) and (.+) is login$")
	public void user_login_something_and_something_is_login(String strArg1, String strArg2) throws Throwable {
    	driver.findElement(By.id("email")).sendKeys(strArg1);
    	driver.findElement(By.id("pass")).sendKeys(strArg2);
    }

    @Then("^Home page is landing$")
    public void home_page_is_landing() throws Throwable {
    	driver.findElement(By.name("login")).click();
    }

    @And("^cards are displayed$")
    public void cards_are_displayed() throws Throwable {
    	driver.close();
    }

}
