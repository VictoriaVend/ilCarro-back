package ilCarro.controller.impl;

import ilCarro.exception.NotImplementedException;
import ilCarro.view.car.CarFullView;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/car", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
@Api(tags = {"car"})
public class CarController {
    @PostMapping(value = "/")
    @ApiOperation(value = "Add car", response = CarFullView.class, tags = {"car"})
    @ApiResponses(value = {@ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 409, message = "Conflict")})
    public ResponseEntity<CarFullView> getCurrentCapacityById() {
        throw new NotImplementedException();
    }
}

