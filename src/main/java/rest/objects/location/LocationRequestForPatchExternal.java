package rest.objects.location;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class LocationRequestForPatchExternal {
    public int pk;
    public boolean is_active;
}
