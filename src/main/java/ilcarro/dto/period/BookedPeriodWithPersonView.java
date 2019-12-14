package ilcarro.dto.period;

import ilcarro.dto.user.PersonWhoBookedView;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookedPeriodWithPersonView extends BookedPeriodView {
    private PersonWhoBookedView personWhoBooked;
}
