package ilcarro.view.search;

import ilcarro.view.car.BookedCarView;
import ilcarro.view.car.CarByIdView;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class SearchView {
    private Integer currentPage;
    private Integer itemsOnPage;
    private Integer itemsTotal;
    private List<CarByIdView> cars = new ArrayList<>();
}
