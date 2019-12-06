package ilCarro.view.car;

import ilCarro.view.period.BookedPeriodView;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookedCarView {

    private  String serial_number;
    private BookedPeriodView booked_period;
}
