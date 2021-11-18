package service.impl;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
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

    private final RequestBuilder requestBuilder = new RequestBuilder();

    public PostContact getCreateContact() {

        return given(requestBuilder.requestSpec)
                .when()
                .body(initCreateContact())
                .post("/")
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
                new ContactRequest("hi contact", "291238546", "br7@mail.com", List.of(5));
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

        return given(requestBuilder.requestSpec)
                .when()
                .body(initPatchContact())
                .patch("1/")
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
                new ContactRequestPatch("BRA","br18@mail.com", List.of(5));
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

        return given(requestBuilder.requestSpec)
                .when()
                .get("/")
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(GetContact.class);
    }

    private class RequestBuilder {

        private final RequestSpecification requestSpec;

        public RequestBuilder() {
            this.requestSpec = new RequestSpecBuilder()
                    .setBaseUri(url)
                    .setBasePath("/api/v1/contact")
                    .setContentType(ContentType.JSON)
                    .addHeader("Authorization", "Bearer " + token.getAccessToken())
                    .build();
        }
    }
}
