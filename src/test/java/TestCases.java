import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;


public class TestCases {

    @Test
    @DisplayName("Проверяем значения при запросе get")
    void test1() {

        given().log().body().contentType("application/json").baseUri("https://postman-echo.com/get").when().get().then().log().body().statusCode(200)
                .and().body("headers.host", equalTo("postman-echo.com"))
                .and().body("headers.connection", equalTo("close"))
                .and().body("headers.x-forwarded-proto", equalTo("https"))
                .and().body("headers.x-forwarded-port", equalTo("443"))
                .and().body("headers.content-type", equalTo("application/json; charset=UTF-8"))
                .and().body("headers.accept", equalTo("*/*"))
                .and().body("headers.user-agent", equalTo("Apache-HttpClient/4.5.3 (Java/11.0.23)"))
                .and().body("headers.accept-encoding", equalTo("gzip,deflate"))
                .and().body("url", equalTo("https://postman-echo.com/get"));
    }

    @Test
    @DisplayName("Проверяем значения при запросе post")
    void test2() {

        given().log().body().contentType("application/json").baseUri("https://postman-echo.com/post").when().post().then().log().body().statusCode(200)
                .and().body("headers.host", equalTo("postman-echo.com"))
                .and().body("headers.connection", equalTo("close"))
                .and().body("headers.content-length", equalTo("0"))
                .and().body("headers.x-forwarded-proto", equalTo("https"))
                .and().body("headers.x-forwarded-port", equalTo("443"))
                .and().body("headers.content-type", equalTo("application/json; charset=UTF-8"))
                .and().body("headers.accept", equalTo("*/*"))
                .and().body("headers.user-agent", equalTo("Apache-HttpClient/4.5.3 (Java/11.0.23)"))
                .and().body("headers.accept-encoding", equalTo("gzip,deflate"))
                .and().body("url", equalTo("https://postman-echo.com/post"));

    }

    @Test
    @DisplayName("Проверяем значения при запросе put")
    void test3() {
        given().log().body().contentType("application/json").baseUri("https://postman-echo.com/put").when().put().then().log().body().statusCode(200)
                .and().body("headers.host", equalTo("postman-echo.com"))
                .and().body("headers.connection", equalTo("close"))
                .and().body("headers.content-length", equalTo("0"))
                .and().body("headers.x-forwarded-proto", equalTo("https"))
                .and().body("headers.x-forwarded-port", equalTo("443"))
                .and().body("headers.content-type", equalTo("application/json; charset=UTF-8"))
                .and().body("headers.accept", equalTo("*/*"))
                .and().body("headers.user-agent", equalTo("Apache-HttpClient/4.5.3 (Java/11.0.23)"))
                .and().body("headers.accept-encoding", equalTo("gzip,deflate"))
                .and().body("url", equalTo("https://postman-echo.com/put"));

    }

    @Test
    @DisplayName("Проверяем значения при запросе patch")
    void test4() {
        given().log().body().contentType("application/json").baseUri("https://postman-echo.com/patch").when().patch().then().log().body().statusCode(200)
                .and().body("headers.host", equalTo("postman-echo.com"))
                .and().body("headers.connection", equalTo("close"))
                .and().body("headers.content-length", equalTo("0"))
                .and().body("headers.x-forwarded-proto", equalTo("https"))
                .and().body("headers.x-forwarded-port", equalTo("443"))
                .and().body("headers.content-type", equalTo("application/json; charset=UTF-8"))
                .and().body("headers.accept", equalTo("*/*"))
                .and().body("headers.user-agent", equalTo("Apache-HttpClient/4.5.3 (Java/11.0.23)"))
                .and().body("headers.accept-encoding", equalTo("gzip,deflate"))
                .and().body("url", equalTo("https://postman-echo.com/patch"));
    }

    @Test
    @DisplayName("Проверяем значения при запросе delete")
    void test5() {
        given().log().body().contentType("application/json").baseUri("https://postman-echo.com/delete").when().delete().then().log().body().statusCode(200)
                .and().body("headers.host", equalTo("postman-echo.com"))
                .and().body("headers.connection", equalTo("close"))
                .and().body("headers.x-forwarded-proto", equalTo("https"))
                .and().body("headers.x-forwarded-port", equalTo("443"))
                .and().body("headers.content-type", equalTo("application/json; charset=UTF-8"))
                .and().body("headers.accept", equalTo("*/*"))
                .and().body("headers.user-agent", equalTo("Apache-HttpClient/4.5.3 (Java/11.0.23)"))
                .and().body("headers.accept-encoding", equalTo("gzip,deflate"))
                .and().body("url", equalTo("https://postman-echo.com/delete"));
    }
}
