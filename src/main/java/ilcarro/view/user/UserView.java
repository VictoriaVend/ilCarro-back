package ilcarro.view.user;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class UserView {
    @ApiModelProperty(example = "George")
    private  String firstName;
    @ApiModelProperty(example = "O'Conner")
    private  String secondName;


}