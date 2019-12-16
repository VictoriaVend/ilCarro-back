package ilcarro.view.user;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class PersonWhoBookedView extends UserView {
    @ApiModelProperty(example = "email@email.com")
    private String email;
    @ApiModelProperty(example = "972000000000")
    private String phone;


}