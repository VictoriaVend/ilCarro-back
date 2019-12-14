package ilcarro.controller.impl;

import ilcarro.dto.user.UserFullView;
import io.swagger.annotations.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import static ilcarro.dto.Constants.*;

@RestController
@CrossOrigin(origins = "*")
@Api(tags = {"User login controller (login a user)"})
public class UserLoginController {
    @ApiOperation("User login")
    @GetMapping(USER_LOGIN)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 401, message = "Unauthorized")
    })
    ResponseEntity<UserFullView> loginUser () {
        throw new ResponseStatusException(HttpStatus.NOT_IMPLEMENTED);
    }
}
