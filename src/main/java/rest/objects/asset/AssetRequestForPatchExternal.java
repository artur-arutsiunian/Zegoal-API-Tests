package rest.objects.asset;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class AssetRequestForPatchExternal {
    public int pk;
    public boolean is_active;
}
