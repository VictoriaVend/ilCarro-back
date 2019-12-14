package ilcarro.controller.impl;

import ilcarro.exception.NotImplementedException;
import ilcarro.view.car.*;
import ilcarro.view.search.SearchFilterView;
import ilcarro.view.search.SearchView;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/search", params = {"city", "start_date", "end_date", "min_amount", "max_amount",
        "ascending", "items_on_page", "current_page", "make", "model", "year", "engine", "fuel", "gear",
        "wheels_drive", "latitude", "longitude", "radius"},
        consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
@Api(tags = {"search"})
public class SearchController {
    @GetMapping("/")
    @ApiOperation(value = "Search", response = SearchView.class, tags = {"search"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 400, message = "Bad Request"),
            @ApiResponse(code = 404, message = "Not Found")
    })
    public ResponseEntity<SearchView> SearchByParams(@RequestParam("city") String city,
                                                     @RequestParam ("start_date") LocalDateTime start_date,
                                                     @RequestParam ("end_date") LocalDateTime end_date,
                                                     @RequestParam ("min_amount") Double min_amount,
                                                     @RequestParam ("max_amount") Double max_amount,
                                                     @RequestParam ("ascending") boolean ascending,
                                                     @RequestParam ("items_on_page") Integer items_on_page,
                                                     @RequestParam ("current_page") Integer current_page){
        throw new NotImplementedException();
    }
    @GetMapping("/geo")
    @ApiOperation(value = "Search by coordinates", response = SearchView.class, tags = {"search"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 400, message = "Bad Request"),
            @ApiResponse(code = 404, message = "Not Found")
    })
    public ResponseEntity<SearchView> SearchByCoordinates(@RequestParam ("latitude") String latitude,
                                                     @RequestParam ("longitude") String longitude,
                                                     @RequestParam ("radius") Double radius,
                                                     @RequestParam ("items_on_page") Integer items_on_page,
                                                     @RequestParam ("current_page") Integer current_page){
        throw new NotImplementedException();
    }
    @GetMapping("/filters")
    @ApiOperation(value = "Search by filters", response = SearchFilterView.class, tags = {"search"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Not Found")
    })
    public ResponseEntity<SearchFilterView> SearchByFilters(@RequestParam("make") String make,
                                                                @RequestParam ("model") String model,
                                                                @RequestParam ("year") Integer year,
                                                                @RequestParam ("engine") String engine,
                                                                @RequestParam ("fuel") FuelType fuel,
                                                                @RequestParam ("gear") GearType gear,
                                                                @RequestParam ("wheels_drive") WheelsDriveType wheels_drive,
                                                                @RequestParam ("items_on_page") Integer items_on_page,
                                                                @RequestParam ("current_page") Integer current_page){
        throw new NotImplementedException();
    }
    @GetMapping("/all")
    @ApiOperation(value = "Search by all filters", response = SearchFilterView.class, tags = {"search"})
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 404, message = "Not Found")
    })
    public ResponseEntity<SearchFilterView> SearchByAllFilters(@RequestParam("make") String make,
                                                       @RequestParam ("model") String model,
                                                       @RequestParam ("year") Integer year,
                                                       @RequestParam ("engine") String engine,
                                                       @RequestParam ("fuel") FuelType fuel,
                                                       @RequestParam ("gear") GearType gear,
                                                       @RequestParam ("wheels_drive") WheelsDriveType wheels_drive,
                                                       @RequestParam ("latitude") String latitude,
                                                       @RequestParam ("longitude") String longitude,
                                                       @RequestParam ("radius") Double radius,
                                                       @RequestParam ("items_on_page") Integer items_on_page,
                                                       @RequestParam ("current_page") Integer current_page,
                                                       @RequestParam ("city") String city,
                                                       @RequestParam ("start_date") LocalDateTime start_date,
                                                       @RequestParam ("end_date") LocalDateTime end_date,
                                                       @RequestParam ("min_amount") Double min_amount,
                                                       @RequestParam ("max_amount") Double max_amount,
                                                       @RequestParam ("ascending") boolean ascending){
    throw new NotImplementedException();
    }
}
