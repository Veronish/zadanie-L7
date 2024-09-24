package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Objects;

public class OnlinePay {
    private static WebDriver driver = null;
    private static WebDriverWait wait =null;
    private final By telephoneLocator = By.id("connection-phone");
    private final By moneyLocator = By.id("connection-sum");
    private final By emailLocator = By.id("connection-email");
    private final By submitButton = By.cssSelector("#pay-connection button");
    private final By menuButton = By.cssSelector(".select__header span");
    private final By frameLocator = By.className("bepaid-iframe");
    private final By spanFrameLocator = By.cssSelector(".pay-description__cost span");
    private final By buttonFrameLocator = By.cssSelector(".card-page__card button");
    private final By telFrameLocator = By.cssSelector(".pay-description__text span");
    private final By card = By.cssSelector(".row.ng-tns-c61-0.ng-star-inserted label");
    private final By cardDate = By.cssSelector(".content.ng-tns-c46-4 label");
    private final By cardName = By.cssSelector(".content.ng-tns-c46-3 label");
    private final By CVC = By.cssSelector(".content.ng-tns-c46-5 label");

    public OnlinePay(WebDriver driver) {
        OnlinePay.driver = driver;
        OnlinePay.wait = new WebDriverWait(driver, 1);
    }

    public static By conPhone() {
        return By.id("connection-phone");
    }

    public static By conSum() {
        return By.id("connection-sum");
    }

    public static By conEmail() {
        return By.id("connection-email");
    }

    public static By intrPhone() {
        return By.id("internet-phone");
    }

    public static By intrSum() {
        return By.id("internet-sum");
    }

    public static By intrEmail() {
        return By.id("internet-email");
    }

    public static By instBill() {
        return By.id("score-instalment");
    }

    public static By instSum() {
        return By.id("instalment-sum");
    }

    public static By instEmail() {
        return By.id("instalment-email");
    }

    public static By arrBill() {
        return By.id("score-arrears");
    }

    public static By arrSum() {
        return By.id("arrears-sum");
    }

    public static By arrEmail() {
        return By.id("arrears-email");
    }

    public void typeTelephone(String telephone) {
        ifCookies();
        driver.findElement(telephoneLocator).sendKeys(telephone);
    }

    public void typeMoney(String money) {

        driver.findElement(moneyLocator).sendKeys(money);
    }

    public void typeEmail(String email) {

        driver.findElement(emailLocator).sendKeys(email);
    }

    public void submitPay() {
        ifCookies();
        driver.findElement(submitButton).click();
    }

    public void selectMenuItem(int meniItem) {

        ifCookies();
        driver.findElement(menuButton).click();
        driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[" + meniItem + "]/p")).click();

    }

    public void ifCookies() {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(cookiesBtn()));
            if (driver.findElement(By.id("cookie-agree")).isDisplayed()) {
                driver.findElement(By.id("cookie-agree")).click();
            }
        }catch (TimeoutException ignored){}


    }

    public boolean checkPlaceholder(By item, String text) {
        return Objects.equals(driver.findElement(item).getAttribute("placeholder"), text);
    }

    public ExpectedCondition<WebDriver> switchToFrame() {
        return ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator);
    }

    public By cookiesBtn() {
        return By.id("cookie-agree");
    }

    public By getSpanFrameLocator() {
        return spanFrameLocator;
    }

    public By getButtonFrameLocator() {
        return buttonFrameLocator;
    }

    public By getTelFrameLocator() {
        return telFrameLocator;
    }

    public By getCard() {
        return card;
    }

    public By getCardDate() {
        return cardDate;
    }

    public By getCardName() {
        return cardName;
    }

    public By getCVC() {
        return CVC;
    }

}
