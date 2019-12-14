package ilcarro.dto.car;

import ilcarro.dto.period.PeriodView;
import ilcarro.dto.user.OwnerView;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class CarByIdView extends CarView {
    private OwnerView owner;
    private List<PeriodView> bookedPeriods = new ArrayList<>();
}
