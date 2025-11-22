package examples;

import org.example.User;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.emptyString;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.not;

class userTests {
    private static final String baseUrl = "https://petstore.swagger.io/v2";

    @Test
    void createUserSmokeTest() {
        String body = """
                {
                  "id": 0,
                  "username": "string",
                  "firstName": "string",
                  "lastName": "string",
                  "email": "string",
                  "password": "string",
                  "phone": "string",
                  "userStatus": 0
                }
                """;

        given()
                .baseUri(baseUrl)
                .contentType("application/json")
                .accept("application/json")
                .when()
                .body(body)
                .post("/user")
                .then()
                .log()
                .all()
                .statusCode(200);
    }

    @Test
    void createUserTest() {
        String body = """
                {
                  "id": 0,
                  "username": "string",
                  "firstName": "string",
                  "lastName": "string",
                  "email": "string",
                  "password": "string",
                  "phone": "string",
                  "userStatus": 0
                }
                """;

        given()
                .baseUri(baseUrl)
                .contentType("application/json")
                .accept("application/json")
                .when()
                .body(body)
                .post("/user")
                .then()
                .log()
                .all()
                .statusCode(200)
                .body("code", equalTo(200))
                .body("type", equalTo("unknown"))
                .body("message", not(emptyString()));
    }

    @Test
    void createUserPojoTest() {
        User user = new User(0, "string", "string", "string", "string", "string", "string", 0);

        given()
                .baseUri(baseUrl)
                .contentType("application/json")
                .accept("application/json")
                .when()
                .body(user)
                .post("/user")
                .then()
                .log()
                .all()
                .statusCode(200)
                .body("code", equalTo(200))
                .body("type", equalTo("unknown"))
                .body("message", not(emptyString()));
    }

    @Test
    void getUserTest() {
        String username = "string";

        given()
                .baseUri(baseUrl)
                .contentType("application/json")
                .accept("application/json")
                .when()
                .get("/user/" + username)
                .then()
                .log()
                .all()
                .statusCode(200)
                .body("id", Matchers.greaterThan(9223372036854775495L))
                .body("username", equalTo("string"))
                .body("firstName", equalTo("string"))
                .body("lastName", equalTo("string"))
                .body("email", equalTo("string"))
                .body("password", equalTo("string"))
                .body("phone", equalTo("string"))
                .body("userStatus", equalTo(0));
    }

    @Test
    void getUserExtendedTest() {
        String username = "string";
        User expectedUser = new User(0, username, "string", "string", "string", "string", "string", 0);

        User actualUser = given()
                .baseUri(baseUrl)
                .contentType("application/json")
                .accept("application/json")
                .when()
                .get("/user/" + username)
                .then()
                .log()
                .all()
                .statusCode(200)
                .extract()
                .as(User.class);

        Assertions.assertEquals(expectedUser, actualUser);
    }
}
