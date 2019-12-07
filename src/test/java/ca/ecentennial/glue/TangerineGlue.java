package ca.ecentennial.glue;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TangerineGlue {

    @Given("I launch tangerine website")
    public void tangerineLaunch(){
        StepHooks.driver.get("https://www.tangerine.ca/en/index.html");
    }

    @When("I click logmein button")
    public void clickLogmeIn(){
        StepHooks.driver.findElement(By.xpath("//a[@id='mainnav_login']")).click();
    }

    @Then("I validate LogIn button is disabled")
    public void validateDisable(){
        boolean isDisabled = StepHooks.driver.findElement(By.xpath("//button[@id='login_logMeIn']")).isEnabled();
        Assert.assertFalse(isDisabled);
    }

    @When("I add some values to textbox")
    public void addValuesInTextBox(){
        StepHooks.driver.findElement(By.xpath("//input[@id='login_clientId']")).sendKeys("12345");
    }

    @Then("Logme button is enabled")
    public void validateEnabled() throws InterruptedException {
        Thread.sleep(3000);
        boolean isEnabled = StepHooks.driver.findElement(By.xpath("//button[@id='login_logMeIn']")).isEnabled();
        Assert.assertTrue(isEnabled);
    }

}
