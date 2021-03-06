package step_definitions;

import com.sun.istack.internal.NotNull;
import common.Helpers;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.BDDSoftAssertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.TableSearchPage;

import java.util.List;

public class AverageAge {

    Helpers helpers = new Helpers();
    String theCity;

    @When("user navigates to table search page")
    public void userNavigatesToTableSearchPage() throws InterruptedException {
        // provide url to navigate
        helpers.navigateToURL("https://www.seleniumeasy.com/test/table-sort-search-demo.html");
    }

    @Then("searches for all employees in a particular {string}")
    public void searchesForAllUsersInAParticularCity(@NotNull String aValue) throws InterruptedException {
        helpers.whenFieldValueIsEntered(TableSearchPage.getTextboxSearch(), aValue);
    }

    @And("user verifies average age of all employees matches to {int}")
    public void userVerifiesAverageAgeOfAllEmployeesMatchesAge(int aAgeValue) throws InterruptedException {

        WebElement tableEmployeeDetail = helpers.whenWebTableFound(TableSearchPage.getTableEmployeeDetails());
        List<WebElement> rowsList = tableEmployeeDetail.findElements(By.tagName("tr"));

        int strTotalAge = 0;

        // traversing through all the rows
        for (int row = 1; row < rowsList.size() - 1; row++) {
            List<WebElement> ColumnRowList = rowsList.get(row).findElements(By.tagName("td"));
            strTotalAge = strTotalAge + Integer.parseInt(ColumnRowList.get(3).getText());
        }

        int AverageAge = strTotalAge / rowsList.size();

        BDDSoftAssertions softAssert = new BDDSoftAssertions();
        softAssert.then(AverageAge).isEqualTo(aAgeValue).
                as("Average age of all employees in  " + theCity + " is not equal to 46");
        helpers.CloseBrowser();
        softAssert.assertAll();
    }
}
