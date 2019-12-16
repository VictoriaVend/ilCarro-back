package ilcarro.controller.impl;

import ilcarro.view.car.CarFullView;
import ilcarro.view.car.CarView;
import ilcarro.exception.NotImplementedException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
@Api(tags = {"car"})
public class CarController {
    @PostMapping("/car")
    @ApiOperation(value = "Add new car", response = CarFullView.class, tags = {"car"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 400, message = "Unauthorized")
    })
    public ResponseEntity<CarFullView> addCar (@RequestBody final CarView carView)
    {
        throw new NotImplementedException();
    }

    @DeleteMapping("/car")
    @ApiOperation(value = "Delete car", tags = {"car"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 400, message = "Unauthorized")
    })
    public void deleteCar(@RequestParam ("serial_number") String serialNumber)
    {
        throw new NotImplementedException();
    }

    @PutMapping("/car")
    @ApiOperation(value = "Update car", response = CarFullView.class, tags = {"car"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 400, message = "Unauthorized")
    })
    public ResponseEntity<CarFullView> updateCAr(@RequestBody final CarView carView)
    {
        throw new NotImplementedException();
    }
}
