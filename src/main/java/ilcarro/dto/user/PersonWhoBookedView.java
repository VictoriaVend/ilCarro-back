package ilcarro.dto.user;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonWhoBookedView extends UserView {
    private String email;
    private String phone;
}
