package recap;

import io.restassured.http.ContentType;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

public class C01_HamcrestMatchers_Get {

    @Test
    public void hamcrestMatchers_Get() {
        // 1. Set the URL
        String url = "https://petstore.swagger.io/v2/pet/124";

        given().when().get(url)
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("name",containsString("Test1"))
                .body("status",equalTo("available"))
                .body("category.name",equalTo("Test"))
                .body("tags[0].name",equalTo("234"))
                .body("tags.find{it.id==0}.name",equalTo("234"))
                .log().body()
        ;
    }
}