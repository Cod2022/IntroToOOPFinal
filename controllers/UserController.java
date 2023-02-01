package controllers;

import models.User;
import models.UserRequest;
import service.IFilmService;
import service.IRentService;
import view.UserView;

public class UserController {

    private User user;
    private IRentService rentSrv;
    private UserView userView;

    public UserController(User user, IRentService rentSrv) {
        this.user = user;
        this.rentSrv = rentSrv;
        userView = new UserView();
    }

    public void run(int choose) {
        if(choose == 1) {
            submitRequest();
        if(choose == 2) {
            returnMovie();
        }
        }
    }
    public void submitRequest(){
        var movieName = userView.showSubmitMenu();
        rentSrv.processRequest(createRequest(movieName));
    }

    public void returnMovie() {
        var movieName = userView.showReturnMenu();
        rentSrv.returnMovie(createRequest(movieName));
    }

    private UserRequest createRequest(String movieName) {
        UserRequest req = new UserRequest();
        req.setMovieName(movieName);
        req.setUser(user);
        return req;
    }


}
