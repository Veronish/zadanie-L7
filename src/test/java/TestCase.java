import org.example.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCase {

    @Test
    @DisplayName("Надписи в незаполненных полях")
    void test1() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mts.by");
        Thread.sleep(500);
        Main.OnlinePay onlinePay = new Main.OnlinePay(driver);

        onlinePay.ifCookies();

        By element = By.id("connection-phone");
        Assertions.assertTrue(onlinePay.checkPlaceholder(element, "Номер телефона"), "Плейсхолдер Номер телефона не совпадает");
        element = By.id("connection-sum");
        Assertions.assertTrue(onlinePay.checkPlaceholder(element, "Сумма"), "Плейсхолдер Сумма не совпадает");
        element = By.id("connection-email");
        Assertions.assertTrue(onlinePay.checkPlaceholder(element, "E-mail для отправки чека"), "Плейсхолдер E-mail для отправки чека не совпадает");
        onlinePay.selectMenuItem(2);
        element = By.id("internet-phone");
        Assertions.assertTrue(onlinePay.checkPlaceholder(element, "Номер абонента"), "Плейсхолдер Номер абонента не совпадает");
        element = By.id("internet-sum");
        Assertions.assertTrue(onlinePay.checkPlaceholder(element, "Сумма"), "Плейсхолдер Сумма не совпадает");
        element = By.id("internet-email");
        Assertions.assertTrue(onlinePay.checkPlaceholder(element, "E-mail для отправки чека"), "Плейсхолдер E-mail для отправки чека не совпадает");
        onlinePay.selectMenuItem(3);
        element = By.id("score-instalment");
        Assertions.assertTrue(onlinePay.checkPlaceholder(element, "Номер счета на 44"), "Плейсхолдер Номер счета на 44 не совпадает");
        element = By.id("instalment-sum");
        Assertions.assertTrue(onlinePay.checkPlaceholder(element, "Сумма"), "Плейсхолдер Сумма не совпадает");
        element = By.id("instalment-email");
        Assertions.assertTrue(onlinePay.checkPlaceholder(element, "E-mail для отправки чека"), "Плейсхолдер E-mail для отправки чека не совпадает");
        onlinePay.selectMenuItem(4);
        element = By.id("score-arrears");
        Assertions.assertTrue(onlinePay.checkPlaceholder(element, "Номер счета на 2073"), "Плейсхолдер Номер счета на 2073 не совпадает");
        element = By.id("arrears-sum");
        Assertions.assertTrue(onlinePay.checkPlaceholder(element, "Сумма"), "Плейсхолдер Сумма не совпадает");
        element = By.id("arrears-email");
        Assertions.assertTrue(onlinePay.checkPlaceholder(element, "E-mail для отправки чека"), "Плейсхолдер E-mail для отправки чека не совпадает");


        Thread.sleep(1500);
        driver.quit();
    }

    @Test
    @DisplayName("Заполнить поня и нажать продолжить, проверить поля")
    void test2() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        driver.get("https://mts.by");
        Thread.sleep(500);
        String coins = "20";
        String tel = "297777777";

        Main.OnlinePay onlinePay = new Main.OnlinePay(driver);
        onlinePay.ifCookies();
        onlinePay.typeTelephone(tel);
        onlinePay.typeMoney(coins);
        onlinePay.typeEmail("email@email.com");
        onlinePay.submitPay();

        Thread.sleep(1500);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.className("bepaid-iframe")));
        Thread.sleep(1500);

        Assertions.assertEquals(driver.findElement(By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/div/div[1]/span[1]")).getText(), coins + ".00 BYN", "Сумма в заголовке неправильная");
        Assertions.assertEquals(driver.findElement(By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/button")).getText(), "Оплатить " + coins + ".00 BYN", "Сумма на кнопке неправильная");
        Assertions.assertEquals(driver.findElement(By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/div/div[2]/span")).getText(), "Оплата: Услуги связи Номер:375" + tel, "Телефон неправильный");


        Assertions.assertEquals("Номер карты", driver.findElement(By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[1]/app-input/div/div/div[1]/label")).getText(), "Плейсхолдер Номер карты неправильный");
        Assertions.assertEquals("Срок действия", driver.findElement(By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[2]/div[1]/app-input/div/div/div[1]/label")).getText(), "Плейсхолдер Срок действия неправильный");
        Assertions.assertEquals("Имя держателя (как на карте)", driver.findElement(By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[3]/app-input/div/div/div[1]/label")).getText(), "Плейсхолдер Имя держателя (как на карте) неправильный");
        Assertions.assertEquals("CVC", driver.findElement(By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[2]/div[3]/app-input/div/div/div[1]/label")).getText(), "Плейсхолдер CVC неправильный");

        Assertions.assertTrue(driver.findElement(By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[1]/app-input/div/div/div[2]/div/div/img[1]")).isDisplayed(), "Visa не отображается");
        Assertions.assertTrue(driver.findElement(By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[1]/app-input/div/div/div[2]/div/div/img[2]")).isDisplayed(), "Mastercard не отображается");
        Assertions.assertTrue(driver.findElement(By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[1]/app-input/div/div/div[2]/div/div/img[3]")).isDisplayed(), "Белкарт не отображается");
        Assertions.assertTrue(driver.findElement(By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[1]/app-input/div/div/div[2]/div/div/div")).isDisplayed(), "Мир не отображается");

        driver.quit();
    }


}
