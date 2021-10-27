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

public class WorkStatusLogRequest {

    public int id_mobile;
    public String device;
    public int task;
    public int from_status;
    public int to_status;
    public int mobile_datetime;
    public PointPojoForLog point;
}
