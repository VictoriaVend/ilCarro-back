package ilcarro.controller.impl;

import ilcarro.exception.NotImplementedException;
import ilcarro.view.reservation.ReservationConfirmRequest;
import ilcarro.view.reservation.ReservationRequest;
import ilcarro.view.reservation.ReservationResponse;
import ilcarro.view.user.UserFullView;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(params = "serial_number", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
@Api(tags = {"reservation"})
public class ReservationController {
    @PostMapping("/car/reservation")
    @ApiOperation(value = "Make a reservation", response = ReservationResponse.class, tags = {"reservation"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 409, message = "Conflict")
    })
    public ResponseEntity<ReservationResponse> carReservationById(@RequestParam ("serial_number") ReservationRequest reservationRequest){
        throw new NotImplementedException();
    }
@PostMapping("/reservation/confirm")
@ApiOperation(value = "Confirm payment", response = ReservationConfirmRequest.class, tags = {"payment"})
@ApiResponses(value = {
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 409, message = "Conflict")
})
public ResponseEntity<ReservationConfirmRequest> confirmPaymentById(){
    throw new NotImplementedException();
}
}
