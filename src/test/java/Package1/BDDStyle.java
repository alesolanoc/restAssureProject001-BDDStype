package Package1;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class BDDStyle {
    @Test
    public void GetBookingIds_VerifyStatusCode() {

        // Given
        given()
                .baseUri("https://restful-booker.herokuapp.com")
                // When
                .when()
                .get("/booking")
                // Then
                .then()
                .statusCode(200)
                .log()
                .all();


    }
}
