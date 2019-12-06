package ilCarro.view.comment;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import ilCarro.view.LocalDateTimeDeserializer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter

public class CommentView {
    private String firstName;
    private String secondName;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = LocalDateTimeDeserializer.PATTERN)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    LocalDate postDate;
}
