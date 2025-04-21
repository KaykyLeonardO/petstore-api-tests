package com.petstore;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PetStoreTests {

    private static final String BASE_URL = "https://petstore.swagger.io/v2";

    @Test
    public void testCadastrarPedidoPet() {
        String orderJson = "{" +
                "\"id\": 1001," +
                "\"petId\": 1," +
                "\"quantity\": 1," +
                "\"shipDate\": \"2025-04-21T10:29:22.766Z\"," +
                "\"status\": \"placed\"," +
                "\"complete\": true" +
                "}";

        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .body(orderJson)
                .post(BASE_URL + "/store/order");

        assertEquals(200, response.getStatusCode());
    }

    @Test
    public void testPesquisarPetInexistente() {
        Response response = RestAssured.given()
                .get(BASE_URL + "/pet/99099");

        assertEquals(404, response.getStatusCode());
    }

    @Test
    public void testAtualizarPet() {
        String petJson = "{" +
                "\"id\": 1," +
                "\"category\": {\"id\": 0, \"name\": \"cachorros\"}," +
                "\"name\": \"doguinho\"," +
                "\"photoUrls\": [\"http://foto.com\"]," +
                "\"tags\": [{\"id\": 0, \"name\": \"tag1\"}]," +
                "\"status\": \"available\"" +
                "}";

        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .body(petJson)
                .put(BASE_URL + "/pet");

        assertEquals(200, response.getStatusCode());
    }

    @Test
    public void testPesquisarPetsPendentes() {
        Response response = RestAssured.given()
                .queryParam("status", "pending")
                .get(BASE_URL + "/pet/findByStatus");

        assertEquals(200, response.getStatusCode());
    }
}
