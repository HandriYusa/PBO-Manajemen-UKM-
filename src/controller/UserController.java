// UserController.java

package controller;

import model.User;

public class UserController {

    // Simulasi user aktif (bisa dikembangkan ke DB)
    private User userAktif;

    public void login(int idUser, String nama, String role) {
        userAktif = new User(idUser, nama, role);
    }

    public User getUserAktif() {
        return userAktif;
    }

    public boolean isLogin() {
        return userAktif != null;
    }

    public void logout() {
        userAktif = null;
    }
}

