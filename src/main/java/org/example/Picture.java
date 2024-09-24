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
}