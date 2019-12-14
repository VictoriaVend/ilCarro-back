package ilcarro.controller.impl;

import ilcarro.exception.NotImplementedException;
import ilcarro.view.car.CarByIdView;
import ilcarro.view.car.FuelType;
import ilcarro.view.car.GearType;
import ilcarro.view.car.WheelsDriveType;
import ilcarro.view.comment.CommentView;
import ilcarro.view.search.FilterView;
import ilcarro.view.search.SearchFilterView;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
@Api(tags = {"util"})
public class UtilController {
    @GetMapping("/filters")
    @ApiOperation(value = "Get filters", response = FilterView.class, tags = {"util"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Not Found")
    })
    public ResponseEntity<List<FilterView>> getFilters(){
        throw new NotImplementedException();
    }
    @GetMapping("/comments")
    @ApiOperation(value = "Latest comments", response = CommentView.class, tags = {"util"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Not Found")
    })
    public ResponseEntity<List<CommentView>> getComments(){
        throw new NotImplementedException();
    }
    @GetMapping(value = "/car", params = "serial_number")
    @ApiOperation(value = "Get car by id for users", response = CarByIdView.class, tags = {"util"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Not Found")
    })
    public ResponseEntity<CarByIdView> getCarById(@RequestParam ("serial_number") String serialNumber){
        throw new NotImplementedException();
    }
    @GetMapping(value = "/car/best")
    @ApiOperation(value = "Best booked cars", response = CarByIdView.class, tags = {"util"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Not Found")
    })
    public ResponseEntity<List<CarByIdView>> getBestBookedCars(){
        throw new NotImplementedException();
    }
}
