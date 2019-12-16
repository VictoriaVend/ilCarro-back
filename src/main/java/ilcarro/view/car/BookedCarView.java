package ilcarro.view.car;

import ilcarro.view.period.BookedPeriodView;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class BookedCarView {
    @ApiModelProperty(example = "123-65-123")
    private String serialNumber;
    @ApiModelProperty(dataType = "DATE")
    private BookedPeriodView bookedPeriod;
}