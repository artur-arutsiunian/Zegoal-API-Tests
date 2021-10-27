package rest.objects.workStatusLog;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class PointPojoForLog {

    public String type;
    public List<Integer> coordinates;
}
