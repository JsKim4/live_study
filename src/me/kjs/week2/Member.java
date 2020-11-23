package me.kjs.week2;

import java.util.List;

public class Member {

    private String email;
    private String password;
    private List<Role> roles;

    public boolean isContainRole(Role targetRole) {

        boolean isContain = false;
        for (Role role : roles) {
            if(role == targetRole) {
                isContain = true;
            }
        }
        return isContain;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private enum Role {
        GET,POST
    }
}

