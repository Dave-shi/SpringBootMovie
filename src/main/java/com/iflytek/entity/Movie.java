package com.iflytek.entity;

public class Movie {
    private Long id;
    private String title;
    private String img;
    private Integer stars;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Integer getStars() {
        return stars;
    }

    public void setStars(Integer stars) {
        this.stars = stars;
    }
}
