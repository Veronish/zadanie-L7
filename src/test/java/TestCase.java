import org.example.OnlinePay;
import org.example.Picture;
import org.junit.jupiter.api.*;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCase {

    private static WebDriver driver = null;
    private static OnlinePay onlinePay = null;
    private static WebDriverWait wait = null;

    @DisplayName("Подготовка")
    @BeforeAll
    static void test0() {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        onlinePay = new OnlinePay(driver);
        wait = new WebDriverWait(driver, 4);
        driver.get("https://mts.by");
        try {
            wait.until(ExpectedConditions.elementToBeClickable(onlinePay.cookiesBtn()));
            onlinePay.ifCookies();
        }catch (TimeoutException ignored){}

    }
    @AfterAll
    static void after(){
        driver.quit();
    }

    @Test
    @DisplayName("Надписи в незаполненных полях")
    void test1() {
        driver.get("https://mts.by");

        Assertions.assertTrue(onlinePay.checkPlaceholder(OnlinePay.conPhone(), "Номер телефона"), "Плейсхолдер Номер телефона не совпадает");
        Assertions.assertTrue(onlinePay.checkPlaceholder(OnlinePay.conSum(), "Сумма"), "Плейсхолдер Сумма не совпадает");
        Assertions.assertTrue(onlinePay.checkPlaceholder(OnlinePay.conEmail(), "E-mail для отправки чека"), "Плейсхолдер E-mail для отправки чека не совпадает");

        onlinePay.selectMenuItem(2);

        Assertions.assertTrue(onlinePay.checkPlaceholder(OnlinePay.intrPhone(), "Номер абонента"), "Плейсхолдер Номер абонента не совпадает");
        Assertions.assertTrue(onlinePay.checkPlaceholder(OnlinePay.intrSum(), "Сумма"), "Плейсхолдер Сумма не совпадает");
        Assertions.assertTrue(onlinePay.checkPlaceholder(OnlinePay.intrEmail(), "E-mail для отправки чека"), "Плейсхолдер E-mail для отправки чека не совпадает");

        onlinePay.selectMenuItem(3);

        Assertions.assertTrue(onlinePay.checkPlaceholder(OnlinePay.instBill(), "Номер счета на 44"), "Плейсхолдер Номер счета на 44 не совпадает");
        Assertions.assertTrue(onlinePay.checkPlaceholder(OnlinePay.instSum(), "Сумма"), "Плейсхолдер Сумма не совпадает");
        Assertions.assertTrue(onlinePay.checkPlaceholder(OnlinePay.instEmail(), "E-mail для отправки чека"), "Плейсхолдер E-mail для отправки чека не совпадает");

        onlinePay.selectMenuItem(4);

        Assertions.assertTrue(onlinePay.checkPlaceholder(OnlinePay.arrBill(), "Номер счета на 2073"), "Плейсхолдер Номер счета на 2073 не совпадает");
        Assertions.assertTrue(onlinePay.checkPlaceholder(OnlinePay.arrSum(), "Сумма"), "Плейсхолдер Сумма не совпадает");
        Assertions.assertTrue(onlinePay.checkPlaceholder(OnlinePay.arrEmail(), "E-mail для отправки чека"), "Плейсхолдер E-mail для отправки чека не совпадает");

    }

    @Test
    @DisplayName("Заполнить поля и нажать продолжить, проверить поля")
    void test2()  {
        driver.get("https://mts.by");
        String coins = "44";
        String tel = "297777777";

        OnlinePay onlinePay = new OnlinePay(driver);
        onlinePay.typeTelephone(tel);
        onlinePay.typeMoney(coins);
        onlinePay.typeEmail("email@email.com");
        onlinePay.submitPay();

        wait.until(onlinePay.switchToFrame());
        wait.until(ExpectedConditions.elementToBeClickable(onlinePay.getSpanFrameLocator()));

        Assertions.assertEquals(driver.findElement(onlinePay.getSpanFrameLocator()).getText(), coins + ".00 BYN", "Сумма в заголовке неправильная");
        Assertions.assertEquals(driver.findElement(onlinePay.getButtonFrameLocator()).getText(), "Оплатить " + coins + ".00 BYN", "Сумма на кнопке неправильная");
        Assertions.assertEquals(driver.findElement(onlinePay.getTelFrameLocator()).getText(), "Оплата: Услуги связи Номер:375" + tel, "Телефон неправильный");


        Assertions.assertEquals("Номер карты", driver.findElement(onlinePay.getCard()).getText(), "Плейсхолдер Номер карты неправильный");
        Assertions.assertEquals("Срок действия", driver.findElement(onlinePay.getCardDate()).getText(), "Плейсхолдер Срок действия неправильный");
        Assertions.assertEquals("Имя держателя (как на карте)", driver.findElement(onlinePay.getCardName()).getText(), "Плейсхолдер Имя держателя (как на карте) неправильный");
        Assertions.assertEquals("CVC", driver.findElement(onlinePay.getCVC()).getText(), "Плейсхолдер CVC неправильный");

        Assertions.assertTrue(Picture.visaPic(driver).isEnabled(), "Visa не отображается");
        Assertions.assertTrue(Picture.mastercardPic(driver).isEnabled(), "Mastercard не отображается");
        Assertions.assertTrue(Picture.belcartPic(driver).isEnabled(), "Белкарт не отображается");
        Assertions.assertTrue((Picture.mirPic(driver).isEnabled()) ||
                (Picture.mir2Pic(driver).isEnabled()), "Мир не отображается");


    }


}
