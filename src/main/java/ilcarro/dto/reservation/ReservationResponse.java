package ilcarro.dto.reservation;

import com.fasterxml.jackson.annotation.JsonFormat;
import ilcarro.dto.period.PeriodView;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
public class ReservationResponse extends PeriodView {
    private String orderNumber;
    private BigDecimal amount;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private LocalDateTime bookingDate;
}
