package ilcarro.view.search;


import ilcarro.view.car.CarByIdView;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SearchView {
    @ApiModelProperty(value = "0")
    private Integer current_page;
    @ApiModelProperty(value = "5")
    private Integer items_on_page;
    private Integer items_total;
    private List<CarByIdView> cars;
}
