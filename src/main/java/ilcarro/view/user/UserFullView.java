package ilcarro.view.user;

import ilcarro.view.car.BookedCarView;
import ilcarro.view.car.OwnCarView;
import ilcarro.view.comment.CommentView;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author NikolayMalikhin on 04.12.2019.
 */
@Getter
@Setter
public class UserFullView extends OwnerView {
    @ApiModelProperty(value = "test value")
    private List<CommentView> comments = new ArrayList<>();
    private List<OwnCarView> ownCars = new ArrayList<>();
    private List<BookedCarView> bookedCars = new ArrayList<>();
    private List<BookedCarView> history = new ArrayList<>();
}