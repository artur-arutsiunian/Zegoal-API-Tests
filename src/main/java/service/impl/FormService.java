package service.impl;

import io.restassured.http.ContentType;
import lombok.SneakyThrows;
import rest.objects.asset.post.PostAsset;
import rest.objects.form.FormFieldRequest;
import rest.objects.form.FormGroupRequest;
import rest.objects.form.FormRequest;
import rest.objects.form.get.GetForm;
import rest.objects.form.put.PutForm;
import rest.objects.token.Token;
import service.BaseService;

import java.util.List;

import static io.restassured.RestAssured.given;

public class FormService extends BaseService{

    private final static String FORM_CREATE_ENDPOINT = "/api/v1/form/";
    private final static String FORM_PUT_ENDPOINT = "/api/v1/form/2/";
    private final static String FORM_GET_ENDPOINT = "/api/v1/form/";

    public PostAsset getCreateForm(Token token) {

        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + token.getAccessToken())
                .when()
                .body(initCreateForm())
                .post(url + FORM_CREATE_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(201)
                .extract()
                .as(PostAsset.class);
    }

    @SneakyThrows
    private FormRequest initCreateForm(Object[]... field) {
        return
                new FormRequest("loi9", 1);
    }

    public PutForm getPutForm(Token token) {

        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + token.getAccessToken())
                .when()
                .body(initPutForm())
                .put(url + FORM_PUT_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(PutForm.class);
    }

    @SneakyThrows
    private FormRequest initPutForm(Object[]... field) {
        return
                new FormRequest("qwer86", 1, List.of(new FormGroupRequest("group_1", List.of(new FormFieldRequest("field_image", 1,7)))));
    }

//    private Map<String, Object> initPutForm(String name, int type, String name1, String name2, int sort, int type1) {
//        Map<String, Object> body = new HashMap<>();
//
//        Map<String, Object> group_fields = new HashMap<>();
//        group_fields.put("name", name2);
//        group_fields.put("sort", sort);
//        group_fields.put("type", type1);
//
//        Map<String, Object> form_groups = new HashMap<>();
//        form_groups.put("name", name1);
//        form_groups.put("group_fields", ImmutableList.of(group_fields));
//
//        body.put("name", name);
//        body.put("type", type);
//        body.put("form_groups", ImmutableList.of(form_groups));
//
//        return body;
//    }

    public GetForm getGetForm(Token token) {

        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + token.getAccessToken())
                .when()
                .get(url + FORM_GET_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(GetForm.class);
    }

    public PostAsset getCreateFormForProd(Token tokenProd) {

        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + tokenProd.getAccessToken())
                .when()
                .body(initCreateFormForProd())
                .post(url + FORM_CREATE_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(201)
                .extract()
                .as(PostAsset.class);
    }

    @SneakyThrows
    private FormRequest initCreateFormForProd(Object[]... field) {
        return
                new FormRequest("loi9", 1);
    }

    public PutForm getPutFormForProd(Token tokenProd) {

        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + tokenProd.getAccessToken())
                .when()
                .body(initPutFormForProd())
                .put(url + FORM_PUT_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(PutForm.class);
    }

    @SneakyThrows
    private FormRequest initPutFormForProd(Object[]... field) {
        return
                new FormRequest("qwer86", 1, List.of(new FormGroupRequest("group_1", List.of(new FormFieldRequest("field_image", 1,7)))));
    }

    public GetForm getGetFormForProd(Token tokenProd) {

        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + tokenProd.getAccessToken())
                .when()
                .get(url + FORM_GET_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(GetForm.class);
    }
}
