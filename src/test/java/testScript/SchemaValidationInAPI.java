package testScript;

import com.github.fge.jsonschema.messages.JsonSchemaValidationBundle;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;

import java.io.File;

import static io.restassured.RestAssured.given;

public class SchemaValidationInAPI {

    public static void main(String[] args) {
      given()
                .baseUri("https://mocki.io/v1/2271a3b1-4689-48a9-bfd7-a86e831941f9")
                .get()
                .then()
                .body(JsonSchemaValidator.matchesJsonSchema(new File("reqres.json")));

    }
}
