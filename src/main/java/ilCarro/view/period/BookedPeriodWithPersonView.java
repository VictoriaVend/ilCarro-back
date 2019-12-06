package ilCarro.view.period;
import ilCarro.view.user.PersonWhoBookedView;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookedPeriodWithPersonView extends BookedPeriodView {
    private PersonWhoBookedView person_who_booked;
}
   