package ilcarro.view.car;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CarView {
    @ApiModelProperty(value = "123-65-123")
    private String serial_number;

    @ApiModelProperty(value = "Audi")
    private String make;

    @ApiModelProperty(value = "A6")
    private String model;

    @ApiModelProperty(dataType = "DATA")
    private Integer year;
    @ApiModelProperty(value = "3.0L V6 DOHC 24V AWD")
    private String engine;
    @ApiModelProperty(value = "GAS")
    private FuelType fuel;
    private GearType gear;
    private WheelsDriveType wheelsDrive;
    @ApiModelProperty(value = "4")
    private Integer doors;
    @ApiModelProperty(value = "5")
    private Integer seats;
    @ApiModelProperty(value = "12.5")
    private double fuelConsumption;
    @ApiModelProperty(value = "C")
    private CarClassType carClass;
    private PriceView pricePerDay;
    @ApiModelProperty(example = "20")
    private Integer distanceIncluded;
    private String about;
    private PickUpPlaceView pickUpPlace;
    private List<String> imageUrls;
}