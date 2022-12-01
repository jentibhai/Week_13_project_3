package utilities;

import browsertesting.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utility extends BaseTest {
    //This method will click on element
    public void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    //This method will find element and send data
    public void sendTextToElement(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    public void selectByVisibleTextFromDropDown(By by, String option) {
        WebElement dropDown = driver.findElement(by);
        Select select = new Select(dropDown);
        //select by visible text
        select.selectByVisibleText(option);
    }

    public void verifyText(String expectedMessage, By by, String message) {
        WebElement actualTextMessageElement = driver.findElement(by);
        String actualMessage = actualTextMessageElement.getText();
        Assert.assertEquals(message, expectedMessage, actualMessage);
    }

    public void mouseHover(By by){
        Actions actions = new Actions(driver);
        WebElement hover = driver.findElement(by);
        actions.moveToElement(hover).build().perform();
    }




}