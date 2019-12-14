package ilcarro.dto.search;

import ilcarro.dto.car.CarByIdView;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SearchView {
    private Integer currentPage;
    private Integer itemsOnPage;
    private Integer itemsTotal;
    private List<CarByIdView> cars;
}
