package service.impl;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
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

    private final RequestBuilder requestBuilder = new RequestBuilder();

    public PostAsset getCreateForm() {

        return given(requestBuilder.requestSpec)
                .when()
                .body(initCreateForm())
                .post("/")
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
                new FormRequest("any form", 1);
    }

    public PutForm getPutForm() {

        return given(requestBuilder.requestSpec)
                .when()
                .body(initPutForm())
                .put("9/")
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
                new FormRequest("new form 17", 1, List.of(new FormGroupRequest("group_1", List.of(new FormFieldRequest("field_image", 1,7)))));
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

    public GetForm getGetForm() {

        return given(requestBuilder.requestSpec)
                .when()
                .get("/")
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(GetForm.class);
    }

    private class RequestBuilder {

        private final RequestSpecification requestSpec;

        public RequestBuilder() {
            this.requestSpec = new RequestSpecBuilder()
                    .setBaseUri(url)
                    .setBasePath("/api/v1/form")
                    .setContentType(ContentType.JSON)
                    .addHeader("Authorization", "Bearer " + token.getAccessToken())
                    .build();
        }
    }
}
