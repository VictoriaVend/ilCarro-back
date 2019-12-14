package ilcarro.view.search;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class SearchFilterView extends SearchView {
    private List<FilterView> filter = new ArrayList<>();
}
