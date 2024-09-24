package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Objects;


public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mts.by");
        OnlinePay onlinePay = new OnlinePay(driver);
        onlinePay.selectMenuItem(2);
        By element = By.id("internet-phone");
        if (onlinePay.checkPlaceholder(element, "Номер абонента ")) {
            System.out.println("Совпадает");
        }
    }

    public static class OnlinePay {
        private final WebDriver driver;
        By telephoneLocator = By.id("connection-phone");
        By moneyLocator = By.id("connection-sum");
        By emailLocator = By.id("connection-email");
        By submitButton = By.cssSelector("#pay-connection button");
        By menuButton = By.cssSelector("#pay__form select");
        By frameLocator = By.className("bepaid-iframe");
        By spanFrameLocator = By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/div/div[1]/span[1]");
        By buttonFrameLocator = By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/button");
        By telFrameLocator = By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/div/div[2]/span");

        public OnlinePay(WebDriver driver) {
            this.driver = driver;
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
        public ExpectedCondition<WebDriver> switchToFrame(){
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
    }
}