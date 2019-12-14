package ilcarro.controller.impl;

import ilcarro.dto.car.FuelType;
import ilcarro.dto.car.GearType;
import ilcarro.dto.car.WheelsDriveType;
import ilcarro.dto.search.SearchFilterView;
import ilcarro.dto.search.SearchView;
import io.swagger.annotations.*;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import static ilcarro.dto.Constants.*;

@RestController
@CrossOrigin(origins = "*")
@Api(description = "Search controller (Search standart, by coordinates, by filters, by contains all searches)")
public class SearchController {
    @ApiOperation("Search a car")
    @GetMapping(SEARCH)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 400, message = "Bad Request"),
            @ApiResponse(code = 404, message = "Not Found")
    })
    ResponseEntity<SearchView> searchCar(
            String city,
            @RequestParam(name = DATE_FROM, required = false) @DateTimeFormat(pattern = "YYYY-MM-dd HH:mm") LocalDateTime from,
            @RequestParam(name = DATE_TO, required = false) @DateTimeFormat(pattern = "YYYY-MM-dd HH:mm") LocalDateTime to,
            @RequestParam(name = MIN_AMOUNT, required = false) BigDecimal minAmount,
            @RequestParam(name = MAX_AMOUNT, required = false) BigDecimal maxAmount,
            Boolean ascending,
            @RequestParam(name = ITEMS_ON_PAGE, required = false) Integer itemsOnPage,
            @RequestParam(name = CURRENT_PAGE, required = false) Integer currentPage
    ) {
        throw new ResponseStatusException(HttpStatus.NOT_IMPLEMENTED);
    }

    @ApiOperation("Search cars by coordinates")
    @GetMapping(SEARCH_BY_COORDINATES)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 400, message = "Bad Request"),
            @ApiResponse(code = 404, message = "Not Found")
    })
    ResponseEntity<SearchView> searchCarGeo(
            BigDecimal latitude,
            BigDecimal longitude,
            BigDecimal radius,
            @RequestParam(name = ITEMS_ON_PAGE, required = false) Integer itemsOnPage,
            @RequestParam(name = CURRENT_PAGE, required = false) Integer currentPage
    ) {
        throw new ResponseStatusException(HttpStatus.NOT_IMPLEMENTED);
    }

    @ApiOperation("Search by filters")
    @GetMapping(SEARCH_BY_FILTERS)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Not Found")
    })
    ResponseEntity<SearchFilterView> searchByFilters(
            String make,
            String model,
            Integer year,
            String engine,
            FuelType fuel,
            GearType gear,
            WheelsDriveType wheels_drive,
            @RequestParam(name = ITEMS_ON_PAGE, required = false) Integer itemsOnPage,
            @RequestParam(name = CURRENT_PAGE, required = false) Integer currentPage
    ) {
        throw new ResponseStatusException(HttpStatus.NOT_IMPLEMENTED);
    }

    @ApiOperation("Search that contains all searches")
    @GetMapping(SEARCH_THAT_CONTAINS_ALL_SEARCHES)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Not Found")
    })
    ResponseEntity<SearchFilterView> searchByAllFilters(
            @RequestParam(name = CURRENT_PAGE, required = false) Integer currentPage,
            @RequestParam(name = ITEMS_ON_PAGE, required = false) Integer itemsOnPage,
            WheelsDriveType wheels_drive,
            String make,
            String model,
            Integer year,
            String engine,
            FuelType fuel,
            GearType gear,
            BigDecimal latitude,
            BigDecimal longitude,
            BigDecimal radius,
            String city,
            @RequestParam(name = DATE_FROM, required = false) @DateTimeFormat(pattern = "YYYY-MM-dd HH:mm") LocalDateTime from,
            @RequestParam(name = DATE_TO, required = false) @DateTimeFormat(pattern = "YYYY-MM-dd HH:mm") LocalDateTime to,
            @RequestParam(name = MIN_AMOUNT, required = false) BigDecimal minAmount,
            @RequestParam(name = MAX_AMOUNT, required = false) BigDecimal maxAmount,
            Boolean ascending
    ) {
        throw new ResponseStatusException(HttpStatus.NOT_IMPLEMENTED);
    }
}
