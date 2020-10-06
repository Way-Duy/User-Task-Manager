package com.company;

public class Member {
    private String username, password; //immutable
    Member(String username, String password){
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }
    public boolean testPassword(String attempt){
        if (attempt == password)
            return true;
        return false;
    }
}
