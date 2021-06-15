package com.example.testfirst.stream;

public class Movies {
    private String title;
    private int like;

    public Movies() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public Movies(String title, int like) {
        this.title = title;
        this.like = like;
    }

}
