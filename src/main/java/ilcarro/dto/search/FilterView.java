package ilcarro.dto.search;

import ilcarro.dto.car.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class FilterView {
    private List<String> makes = new ArrayList<>();
    private List<String> models = new ArrayList<>();
    private List<Integer> years = new ArrayList<>();
    private List<String> engines = new ArrayList<>();
    private List<FuelType> fuels = new ArrayList<>();
    private List<GearType> gears = new ArrayList<>();
    private List<WheelsDriveType> wheelsDrives = new ArrayList<>();
}
