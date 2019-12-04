package ilcarro.view.period;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import ilcarro.view.LocalDateTimeDeserializer;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author NikolayMalikhin on 04.12.2019.
 */
@Getter
@Setter
public class BookedPeriodView extends PeriodView {
    private String orderId;
    private Boolean paid;
    private BigDecimal amount;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = LocalDateTimeDeserializer.PATTERN)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime bookingDate;
}