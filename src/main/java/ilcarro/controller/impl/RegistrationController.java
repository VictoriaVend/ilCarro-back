package ilcarro.controller.impl;

import ilcarro.dto.user.*;
import io.swagger.annotations.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import static ilcarro.dto.Constants.*;

@RestController
@CrossOrigin(origins = "*")
@Api(tags = {"Registration controller (To register new user)"})
public class RegistrationController {
    @ApiOperation("Register new user")
    @PostMapping(REGISTRATION)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 409, message = "Conflict")
    })
    public ResponseEntity<UserFullView> registration(@RequestBody final UserView userView) {
        throw new ResponseStatusException(HttpStatus.NOT_IMPLEMENTED);
    }
}
