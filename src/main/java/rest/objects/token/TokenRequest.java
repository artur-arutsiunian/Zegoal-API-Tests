package rest.objects.token;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class TokenRequest {
    public String client_id;
    public String client_secret;
    public String grant_type;
    public String username;
    public String password;
    public String device_id;
    public String client_app_version;

}


