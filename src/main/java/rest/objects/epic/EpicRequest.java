package rest.objects.epic;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class EpicRequest {
    public String planned_start_at;
    public String planned_end_at;
    public String name;
    public List<Integer> tasks;
}
