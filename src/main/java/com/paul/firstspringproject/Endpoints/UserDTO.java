package com.paul.firstspringproject.Endpoints;
public class UserDTO {

    private int id;
    private String username;

    private String password;
    private String email;
    private int karma;

    // Constructor, getters, and setters

    public UserDTO() {
    }

    public UserDTO(int id, String username, String password, String email, int karma) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.karma = karma;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getKarma() {
        return karma;
    }

    public void setKarma(int karma) {
        this.karma = karma;
    }
}

