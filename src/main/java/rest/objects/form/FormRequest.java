package rest.objects.form;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class FormRequest {

    public String name;
    public int type;
    public List<FormGroupRequest> form_groups;

    public FormRequest(String name, int type){

        this.name = name;
        this.type = type;
    }
}


