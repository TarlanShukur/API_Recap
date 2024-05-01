package recap;

import com.fasterxml.jackson.annotation.JsonAlias;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C04_JsonPath_Get {

    /*{
    "id": 1245,
    "category": {
        "id": 1245,
        "name": "xyz"
    },
    "name": "xyz",
    "photoUrls": [
        "test"
    ],
    "tags": [

    ],
    "status": "available"
}

     */

    @Test
    public void jsonPath_Get() {
        String url = "https://petstore.swagger.io/v2/pet/1245";

        Response response = given().when().get(url);
        JsonPath json = response.jsonPath();

        int id=json.getInt("id");
        String name=json.getString("name");
        System.out.println(id);
        System.out.println(name);
    }
}
