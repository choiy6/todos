package com.playdata.todos.dto;

public class User {
    private Integer id;
    private String username;
    private String name;
    private String password;
    private String createAt;
    public Integer getId() {
        return id;
    }

    public User(Integer id, String username, String name, String password, String createAt) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.password = password;
        this.createAt = createAt;
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getCreateAt() {
        return createAt;
    }


}
