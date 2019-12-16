package ilcarro.controller.impl;

import ilcarro.exception.NotImplementedException;
import ilcarro.view.comments.CommentShortView;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public class CommentController {
    @PostMapping("/comment")
    @ApiOperation(value = "Post Comment", response = CommentShortView.class, tags = {"comment"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 400, message = "Unauthorized"),
            @ApiResponse(code = 404, message = "Not Found")
    })
    public ResponseEntity<CommentShortView> postComment(@RequestParam ("serial_number") String serialNumber)
    {
        throw new NotImplementedException();
    }
}
