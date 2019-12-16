package ilcarro.view.comments;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommentShortView {
    @ApiModelProperty(value = "A long time ago in a galaxy far, far away")
    private String post;
}
