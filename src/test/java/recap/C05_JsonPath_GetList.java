package recap;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;

public class C05_JsonPath_GetList {

    @Test
    public void JsonPath_GetList() {

        String url = "https://petstore.swagger.io/v2/pet/findByStatus?status=available";

        Response response = given().when().get(url);
        JsonPath json = response.jsonPath();

        assertEquals(200, response.statusCode());
        assertEquals("application/json", response.contentType());
        assertTrue(json.getList("findAll{it.id==9898}").isEmpty());
        


    }
}
