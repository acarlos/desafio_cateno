package br.com.cateno.desafio.rest.client;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class CotacaoResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/cotacao")
          .then()
             .statusCode(200)
             .body(is("hello"));
    }

}