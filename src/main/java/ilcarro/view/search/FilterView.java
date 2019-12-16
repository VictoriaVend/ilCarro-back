package ilcarro.view.search;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FilterView {

    @ApiModelProperty(value = "Audi")
    private String make;
    //private WheelsDriveType wheels_drive;

}
