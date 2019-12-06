package ilCarro.view.period;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class BookedPeriodView extends PeriodView{
   public  String order_id;
   public  boolean paid;
   public double amount ;
   LocalDateTime booking_date;
   private BookedPeriodWithPersonView booked_periods;
}
