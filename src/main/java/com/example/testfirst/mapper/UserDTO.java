package com.example.testfirst.mapper;

public class UserDTO {
    private String username;
    private String email;
    private String phone;
    private long time;

    public UserDTO() {
    }

//    public UserDTO(String username, String email, String phone) {
//        this.username = username;
//        this.email = email;
//        this.phone = phone;
//    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public UserDTO(String username, String email, String phone, long time) {
        this.username = username;
        this.email = email;
        this.phone = phone;
        this.time = time;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
