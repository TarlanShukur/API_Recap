package recap;

import io.restassured.http.ContentType;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class C02_HamcrestMatchers_GetList {

    @Test
    public void hamcrestMatchers_GetList() {
        String url = "https://petstore.swagger.io/v2/pet/findByStatus?status=available";

        given().when().get(url)
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("id",hasItem(15))
                .body("name", hasItem("Animal"))
                .body("name",hasItems("Animal","red"))
                .body("id", hasSize(greaterThan(50)))
                .body("id", hasSize(lessThan(1500)))
                .body("[0].category.id", equalTo(0))
                .body("[0].category.photoUrls[0]", equalTo("string"))
                .body("[0]tags.id[0]",equalTo(0))
        ;


    }
}
