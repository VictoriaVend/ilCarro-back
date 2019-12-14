package ilcarro.controller.impl;

import ilcarro.exception.NotImplementedException;
import ilcarro.view.comment.CommentShortView;
import ilcarro.view.user.UserFullView;
import ilcarro.view.user.UserView;
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
@Api(tags = {"comment"})
public class CommentController {
    @PostMapping("/comment")
    @ApiOperation(value = "Post a comment", response = CommentShortView.class, tags = {"comment"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 409, message = "Conflict")
    })
    public ResponseEntity<CommentShortView> postCommentByCarId(@RequestParam ("serial_number") String serialNumber){
        throw new NotImplementedException();
    }
}
