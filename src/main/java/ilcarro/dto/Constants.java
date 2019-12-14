package ilcarro.dto;

public interface Constants {
    // parameters
    String SERIAL_NUMBER = "serial_number";         // question for car number
    String DATE_FROM = "start_date";
    String DATE_TO = "end_date";
    String MIN_AMOUNT = "min_amount";
    String MAX_AMOUNT = "max_amount";
    String ITEMS_ON_PAGE = "items_on_page";
    String CURRENT_PAGE = "current_page";

    // RegistraionController
    String REGISTRATION = "/registration";          // post /registration UserView -> UserFullView
    // UserLoginController
    String USER_LOGIN = "/user/login";              // get -> UserFullView
    // UserController
    String UPDATE_USER = "/user";                   // put UserView -> UserFullView
    String DELETE_USER = "/user";                   // delete
    String OWNER_GET_CARS = "/user/cars";           // get -> OwnCarView []
    String OWNER_GET_CAR_BY_ID = "/user/cars/car";  // get ?serial_number = 123-67-123 -> OwnCarView
    String OWNER_GET_BOOKED_PERIODS_BY_CAR_ID = "/user/cars/periods"; // get ?serial_number = 123-67-123 -> BookedPeriodsView
    // CarController
    String ADD_CAR = "/car";                        // POST CarView -> CarFullView
    String UPDATE_CAR = "/car";                     // PUT ?serial_number = 123-67-123 CarView -> CarFullView
    String DELETE_CAR = "/car";                     // DELETE ?serial_number = 123-67-123
    // CommentController
    String POST_A_COMMENT = "/comment";             // POST ?serial_number = 123-67-123 CommentShortView
    // SearchController
    String SEARCH = "/search";                      // GET  -> SearchView
    String SEARCH_BY_COORDINATES = "/search/geo";   // GET  -> SearchView
    String SEARCH_BY_FILTERS = "/search/filters";   // GET  -> SearchFilterView
    String SEARCH_THAT_CONTAINS_ALL_SEARCHES = "/search/all"; // GET  -> SearchFilterView
    // ReservationController
    String CONFIRM_RESERVATION = "/reservation/confirm"; // POST  ReservationConfirmRequest
    String MAKE_A_RESERVATION = "/car/reservation"; // POST ?serial_number = 123-67-123 ReservationRequest -> ReservationResponse
    // UtilController
    String GET_FILTERS = "/filters";                // GET  -> FilterView []
    String LATEST_COMMENTS = "/comments";           // GET  -> CommentView []
    String GET_CAR_BY_ID_FOR_USERS = "/car";        // GET ?serial_number = 123-67-123 -> CarByIdView
    String BEST_BOOKED = "/car/best";               // GET  -> CarByIdView []
}
