package ca.ecentennial.glue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class SeleniumEasy {

    Select daysSelect;

    @Given ("I launched SeleniumEasy web page")
    public void launchSeleniumEasyPage() throws IOException {
        StepHooks.driver.get(PropertyReader.getValue("url"));
    }

    @When("I select Monday from dropDox")
    public void selectMonday(){
        daysSelect = new Select(StepHooks.driver.findElement(By.xpath("//select[@id='select-demo']")));
        daysSelect.selectByIndex(2); // Index 2 is Monday
    }

    @Then("I get the value Monday and the message Monday")
    public void validateSelectedValue(){
        String daySelected = StepHooks.driver.findElement(By.xpath("//select[@id='select-demo']")).getAttribute("value");
        String message = StepHooks.driver.findElement(By.xpath("//p[@class='selected-value']")).getText();

        Assert.assertEquals("Monday", daySelected);
        Assert.assertEquals("Day selected :- Monday", message);
    }
}
