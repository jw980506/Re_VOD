package kr.teamcook.vod.Entity;

import java.util.UUID;

public class VodEntity {

    private String vodName; // vod명
    private String production;  // 제작사
    private String genre;   // 장르
    private UUID isbn;  // ISBN
    private int price;  // 가격
    private int launchYear; // 개봉년도(yyyy)
    private float rating;   // 평점

    // 기본 생성자
    VodEntity() {}

    // 사용자 정의 생성자
    public VodEntity(String vodName, String production, String genre, UUID isbn, int price, int launchYear, float rating) {
        this.vodName = vodName;
        this.production = production;
        this.genre = genre;
        this.isbn = isbn;
        this.price = price;
        this.launchYear = launchYear;
        this.rating = rating;
    }

    // getter and setter
    public String getVodName() {
        return vodName;
    }

    public void setVodName(String vodName) {
        this.vodName = vodName;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public UUID getIsbn() {
        return isbn;
    }

    public void setIsbn(UUID isbn) {
        this.isbn = isbn;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getLaunchYear() {
        return launchYear;
    }

    public void setLaunchYear(int launchYear) {
        this.launchYear = launchYear;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}
