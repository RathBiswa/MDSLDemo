package step_definitions;

import com.google.common.truth.Truth;
import com.sun.istack.internal.NotNull;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.mk_latn.No;
import org.assertj.core.api.BDDSoftAssertions;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import common.Helpers;

import pages.InputFormPage;
import pages.TableSearchPage;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class InputForm {

    Helpers helpers = new Helpers();
    String theCity;

    @Given("user is on home page")
    public void user_is_on_home_page() throws InterruptedException {
        helpers.launchBrowser();
    }

    @When("user navigates to input form")
    public void userNavigatesToInputForm() throws InterruptedException {
        helpers.navigateToURL("https://www.seleniumeasy.com/test/input-form-demo.html");
    }

    @Then("input form details should be displayed")
    public void inputFormDetailsShouldBeDisplayed() throws InterruptedException {
        Truth.assertThat(helpers.getPageURL()).contains("https://www.seleniumeasy.com/test/input-form-demo.html");
    }

    @And("user enters the first name as {string}")
    public void userFillsAllTheDetailsAsRequired(@NotNull String aValue) throws InterruptedException {
        // Entering First Name
        helpers.whenFieldValueIsEntered(InputFormPage.getTextboxFirstName(), aValue);
    }

    @And("user submits the form")
    public void userSubmitsTheForm() throws InterruptedException {
        // Submit the input form
        helpers.whenClickingButton(InputFormPage.getButtonSend());
        helpers.CloseBrowser();
    }

    @And("user enters the last name as {string}")
    public void userEntersTheLastNameAs(@NotNull String aValue) throws InterruptedException {
        // Entering Last Name
        helpers.whenFieldValueIsEntered(InputFormPage.getTextboxLastName(), aValue);
    }

    @And("user enters the email as {string}")
    public void userEntersTheEmailAs(@NotNull String aValue) throws InterruptedException {
        // Entering Email
        helpers.whenFieldValueIsEntered(InputFormPage.getTextboxEmail(), aValue);
    }

    @And("user enters the phone number as {string}")
    public void userEntersThePhoneNumberAs(@NotNull String aValue) throws InterruptedException {
        // Entering Phone Number
        helpers.whenFieldValueIsEntered(InputFormPage.getTextboxPhone(), aValue);
    }

    @And("user enters the address as {string}")
    public void userEntersTheAddressAs(@NotNull String aValue) throws InterruptedException {
        // Entering Address
        helpers.whenFieldValueIsEntered(InputFormPage.getTextboxAddress(), aValue);
    }

    @And("user enters the city as {string}")
    public void userEntersTheCityAs(@NotNull String aValue) throws InterruptedException {
        // Entering City
        helpers.whenFieldValueIsEntered(InputFormPage.getTextboxCity(), aValue);
    }

    @And("user selects the state as {string}")
    public void userSelectsTheStateAs(@NotNull String aValue) throws InterruptedException {
        // Entering State
        helpers.whenAValueIsSelectedFromDropdownByText(InputFormPage.getDropdownState(), aValue);
    }

    @And("user chooses the hosting option as Yes")
    public void userChoosesTheHostingOptionAs() throws InterruptedException {
        // Entering Hosting
        helpers.whenSelectingRadioButton(InputFormPage.getRadioButtonHostingYes());
    }

    @And("user enters the project description as {string}")
    public void userEntersTheProjectDescriptionAs(@NotNull String aValue) throws InterruptedException {
        // Entering Description
        helpers.whenFieldValueIsEntered(InputFormPage.getTextboxProjectDescription(), aValue);
    }

    @And("user enters the Zip code as {string}")
    public void userEntersTheZipCodeAs(@NotNull String aValue) throws InterruptedException {
        // Entering ZIPCODE
        helpers.whenFieldValueIsEntered(InputFormPage.getTextboxZipcode(), aValue);
    }

    @And("user enters the website as {string}")
    public void userEntersTheWebsiteAs(@NotNull String aValue) throws InterruptedException {
        // Entering Website
        helpers.whenFieldValueIsEntered(InputFormPage.getTextboxWebsite(), aValue);
    }

}
