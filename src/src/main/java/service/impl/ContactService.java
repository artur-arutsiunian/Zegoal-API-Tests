package service.impl;

import io.restassured.http.ContentType;
import lombok.SneakyThrows;
import rest.objects.contact.ContactRequest;
import rest.objects.contact.ContactRequestPatch;
import rest.objects.contact.get.GetContact;
import rest.objects.contact.patch.PatchContact;
import rest.objects.contact.post.PostContact;
import rest.objects.token.Token;
import service.BaseService;

import java.util.List;

import static io.restassured.RestAssured.given;

public class ContactService extends BaseService {

    private final static String CONTACT_CREATE_ENDPOINT = "/api/v1/contact/";
    private final static String CONTACT_PATCH_ENDPOINT = "/api/v1/contact/1/";
    private final static String CONTACT_GET_ENDPOINT = "/api/v1/contact/";

    public PostContact getCreateContact() {

        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + token.getAccessToken())
                .when()
                .body(initCreateContact())
                .post(url + CONTACT_CREATE_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(201)
                .extract()
                .as(PostContact.class);
    }

    @SneakyThrows
    private ContactRequest initCreateContact(Object[]... field) {
        return
                new ContactRequest("BRAD7", "291238546", "br7@mail.com", List.of(5));
    }

//    private Map<String, Object> initCreateContact(String full_name, String phone_number, String email, List<Integer>locations) {
//        Map<String, Object> body = new HashMap<>();
//
//        body.put("full_name", full_name);
//        body.put("phone_number", phone_number);
//        body.put("email", email);
//        body.put("locations", locations);
//        return body;
//    }

    public PatchContact getPatchContact() {

        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + token.getAccessToken())
                .when()
                .body(initPatchContact())
                .patch(url + CONTACT_PATCH_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(PatchContact.class);
    }

    @SneakyThrows
    private ContactRequestPatch initPatchContact(Object[]... field) {
        return
                new ContactRequestPatch("BRA","br9@mail.com", List.of(5));
    }

//    private Map<String, Object> initPatchContact(String full_name, String email, List<Integer>locations) {
//        Map<String, Object> body = new HashMap<>();
//
//        body.put("full_name", full_name);
//        body.put("email", email);
//        body.put("locations", locations);
//        return body;
//    }

    public GetContact getGetContact() {

        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + token.getAccessToken())
                .when()
                .get(url + CONTACT_GET_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(GetContact.class);
    }

    public PostContact getCreateContactForProd() {

        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + token.getAccessToken())
                .when()
                .body(initCreateContactForProd())
                .post(url + CONTACT_CREATE_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(201)
                .extract()
                .as(PostContact.class);
    }

    @SneakyThrows
    private ContactRequest initCreateContactForProd(Object[]... field) {
        return
                new ContactRequest("BRAD7", "291238546", "br7@mail.com", List.of(3));
    }

    public PatchContact getPatchContactForProd() {

        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + token.getAccessToken())
                .when()
                .body(initPatchContactForProd())
                .patch(url + CONTACT_PATCH_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(PatchContact.class);
    }

    @SneakyThrows
    private ContactRequestPatch initPatchContactForProd(Object[]... field) {
        return
                new ContactRequestPatch("BRA","br9@mail.com", List.of(3));
    }

    public GetContact getGetContactForProd() {

        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + token.getAccessToken())
                .when()
                .get(url + CONTACT_GET_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(GetContact.class);
    }

}
