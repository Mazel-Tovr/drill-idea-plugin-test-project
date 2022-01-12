import io.restassured.RestAssured.*
import org.junit.jupiter.api.*

class ApiTests {
    private val appUrl = "http://localhost:8080"

    @Test
    fun registerUser() {
        given()
            .post("$appUrl/api/register?name=user&password=pass").then()
            .statusCode(200)
    }

    @Test
    fun removeUser() {
        given()
            .delete("$appUrl/api/delete?id=user").then()
            .statusCode(200)
    }

    @Test
    fun generateInsurance() {
        given().get("$appUrl/api/generate").then().statusCode(200)
    }

    @Test
    fun buildInsurance() {
        given().get("$appUrl/api/build").then().statusCode(200)
    }
}
