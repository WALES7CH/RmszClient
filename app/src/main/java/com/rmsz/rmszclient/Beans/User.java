package com.rmsz.rmszclient.Beans;

/**
 * Created by witt on 16/12/2.
 */

public class User {

    /**
     * username : admin
     * password : jzd
     */

    private String username;
    private String password;

    public User(String username,String password){
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
