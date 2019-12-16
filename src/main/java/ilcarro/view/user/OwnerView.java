package ilcarro.view.user;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import ilcarro.view.LocalDateDeserializer;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class OwnerView extends UserView {
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = LocalDateDeserializer.PATTERN)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @ApiModelProperty(dataType = "DATE")
    private LocalDate registrationDate ;


}