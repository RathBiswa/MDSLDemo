package step_definitions;

import com.sun.istack.internal.NotNull;
import common.Helpers;
import io.cucumber.java.en.And;
import org.assertj.core.api.BDDSoftAssertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.TableSearchPage;

import java.util.List;

public class HighestSalary {
    Helpers helpers = new Helpers();

    @And("user verifies highest salary is matching to {string}")
    public void userVerifiesHighestSalaryIsMatchingTo(@NotNull String aHighestSalary) throws InterruptedException {
        WebElement tableEmployeeDetail = helpers.whenWebTableFound(TableSearchPage.getTableEmployeeDetails());
        List<WebElement> rowsList = tableEmployeeDetail.findElements(By.tagName("tr"));

        String strSalary = null;
        List<Integer> salaryList = null;
        int myTempHighestSalary = 0;

        // traversing through all the rows
        for (int row = 1; row < rowsList.size() - 1; row++) {
            List<WebElement> ColumnRowList = rowsList.get(row).findElements(By.tagName("td"));
            String[] myNewSalary = ColumnRowList.get(5).getText().substring(1).split("/y");
            String myBreakUpSalary[] = myNewSalary[0].split(",");

            int myAddUpSalary = Integer.parseInt(myBreakUpSalary[0].concat(myBreakUpSalary[1]));

            if (myAddUpSalary > myTempHighestSalary) {
                myTempHighestSalary = myAddUpSalary;
            }

        }

        //Truth.assertThat(myTempHighestSalary).isEqualTo(Integer.parseInt(aHighestSalary));
        BDDSoftAssertions softAssert = new BDDSoftAssertions();
        softAssert.then(myTempHighestSalary).isEqualTo(Integer.parseInt(aHighestSalary)).as("Highest salary of Software Engineer not equal " + aHighestSalary);
        softAssert.assertAll();
        helpers.CloseBrowser();
    }
}
