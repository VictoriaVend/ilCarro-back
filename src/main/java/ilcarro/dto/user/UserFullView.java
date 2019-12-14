package ilcarro.dto.user;

import ilcarro.dto.car.BookedCarView;
import ilcarro.dto.car.OwnCarView;
import ilcarro.dto.comment.CommentView;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class UserFullView extends UserView {
    private List<CommentView> comments = new ArrayList<>();
    private List<OwnCarView> ownCars = new ArrayList<>();
    private List<BookedCarView> bookedCars = new ArrayList<>();
    private List<BookedCarView> history = new ArrayList<>();
}
