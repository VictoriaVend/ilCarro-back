package ilcarro.view.comment;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import ilcarro.view.LocalDateDeserializer;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

/**
 * @author NikolayMalikhin on 04.12.2019.
 */
@Getter
@Setter
public class CommentView extends CommentShortView {
    private String firstName;
    private String secondName;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = LocalDateDeserializer.PATTERN)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate postDate;
}