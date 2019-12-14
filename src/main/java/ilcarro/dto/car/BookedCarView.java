package ilcarro.dto.car;

import ilcarro.dto.period.BookedPeriodView;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookedCarView extends BookedPeriodView {
    private String serialId;
}
