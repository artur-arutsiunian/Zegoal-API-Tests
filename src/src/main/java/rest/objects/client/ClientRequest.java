package rest.objects.client;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import rest.objects.client.post.MainLocation;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class ClientRequest {
    public String name;
    public MainLocationPojo main_location;

    public ClientRequest(String name){
        this.name = name;
    }

}
