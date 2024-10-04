package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Picture {

    public static WebElement visaPic(WebDriver driver) {
        return driver.findElement(By.cssSelector("img[src='assets/images/payment-icons/card-types/visa-system.svg']"));
    }

    public static WebElement mastercardPic(WebDriver driver) {
        return driver.findElement(By.cssSelector("img[src='assets/images/payment-icons/card-types/mastercard-system.svg']"));
    }

    public static WebElement belcartPic(WebDriver driver) {
        return driver.findElement(By.cssSelector("img[src='assets/images/payment-icons/card-types/belkart-system.svg']"));
    }

    public static WebElement mirPic(WebDriver driver) {
        return driver.findElement(By.cssSelector("img[src='assets/images/payment-icons/card-types/mir-system-ru.svg']"));
    }

    public static WebElement mir2Pic(WebDriver driver) {
        return driver.findElement(By.cssSelector("img[src='assets/images/payment-icons/card-types/maestro-system.svg']"));
    }

    public static WebElement pic1(WebDriver driver) {
        return driver.findElement(By.cssSelector("img[src='/local/templates/new_design/assets/html/images/pages/index/pay/visa.svg']"));
    }

    public static WebElement pic2(WebDriver driver) {
        return driver.findElement(By.cssSelector("img[src='/local/templates/new_design/assets/html/images/pages/index/pay/visa-verified.svg']"));
    }

    public static WebElement pic3(WebDriver driver) {
        return driver.findElement(By.cssSelector("img[src='/local/templates/new_design/assets/html/images/pages/index/pay/mastercard.svg']"));
    }

    public static WebElement pic4(WebDriver driver) {
        return driver.findElement(By.cssSelector("img[src='/local/templates/new_design/assets/html/images/pages/index/pay/mastercard-secure.svg']"));
    }

    public static WebElement pic5(WebDriver driver) {
        return driver.findElement(By.cssSelector("img[src='/local/templates/new_design/assets/html/images/pages/index/pay/belkart.svg']"));
    }
}