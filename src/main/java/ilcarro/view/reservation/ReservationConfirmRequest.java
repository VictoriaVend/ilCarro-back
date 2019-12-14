package ilcarro.view.reservation;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReservationConfirmRequest {
 private Integer orderNumber;
 private String confirmationCode;
}
