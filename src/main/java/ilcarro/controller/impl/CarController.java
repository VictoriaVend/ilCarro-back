package ilcarro.controller.impl;

import ilcarro.dto.car.*;
import io.swagger.annotations.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import static ilcarro.dto.Constants.*;

@RestController("/v2")
@CrossOrigin(origins = "*")
@Api(tags = {"Car controller (Add/Update/Delete a car)"})
public class CarController {
    @ApiOperation("Add a new car")
    @PostMapping(ADD_CAR)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 400, message = "Bad Request"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 409, message = "Conflict")
    })
    public ResponseEntity<CarFullView> addCar (@RequestBody CarView carView) {
        throw new ResponseStatusException(HttpStatus.NOT_IMPLEMENTED);
    }

    @ApiOperation("Update car")
    @PutMapping(UPDATE_CAR)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 400, message = "Bad Request"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 409, message = "Conflict")
    })
    public ResponseEntity<CarFullView> updateCar (@RequestParam(name = SERIAL_NUMBER) final String serialNumber, @RequestBody CarView carView) {
        throw new ResponseStatusException(HttpStatus.NOT_IMPLEMENTED);
    }

    @ApiOperation("Delete car")
    @DeleteMapping(DELETE_CAR)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 409, message = "Conflict")
    })
    public void deleteCar (@RequestParam(name = SERIAL_NUMBER) final String serialNumber) {
        throw new ResponseStatusException(HttpStatus.NOT_IMPLEMENTED);
    }
}
