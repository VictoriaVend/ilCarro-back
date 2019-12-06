package ilCarro.view.user;

import ilCarro.view.car.BookedCarView;
import ilCarro.view.car.OwnCarView;
import ilCarro.view.comment.CommentView;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
public class UserFullView  extends OwnerView {
    private List <CommentView> comments = new ArrayList<>();
    private List<OwnCarView> own_cars = new ArrayList<>();
    private List<BookedCarView> booked_car = new ArrayList<>();
    private List<BookedCarView> history = new ArrayList();


}
