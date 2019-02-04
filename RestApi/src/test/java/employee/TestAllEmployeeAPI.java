package employee;
import base.RestCommonApi;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
public class TestAllEmployeeAPI extends RestCommonApi {
    public static String url="http://info.venturepulse.org:8080/service-webapp/api/AllEmployeeResources";
    @Test
    public void callAllEmployeeResources() {
        Response response = given().when().get(url).then().statusCode(200).extract().response();
        String statusLine = response.getStatusLine();
        int statusCode = response.getStatusCode();
        String body = response.getBody().print();
        Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
        Assert.assertEquals(statusCode, 200);//ok
    }
    @Test
    public void badCallAllEmployeeResources() {
        Response response = null;
        int statusCode = 0;
        try {
            response = given().when().get(url+"fhgfhgcghcg");
            statusCode = response.getStatusCode();
        } catch (Exception ex) {
        }
        Assert.assertEquals(statusCode, 404);//not found
    }
    @Test
    public void serverErrorCallAllEmployeeResources() {
        Response response = null;
        int statusCode = 0;
        try {
            response = given().when().get(url).then().statusCode(200).extract().response();
            statusCode = response.getStatusCode();
        } catch (Exception ex) {
        }
        Assert.assertEquals(statusCode, 200);//ok
    }
}