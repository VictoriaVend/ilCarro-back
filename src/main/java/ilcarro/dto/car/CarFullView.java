package ilcarro.dto.car;

import ilcarro.dto.period.BookedPeriodView;
import ilcarro.dto.user.OwnerView;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class CarFullView extends CarView {
    private OwnerView owner;
    private List<BookedPeriodView> bookedPeriods = new ArrayList<>();
}
