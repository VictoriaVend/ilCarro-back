package ilcarro.controller.impl;

import ilcarro.exception.NotImplementedException;
import ilcarro.view.car.CarFullView;
import ilcarro.view.car.CarView;
import ilcarro.view.user.UserFullView;
import ilcarro.view.user.UserView;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/car", params = "serial_number", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
@Api(tags = {"car"})
public class CarController {
    @PostMapping("/")
    @ApiOperation(value = "Add car", response = CarFullView.class, tags = {"car"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 400, message = "Bad Request"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 409, message = "Conflict")
    })
    public ResponseEntity<CarFullView> addCar(@RequestBody final CarView carView){
        throw new NotImplementedException();
    }
@PutMapping("/")
@ApiOperation(value = "Update car", response = CarFullView.class, tags = {"car"})
@ApiResponses(value = {
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 400, message = "Bad Request"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 409, message = "Conflict")
})
public ResponseEntity<CarFullView> putCarById(@RequestParam ("serial_number") CarView carView){
    throw new NotImplementedException();
}
    @DeleteMapping("/")
    @ApiOperation(value = "Delete car", tags = {"car"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 409, message = "Conflict")
    })
    public void deleteUserById(@RequestParam ("serial_number") String serialNumber){
        throw new NotImplementedException();
    }
}
