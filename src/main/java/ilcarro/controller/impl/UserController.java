package ilcarro.controller.impl;

import ilcarro.exception.NotImplementedException;
import ilcarro.view.car.OwnCarView;
import ilcarro.view.period.BookedPeriodView;
import ilcarro.view.user.UserFullView;
import ilcarro.view.user.UserView;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping (consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
@Api(tags = {"user"})
public class UserController {
    @PutMapping("/user")
    @ApiOperation(value = "Update user", response = UserFullView.class, tags = {"user"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 401, message = "Unauthorized")
    })
    public ResponseEntity<UserFullView> putUserById(@RequestBody final UserView userView){
        throw new NotImplementedException();
    }
    @DeleteMapping("/user")
    @ApiOperation(value = "Delete user", tags = {"user"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 401, message = "Unauthorized")
    })
    public void deleteUserById(){
        throw new NotImplementedException();
    }
    @GetMapping("user/cars")
    @ApiOperation(value = "Owner get cars", response = OwnCarView.class, tags = {"user"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 404, message = "Not Found")
    })
    public ResponseEntity<OwnCarView[]> getCarsByOwnerId(){
        throw new NotImplementedException();
    }
    @GetMapping("user/cars/car")
    @ApiOperation(value = "Owner get car by id", response = OwnCarView.class, tags = {"user"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 409, message = "Conflict")
    })
    public ResponseEntity<OwnCarView> getCarById(@RequestParam ("serial_number") String serialNumber){
        throw new NotImplementedException();
    }
    @GetMapping("user/cars/periods")
    @ApiOperation(value = "Owner get booked periods by car id", response = BookedPeriodView.class, tags = {"user"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 409, message = "Conflict")
    })
    public ResponseEntity<BookedPeriodView> getBookedPeriodsByCarId(@RequestParam ("serial_number") String serialNumber){
        throw new NotImplementedException();
    }
}
