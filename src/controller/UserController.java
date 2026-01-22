package controller;

import dao.UserDAO;
import model.User;

public class UserController {

    private UserDAO userDAO = new UserDAO();

    public User login(String username, String password) {
        return userDAO.login(username, password);
    }
}
