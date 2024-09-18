import net.bytebuddy.implementation.bind.annotation.IgnoreForBinding;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Objects;

import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class TestCase {

    @Test
    @DisplayName("Заголовок")
    void test1() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mts.by");
        Thread.sleep(500);

        if (driver.findElement(By.id("cookie-agree")).isDisplayed()) {
            driver.findElement(By.id("cookie-agree")).click();
        }

        //Заголовок
        assumeTrue(driver.getPageSource().contains("Онлайн пополнение <br>без комиссии"), "Заголовок \"Онлайн пополнение без комиссии\" отсутствует на странице или он не правильный");

        Thread.sleep(1500);
        driver.quit();
    }

    @ParameterizedTest
    @DisplayName("Картинки платежных систем")
    @ValueSource(ints = {1, 2, 3, 4, 5})
    @IgnoreForBinding
    void test2(int a) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mts.by");
        Thread.sleep(500);

        if (driver.findElement(By.id("cookie-agree")).isDisplayed()) {
            driver.findElement(By.id("cookie-agree")).click();
        }

        driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[" + a + "]/img")).isDisplayed();
        driver.quit();
    }

    @Test
    @DisplayName("Ссылка подробнее о сервисе")
    void test3() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mts.by");
        Thread.sleep(500);

        if (driver.findElement(By.id("cookie-agree")).isDisplayed()) {
            driver.findElement(By.id("cookie-agree")).click();
        }

        driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/a")).click();
        if (Objects.equals(driver.getCurrentUrl(), "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/")) {
            System.out.println("Ссылка подробнее о сервисе работает");
        }
        driver.quit();
    }

    @Test
    @DisplayName("поля и кнопка продолжить")
    void test4() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mts.by");
        Thread.sleep(500);

        if (driver.findElement(By.id("cookie-agree")).isDisplayed()) {
            driver.findElement(By.id("cookie-agree")).click();
        }

        WebElement telephone = driver.findElement(By.id("connection-phone"));
        WebElement money = driver.findElement(By.id("connection-sum"));
        WebElement email = driver.findElement(By.id("connection-email"));

        telephone.click();
        telephone.sendKeys("297777777");
        money.click();
        money.sendKeys("20");
        email.sendKeys("test@mail.ru");
        Thread.sleep(1500);

        driver.findElement(By.xpath("/html/body/div[6]/main/div/div[4]/div[1]/div/div/div[2]/section/div/div[1]/div[2]/form[1]/button")).click();
        Thread.sleep(2500);
        if (driver.findElement(By.className("bepaid-app")).isDisplayed()) {
            System.out.println("Vse good");
        }


        Thread.sleep(1500);
        driver.quit();
    }

    @Test
    @DisplayName("Картинки платежных систем по-другому")
    void test5() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mts.by");
        Thread.sleep(500);

        if (driver.findElement(By.id("cookie-agree")).isDisplayed()) {
            driver.findElement(By.id("cookie-agree")).click();
        }

        driver.findElement(By.xpath("//img[@alt='Visa']")).isDisplayed();
        driver.findElement(By.xpath("//img[@alt='Verified By Visa']")).isDisplayed();
        driver.findElement(By.xpath("//img[@alt='MasterCard']")).isDisplayed();
        driver.findElement(By.xpath("//img[@alt='MasterCard Secure Code']")).isDisplayed();
        driver.findElement(By.xpath("//img[@alt='Белкарт']")).isDisplayed();

        driver.quit();
    }
}
