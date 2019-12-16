package ilcarro.controller.impl;

import ilcarro.exception.NotImplementedException;
import ilcarro.view.car.GearType;
import ilcarro.view.search.SearchFilterView;
import ilcarro.view.search.SearchView;
import ilcarro.view.car.FuelType;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping(value = "/search",
                consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public class SearchController {
    @GetMapping("/search")
    @ApiOperation(value = "Search", response = SearchView.class, tags = {"search"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 400, message = "Bad Request"),
            @ApiResponse(code = 404, message = "Not Found")
    })
    public ResponseEntity<SearchView> search(@RequestParam ("city") String city,
                                             @RequestParam ("start_date") LocalDateTime start_date,
                                             @RequestParam ("end_date") LocalDateTime end_date,
                                             @RequestParam ("min_amount") Double min_amount,
                                             @RequestParam ("max_amount") Double max_amount,
                                             @RequestParam ("ascending") Boolean ascending,
                                             @RequestParam ("items_on_page") Integer items_on_page,
                                             @RequestParam ("current_page") Integer current_page)
    {
        throw new NotImplementedException();
    }

    @GetMapping("/search/geo")
    @ApiOperation(value = "Search by coordinates", response = SearchView.class, tags = {"search"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 400, message = "Bad Request"),
            @ApiResponse(code = 404, message = "Not Found")
    })
    public ResponseEntity<SearchView> searchByCoordinates(@RequestParam ("latitude") Double latitude,
                                                          @RequestParam ("longitude") Double longitude,
                                                          @RequestParam ("radius") Double radius,
                                                          @RequestParam ("items_on_page") Integer items_on_page,
                                                          @RequestParam ("current_page") Integer current_page)
    {
        throw new NotImplementedException();

    }

    @GetMapping("/search/filters")
    @ApiOperation(value = "Search by filters", response = SearchFilterView.class, tags = {"search"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 400, message = "Bad Request"),
            @ApiResponse(code = 404, message = "Not Found")
    })
    public ResponseEntity<SearchFilterView> searchByFilters(@RequestParam ("make") String make,
                                                            @RequestParam ("model") String model,
                                                            @RequestParam ("year") Integer year,
                                                            @RequestParam ("fuel") FuelType fuel,
                                                            @RequestParam ("gear") GearType gear,
                                                            @RequestParam ("wheels_drive") Integer wheels_drive,
                                                            @RequestParam ("items_on_page") Integer items_on_page,
                                                            @RequestParam ("current_page") Integer current_page)

    {
        throw new NotImplementedException();

    }

    @GetMapping("/search/all")
    @ApiOperation(value = "Search by All params", response = SearchFilterView.class, tags = {"search"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 400, message = "Bad Request"),
            @ApiResponse(code = 404, message = "Not Found")
    })
    public ResponseEntity<SearchFilterView> searchByAllFilters(@RequestParam ("make") String make,
                                                            @RequestParam ("model") String model,
                                                            @RequestParam ("year") Integer year,
                                                            @RequestParam ("fuel") FuelType fuel,
                                                            @RequestParam ("gear") GearType gear,
                                                            @RequestParam ("wheels_drive") Integer wheels_drive,
                                                            @RequestParam ("items_on_page") Integer items_on_page,
                                                            @RequestParam ("current_page") Integer current_page,
                                                            @RequestParam ("latitude") Double latitude,
                                                            @RequestParam ("longitude") Double longitude,
                                                            @RequestParam ("radius") Double radius,
                                                            @RequestParam ("city") String city,
                                                            @RequestParam ("start_date") LocalDateTime start_date,
                                                            @RequestParam ("end_date") LocalDateTime end_date,
                                                            @RequestParam ("min_amount") Double min_amount,
                                                            @RequestParam ("max_amount") Double max_amount,
                                                            @RequestParam ("ascending") Boolean ascending)

    {
        throw new NotImplementedException();

    }
}
