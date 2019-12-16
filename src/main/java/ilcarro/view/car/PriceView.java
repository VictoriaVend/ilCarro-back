package ilcarro.view.car;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
public class PriceView {
    private CurrencyType currency;
    @ApiModelProperty(value = "43.5")
    private double amount;
}