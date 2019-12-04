package ilcarro.view.car;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @author NikolayMalikhin on 04.12.2019.
 */
@Getter
@Setter
public class PriceView {
    private CurrencyType currency;
    private BigDecimal amount;
}