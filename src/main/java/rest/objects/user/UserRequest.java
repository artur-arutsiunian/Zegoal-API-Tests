package rest.objects.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class UserRequest {
    public String email;
    public String password;
    public PojoProfile profile;
    public List<Integer> groups;
    public int manager;
}
