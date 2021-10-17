package serialization;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.ImmutableList;
import lombok.SneakyThrows;
import rest.objects.form.FormFieldRequest;
import rest.objects.form.FormGroupRequest;
import rest.objects.form.FormRequest;

import java.io.File;
import java.util.List;

public class SerializationTest {

    @SneakyThrows
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();

        FormFieldRequest group_field = new FormFieldRequest("field_image", 1, 7);
        List<FormFieldRequest> group_fields = ImmutableList.of(group_field);

        FormGroupRequest formGroup = new FormGroupRequest("group_1", group_fields);
        List<FormGroupRequest> form_groups = ImmutableList.of(formGroup);

        FormRequest request = new FormRequest("nou1", 1, form_groups);

//        //TODO - сериализация данных файла в java объект
//        mapper.writeValue(new File("src/main/resources/schedule.json"), new ScheduleRequest("b11e063d-67a3-4c4e-8a13-902eafbbbe57", 0, "2021-10-01 11:10", "2021-10-02 18:10", false)); //из объекта в файл
        mapper.writeValue(new File("src/main/resources/form.json"), request);
    }
}