package ilcarro.dto.reservation;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReservationConfirmRequest {
    private String orderNumber;
    private String confirmationCode;
}
