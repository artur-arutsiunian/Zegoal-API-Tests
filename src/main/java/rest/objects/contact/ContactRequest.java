package rest.objects.contact;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class ContactRequest {

    public String full_name;
    public String phone_number;
    public String email;
    public List<Integer> locations;


}
