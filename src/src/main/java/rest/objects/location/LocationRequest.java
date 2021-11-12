package rest.objects.location;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class LocationRequest {
    public int client;
    public PointPojo point;
    public String name;
    public String raw_address;
    public int radius;
}
