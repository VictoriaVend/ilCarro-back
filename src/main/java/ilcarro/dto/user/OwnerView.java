package ilcarro.dto.user;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class OwnerView extends UserView {
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate registrationDate;
}
