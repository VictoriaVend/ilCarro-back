package ilCarro.controller.impl;

import ilCarro.exception.NotImplementedException;
import ilCarro.view.user.UserFullView;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/user/login", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
@Api(tags = {"userLogin"})
public class UserLoginController {
    @GetMapping(value = "/")
    @ApiOperation(value = "Register new user", response = UserFullView.class, tags = {"registration"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 409, message = "Conflict")
    })
    public ResponseEntity<UserFullView> getCurrentCapacityById() {
        throw new NotImplementedException();
    }
}