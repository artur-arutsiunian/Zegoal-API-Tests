package rest.objects.token;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import rest.objects.apikey.ApiKey;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Auth {
    private Token token;
    private ApiKey apiKey;
}
