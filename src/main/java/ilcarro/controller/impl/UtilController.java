package ilcarro.controller.impl;

import ilcarro.dto.car.CarByIdView;
import ilcarro.dto.comment.CommentView;
import ilcarro.dto.search.FilterView;
import io.swagger.annotations.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

import static ilcarro.dto.Constants.*;

@RestController
@CrossOrigin(origins = "*")
@Api(tags = {"Utilites controller (Get filters, Latest comments, Get car by id for users, Best booked)"})
public class UtilController {
    @ApiOperation("Get filters")
    @GetMapping(GET_FILTERS)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Not Found")
    })
    ResponseEntity<FilterView> getFilters() {
        throw new ResponseStatusException(HttpStatus.NOT_IMPLEMENTED);
    }

    @ApiOperation("Get latest comments")
    @GetMapping(LATEST_COMMENTS)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Not Found")
    })
    ResponseEntity<List<CommentView>> latestComments() {
        throw new ResponseStatusException(HttpStatus.NOT_IMPLEMENTED);
    }

    @ApiOperation("Get car by id")
    @GetMapping(GET_CAR_BY_ID_FOR_USERS)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Not Found")
    })
    ResponseEntity<CarByIdView> getCarByIdForUsers(@RequestParam(name = SERIAL_NUMBER) final String serialNumber) {
        throw new ResponseStatusException(HttpStatus.NOT_IMPLEMENTED);
    }

    @ApiOperation("Get 3 best booked cars")
    @GetMapping(BEST_BOOKED)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Not Found")
    })
    ResponseEntity<List<CarByIdView>> bestBooked() {
        throw new ResponseStatusException(HttpStatus.NOT_IMPLEMENTED);
    }
}
