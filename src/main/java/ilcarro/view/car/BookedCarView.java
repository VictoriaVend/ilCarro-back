package ilcarro.view.car;

import ilcarro.view.period.BookedPeriodView;
import lombok.Getter;
import lombok.Setter;

/**
 * @author NikolayMalikhin on 04.12.2019.
 */
@Getter
@Setter
public class BookedCarView {
    private String serialNumber;
    private BookedPeriodView bookedPeriod;
}