package rest.objects.location;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import rest.objects.form.FormGroupRequest;

import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class PointPojo {

    public String type;
    public List<Integer> coordinates;
}
