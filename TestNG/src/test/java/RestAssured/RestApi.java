package RestAssured;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class RestApi {

    @Test
    public void GetMethod(){
        RestAssured.baseURI ="https://jsonplaceholder.typicode.com/";
        RequestSpecification httprequest = RestAssured.given();
        httprequest.when().get("/posts")
                .then().statusCode(200);

    }
}
