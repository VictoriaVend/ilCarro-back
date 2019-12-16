package ilcarro.view.period;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import ilcarro.view.LocalDateTimeDeserializer;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
public class BookedPeriodView extends PeriodView {
    private String orderId;
    @ApiModelProperty(required = true)
    private Boolean paid;
    @ApiModelProperty(value = "123.34")
    private BigDecimal amount;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = LocalDateTimeDeserializer.PATTERN)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime bookingDate;
}