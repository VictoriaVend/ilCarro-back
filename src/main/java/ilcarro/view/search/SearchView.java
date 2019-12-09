package ilcarro.view.search;

import ilcarro.view.car.CarByIdView;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SearchView {
    private int currentPage;
    private int itemsOnPage;
    private int itemsTotal;
    private CarByIdView cars;
}
