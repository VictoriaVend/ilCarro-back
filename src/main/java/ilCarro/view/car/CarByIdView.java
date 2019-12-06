package ilCarro.view.car;

import ilCarro.view.period.PeriodView;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CarByIdView extends CarView {
    private PeriodView booked_periods;


}
