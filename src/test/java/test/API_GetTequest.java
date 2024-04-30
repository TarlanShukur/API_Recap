package test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.Test;

import static io.restassured.path.json.JsonPath.given;

public class API_GetTequest {

    @Test
    public void get01() {
        String url = "https://jsonplaceholder.typicode.com/posts/44";

        JSONObject expBody = new JSONObject();

        expBody.put("userId",5);
        expBody.put("title","optio dolor molestias sit");

        RestAssured.given().when().get(url).then()
                .assertThat().statusCode(200)
                .contentType(ContentType.JSON);
        


    }





}
