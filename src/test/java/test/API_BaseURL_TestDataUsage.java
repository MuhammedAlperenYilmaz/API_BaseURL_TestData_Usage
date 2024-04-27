package test;

import baseURLRepository.JsonPlaceHolderBaseURL;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import testDataRepository.JsonPlaceHolderTestData;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.*;

public class API_BaseURL_TestDataUsage extends JsonPlaceHolderBaseURL {
    @Test
    public void test01() {
//1. Create  URL and Request Body
        specJsonPlace.pathParam("pp1", 21);
//2. Create Expected Data
        JsonPlaceHolderTestData jsonPlaceHolder = new JsonPlaceHolderTestData();
        JSONObject expectedBody = jsonPlaceHolder.createExpectedData();
//3. Register response
        Response response = given().spec(specJsonPlace).when().get("{pp1}");
//4. Assertion
        JsonPath responseJsonPath = response.jsonPath();
        assertEquals(jsonPlaceHolder.successStatusCode, response.getStatusCode());
        assertEquals(expectedBody.getInt("userId"), responseJsonPath.getInt("userId"));
        assertEquals(expectedBody.getInt("id"), responseJsonPath.getInt("id"));
        assertEquals(expectedBody.getString("title"), responseJsonPath.getString("title"));
        assertEquals(expectedBody.getString("body"), responseJsonPath.getString("body"));
    }
}
