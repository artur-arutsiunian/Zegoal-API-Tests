package rest.objects.taskRemark;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class RemarkRequest {
    public String name;
    public String creator;
    public String planned_start_at;
    public String planned_end_at;
    public int type;
    public int task_type;
    public int linked_task;
}

