package ilcarro.controller.impl;

import ilcarro.dto.reservation.*;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import static ilcarro.dto.Constants.*;

@RestController
@CrossOrigin(origins = "*")
@Api(tags = {"Make a reservation controller (car reservation, confirm reservation)"})
public class ReservationController {
    @ApiOperation("Confirm payment")
    @PostMapping(CONFIRM_RESERVATION)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 409, message = "Conflict")
    })
    public void confirmPayment (@RequestBody final ReservationConfirmRequest reservationConfirmRequest) {
        throw new ResponseStatusException(HttpStatus.NOT_IMPLEMENTED);
    }

    @ApiOperation("Make a reservation")
    @PostMapping(MAKE_A_RESERVATION)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 409, message = "Conflict")
    })
    public ResponseEntity<ReservationResponse> makeAReservation (@RequestBody final ReservationRequest reservationRequest ) {
        throw new ResponseStatusException(HttpStatus.NOT_IMPLEMENTED);
    }
}
