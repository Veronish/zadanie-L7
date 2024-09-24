package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Objects;

public class OnlinePay {
    private final WebDriver driver;
    By telephoneLocator = By.id("connection-phone");
    By moneyLocator = By.id("connection-sum");
    By emailLocator = By.id("connection-email");
    By submitButton = By.cssSelector("#pay-connection button");
    By menuButton = By.cssSelector(".select__header span");
    By frameLocator = By.className("bepaid-iframe");
    By spanFrameLocator = By.cssSelector(".pay-description__cost span");
    By buttonFrameLocator = By.cssSelector(".card-page__card button");
    By telFrameLocator = By.cssSelector(".pay-description__text span");
    By card = By.cssSelector(".row.ng-tns-c61-0.ng-star-inserted label");
    By cardDate = By.cssSelector(".content.ng-tns-c46-4 label");
    By cardName = By.cssSelector(".content.ng-tns-c46-3 label");
    By CVC = By.cssSelector(".content.ng-tns-c46-5 label");

    public OnlinePay(WebDriver driver) {
        this.driver = driver;
    }

    public static By conPhone(WebDriver driver) {
        return By.id("connection-phone");
    }

    public static By conSum(WebDriver driver) {
        return By.id("connection-sum");
    }

    public static By conEmail(WebDriver driver) {
        return By.id("connection-email");
    }

    public static By intrPhone(WebDriver driver) {
        return By.id("internet-phone");
    }

    public static By intrSum(WebDriver driver) {
        return By.id("internet-sum");
    }

    public static By intrEmail(WebDriver driver) {
        return By.id("internet-email");
    }

    public static By instBill(WebDriver driver) {
        return By.id("score-instalment");
    }

    public static By instSum(WebDriver driver) {
        return By.id("instalment-sum");
    }

    public static By instEmail(WebDriver driver) {
        return By.id("instalment-email");
    }

    public static By arrBill(WebDriver driver) {
        return By.id("score-arrears");
    }

    public static By arrSum(WebDriver driver) {
        return By.id("arrears-sum");
    }

    public static By arrEmail(WebDriver driver) {
        return By.id("arrears-email");
    }

    public void typeTelephone(String telephone) {
        driver.findElement(telephoneLocator).sendKeys(telephone);
    }

    public void typeMoney(String money) {
        driver.findElement(moneyLocator).sendKeys(money);
    }

    public void typeEmail(String email) {
        driver.findElement(emailLocator).sendKeys(email);
    }

    public void submitPay() {
        driver.findElement(submitButton).click();
    }

    public void selectMenuItem(int meniItem) throws InterruptedException {

        ifCookies();
        driver.findElement(menuButton).click();
        driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[" + meniItem + "]/p")).click();
        Thread.sleep(500);
    }

    public void ifCookies() throws InterruptedException {
        Thread.sleep(500);
        if (driver.findElement(By.id("cookie-agree")).isDisplayed()) {
            driver.findElement(By.id("cookie-agree")).click();
        }
    }

    public boolean checkPlaceholder(By item, String text) {
        return Objects.equals(driver.findElement(item).getAttribute("placeholder"), text);
    }

    public ExpectedCondition<WebDriver> switchToFrame() {
        return ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator);
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
