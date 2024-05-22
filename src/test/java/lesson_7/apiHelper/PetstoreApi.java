package lesson_7.apiHelper;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.given;
import static lesson_7.tests.BaseTest.props;

public class PetstoreApi {

    public PetstoreApi() {
        RestAssured.baseURI = props.getProperty("servUrl");
        RestAssured.defaultParser = Parser.JSON;
    }

    public Response post(String endpoint, ResponseSpecification resp, Object body) {
        return given()
                .contentType(ContentType.JSON)
                .body(body)
                .expect()
                .spec(resp)
                .when()
                .post(endpoint);
    }
}
