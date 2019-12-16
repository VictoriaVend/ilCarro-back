package ilcarro.view.car;

import ilcarro.view.period.PeriodView;
import ilcarro.view.user.OwnerView;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CarByIdView extends CarView{
    private OwnerView owner;
    private PeriodView bookedPeriods;
}
