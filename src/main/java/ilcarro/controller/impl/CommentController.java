package ilcarro.controller.impl;

import ilcarro.dto.comment.CommentShortView;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import static ilcarro.dto.Constants.*;

@RestController
@CrossOrigin(origins = "*")
@Api(tags = {"Comment controller (post comment)"})
public class CommentController {
    @ApiOperation("Post a new comment from current user")
    @PostMapping(POST_A_COMMENT)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 409, message = "Conflict")
    })
    public void postComment(@RequestParam(name = SERIAL_NUMBER) final String serialNumber, @RequestBody final CommentShortView commentShortView) {
        throw new ResponseStatusException(HttpStatus.NOT_IMPLEMENTED);
    }
}
