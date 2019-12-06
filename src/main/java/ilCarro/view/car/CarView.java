package ilCarro.view.car;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CarView {
    private String serial_number;
    private String make;
    private String model;
    private String year;
    private String engine;
    private FuelType fuel_type;
    private GearType gear;
    private WheelsDrive wheels_drive;
    private int doors;
    private int seats;
    private String fuel_consumption;
    private String features;
    private CarClassType carClass;
    private String price_per_day;
    private String distance_included;
    private String about;
    private String[] image_url;



}
