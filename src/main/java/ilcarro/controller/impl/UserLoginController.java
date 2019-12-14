package ilcarro.controller.impl;

import ilcarro.exception.NotImplementedException;
import ilcarro.view.user.UserFullView;
import ilcarro.view.user.UserView;
import io.swagger.annotations.*;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
@Api(tags = {"login"})
public class UserLoginController {
    @GetMapping("/user/login")
    @ApiOperation(value = "Login user", response = UserFullView.class, tags = {"login"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 401, message = "Unauthorized")
    })
    public ResponseEntity<UserFullView> loginUserById() {
        throw new NotImplementedException();
    }
}
