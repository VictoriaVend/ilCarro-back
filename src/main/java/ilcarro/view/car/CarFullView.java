package ilcarro.view.car;

import ilcarro.view.period.PeriodView;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CarFullView extends CarView{
    private OwnCarView owner;
    private List<PeriodView> periods;
}
