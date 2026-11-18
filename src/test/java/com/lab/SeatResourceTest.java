package com.lab.seat;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
class SeatResourceTest {

    @Test
    void returnsDefaultCapacity() {
        given().when().get("/seats")
               .then().statusCode(200)
               .body("capacity", is(180));
    }
}