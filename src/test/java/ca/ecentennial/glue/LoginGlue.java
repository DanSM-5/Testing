package ca.ecentennial.glue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginGlue {

    @Given("user launch ecentennial")
    public void login(){
        StepHooks.driver.get("https://e.centennialcollege.ca/");
    }

    @When("user enters credentials")
    public void enterCredentials(){
        StepHooks.driver.findElement(By.xpath("//input[@id='username']")).sendKeys("300987998");
        StepHooks.driver.findElement(By.xpath("//input[@id='password']")).sendKeys("DHosm@S351");
        StepHooks.driver.findElement(By.xpath("//input[@value='Sign In']")).click();
    }

    @Then("user logged into the site")
    public void validateLogin(){
        String currentUrl = StepHooks.driver.getCurrentUrl();
        Assert.assertEquals(currentUrl,"https://e.centennialcollege.ca/d2l/home");
    }
}
