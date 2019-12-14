package ilcarro.controller.impl;

import ilcarro.dto.car.OwnCarView;
import ilcarro.dto.period.BookedPeriodView;
import ilcarro.dto.user.UserFullView;
import ilcarro.dto.user.UserView;
import io.swagger.annotations.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

import static ilcarro.dto.Constants.*;

@RestController
@CrossOrigin(origins = "*")
@Api(tags = {"User controller (Update, Delete, Owner get cars, Owner get car by id, Owner get booked periods by car id)"})
public class UserController {
    @ApiOperation("User update")
    @PutMapping(UPDATE_USER)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 401, message = "Unauthorized")
    })
    ResponseEntity<UserFullView> updateUser(@RequestBody UserView userView) {
        throw new ResponseStatusException(HttpStatus.NOT_IMPLEMENTED);
    }

    @ApiOperation("User delete")
    @DeleteMapping(DELETE_USER)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 401, message = "Unauthorized")
    })
    void deleteUser() {
        throw new ResponseStatusException(HttpStatus.NOT_IMPLEMENTED);
    }

    @ApiOperation("Owner get cars")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 404, message = "Not Found")
    })
    @GetMapping(OWNER_GET_CARS)
    ResponseEntity<List<OwnCarView>> ownerGetCars () {
        throw new ResponseStatusException(HttpStatus.NOT_IMPLEMENTED);
    }

    @ApiOperation("Owner get car by id")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 409, message = "Conflict")
    })
    @GetMapping(OWNER_GET_CAR_BY_ID)
    ResponseEntity<OwnCarView> ownerGetCarById (@RequestParam(name = SERIAL_NUMBER) final String serialNumber) {
        throw new ResponseStatusException(HttpStatus.NOT_IMPLEMENTED);
    }

    @ApiOperation("Owner get booked periods by car id")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 409, message = "Conflict")
    })
    @GetMapping(OWNER_GET_BOOKED_PERIODS_BY_CAR_ID)
    ResponseEntity<BookedPeriodView> ownerGetBookedPeriodsByCarId (@RequestParam(name = SERIAL_NUMBER) final String serialNumber) {
        throw new ResponseStatusException(HttpStatus.NOT_IMPLEMENTED);
    }
}
