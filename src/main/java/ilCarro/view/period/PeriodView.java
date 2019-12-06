package ilCarro.view.period;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import ilCarro.view.LocalDateTimeDeserializer;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Getter
@Setter
public class PeriodView {
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = LocalDateTimeDeserializer.PATTERN)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    LocalDate start_date_time;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = LocalDateTimeDeserializer.PATTERN)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    LocalDate end_date_time;
}
