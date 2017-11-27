package ua.kiev.sinenko;

import java.util.Arrays;

public class User {
    private String userName;
    private String password;
    private Role roles[];

    public User() {
    }

    public User(String userName, String password, Role[] roles) {
        this.userName = userName;
        this.password = password;
        this.roles = roles;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role[] getRoles() {
        return roles;
    }

    public void setRoles(Role[] roles) {
        this.roles = roles;
    }

}
