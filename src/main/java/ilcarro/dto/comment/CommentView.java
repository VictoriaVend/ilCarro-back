package ilcarro.dto.comment;

import com.fasterxml.jackson.annotation.JsonFormat;
import ilcarro.dto.user.UserView;

import java.time.LocalDate;

public class CommentView extends UserView {
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate postDate;
    private String post;
}
