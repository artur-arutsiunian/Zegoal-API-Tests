package rest.objects.group;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class GroupRequest {
    public String name;
    public List<Integer> non_system_permissions;
    public ProfilePojo profile;
}
