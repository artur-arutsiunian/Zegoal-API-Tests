package rest.objects.task;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class TaskRequest {
    public int main_report_form;
    public int main_cancel_form;
    public int location;
    public String description;
    public String planned_start_at_date;
    public String planned_start_at_time;
    public String planned_end_at;
    public String assigned_user;
}
