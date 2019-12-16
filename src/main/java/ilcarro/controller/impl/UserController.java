package ilcarro.controller.impl;

import ilcarro.exception.NotImplementedException;
import ilcarro.view.period.BookPeriodsView;
import ilcarro.view.user.*;
import io.swagger.annotations.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@SpringBootApplication
@RestController
@CrossOrigin(origins="*")
@RequestMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
@Api(tags = {"user"})
public class UserController {
    @DeleteMapping("/user")
    @ApiOperation(value = "Delete user", tags = {"user"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 400, message = "Unauthorized")
    })
    public void deleteUser()
    {
        throw new NotImplementedException();
    }

    @PutMapping("/user")
    @ApiOperation(value = "Update User", response = UserFullView.class, tags = {"user"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 400, message = "Unauthorized")
    })
    public ResponseEntity<UserFullView> updateUser(@RequestBody final UserView userView)
    {
        throw new NotImplementedException();
    }

    @GetMapping("/user/cars")
    @ApiOperation(value = "Get owner cars", response = OwnCarView.class, tags = {"user"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 400, message = "Unauthorized"),
            @ApiResponse(code = 404, message = "Not Found")
    })
    public ResponseEntity<OwnCarView[]> ownerGetCars()
    {
        throw new NotImplementedException();
    }

    @GetMapping("user/cars/car")
    @ApiOperation(value = "Get owner car by id", response = OwnCarView.class, tags = {"user"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 400, message = "Unauthorized"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 409, message = "Conflict")
    })
    public ResponseEntity<OwnCarView> ownerGetCarById(@RequestParam ("serial_number") String serialNumber)
    {
        throw new NotImplementedException();
    }

    @GetMapping("user/cars/periods")
    @ApiOperation(value = "Get owner booked periods by car", response = BookPeriodsView.class, tags = {"user"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 400, message = "Unauthorized"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 409, message = "Conflict")
    })
    public ResponseEntity<BookPeriodsView> ownerGetBookedPeriodsByCarId(@RequestParam ("serial_number") String serialNumber)
    {
        throw new NotImplementedException();
    }
}
