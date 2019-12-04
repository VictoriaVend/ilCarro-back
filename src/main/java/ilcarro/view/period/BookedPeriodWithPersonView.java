package ilcarro.view.period;

import ilcarro.view.user.PersonWhoBookedView;
import lombok.Getter;
import lombok.Setter;

/**
 * @author NikolayMalikhin on 04.12.2019.
 */
@Getter
@Setter
public class BookedPeriodWithPersonView {
    private PersonWhoBookedView personWhoBooked;
}