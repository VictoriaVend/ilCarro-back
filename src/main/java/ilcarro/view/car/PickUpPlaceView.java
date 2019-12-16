package ilcarro.view.car;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
public class PickUpPlaceView {
    private String placeId;
    @ApiModelProperty(value = "31.912363")
    private double latitude = 31.912363;
    @ApiModelProperty(value = "34.8047923")
    private double longitude = 34.8047923;
}