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
    public String creator;
    public int type;
    public String description;
    public int task_type;
    public int linked_task;
    public String name;
}

