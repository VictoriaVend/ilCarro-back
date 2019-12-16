package ilcarro.controller.impl;

import ilcarro.exception.NotImplementedException;
import ilcarro.view.user.UserFullView;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
@Api(tags = {"login"})
public class UserLoginController {
    @GetMapping(value = "/user/login")
    @ApiOperation(value = "Login user", response = UserFullView.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 401, message = "Unauthorized")
    })
    public ResponseEntity<UserFullView> getCurrentCapacityById () {
        throw new NotImplementedException();
    }
}