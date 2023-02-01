package service;

import models.UserRequest;

public interface IRentService {
    void processRequest(UserRequest request);
    void returnMovie(UserRequest request);
}
