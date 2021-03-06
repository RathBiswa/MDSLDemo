package common;

import com.sun.istack.internal.NotNull;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Helpers {
    private static WebDriver driver = new ChromeDriver();

    public void launchBrowser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        //driver.get("https://www.seleniumeasy.com");
        Thread.sleep(500);
    }

    public void CloseBrowser() throws InterruptedException {
        driver.close();
    }

    public String getPageURL() throws InterruptedException {
        return driver.getCurrentUrl();
    }

    public void navigateToURL(@NotNull String anExpectedURL) throws InterruptedException {
        driver.get(anExpectedURL);
        Thread.sleep(500);
    }

    public void whenFieldValueIsEntered(@NotNull String aWebElement, @NotNull String anExpectedValue) throws InterruptedException {
        driver.findElement(By.xpath(aWebElement)).clear();
        driver.findElement(By.xpath(aWebElement)).sendKeys(anExpectedValue);
        Thread.sleep(1000);
    }

    public void whenAValueIsSelectedFromDropdownByText(@NotNull String aWebElement, @NotNull String anExpectedValue) throws InterruptedException {
        Select dropdownState = new Select(driver.findElement(By.xpath(aWebElement)));
        dropdownState.selectByVisibleText(anExpectedValue);
        Thread.sleep(1000);
    }

    public void whenSelectingRadioButton(@NotNull String aWebElement) throws InterruptedException {
        WebElement RadioHostingYes = driver.findElement(By.xpath(aWebElement));
        RadioHostingYes.click();
        Thread.sleep(1000);
    }

    public void whenClickingButton(@NotNull String aWebElement) throws InterruptedException {
        driver.findElement(By.xpath(aWebElement)).click();
        Thread.sleep(1000);
    }
    public WebElement whenWebTableFound(@NotNull String aWebElement) throws InterruptedException {
        WebElement table = driver.findElement(By.xpath(aWebElement));
        Thread.sleep(1000);
        return table;
    }

}
