package recap;

import io.restassured.http.ContentType;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C03_HamcrestMatchers_Post {

    @Test
    public void hamcrestMatchers_Post() {

        String url = "https://petstore.swagger.io/v2/pet";

        String payload ="{\n" +
                "  \"id\": 15,\n" +
                "  \"category\": {\n" +
                "    \"id\": 0,\n" +
                "    \"name\": \"Kopek\"\n" +
                "  },\n" +
                "  \"name\": \"Pamuk\",\n" +
                "  \"photoUrls\": [\n" +
                "    \"string\"\n" +
                "  ],\n" +
                "  \"tags\": [\n" +
                "    {\n" +
                "      \"id\": 0,\n" +
                "      \"name\": \"Sibirya Kurdu\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"status\": \"available\"\n" +
                "}";

        given().when().body(payload).contentType(ContentType.JSON).post(url).prettyPrint();
    }
}
