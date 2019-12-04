package ilcarro.view.user;

import lombok.Getter;
import lombok.Setter;

/**
 * @author NikolayMalikhin on 04.12.2019.
 */
@Getter
@Setter
public class PersonWhoBookedView extends UserView {
    private String email;
    private String phone;
}