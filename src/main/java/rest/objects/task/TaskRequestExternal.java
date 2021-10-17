package rest.objects.task;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class TaskRequestExternal {
    public int main_report_form;
    public String location_address;
    public String planned_start_at;
    public String assignee_user_email;
    public String client_name;
}
