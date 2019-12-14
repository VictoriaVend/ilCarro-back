package ilcarro.dto.reservation;

import ilcarro.dto.period.PeriodView;
import ilcarro.dto.user.PersonWhoBookedView;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReservationRequest extends PeriodView {
    private PersonWhoBookedView personWhoBooked;
}
