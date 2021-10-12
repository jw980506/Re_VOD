package kr.teamcook.vod.Entity;

import java.util.UUID;

public class VodTvEntity extends VodEntity {

    private String pd;  // 메인PD
    private int series; // 시리즈(몇부작)

    // 기본 생성자
    public VodTvEntity() {}

    // 사용자 정의 생성자
    public VodTvEntity(String vodName, String production, String genre, UUID isbn, int price, int launchYear, float rating, String pd, int series) {
        super(vodName, production, genre, isbn, price, launchYear, rating);
        this.pd = pd;
        this.series = series;
    }

    // 출력을 위한 toString
    public String toString() {
        return "번째 \n" + "VOD명 : " + getVodName() + "\n" + "제작사 : " + getProduction() + "\n" +
                "장르 : " + getGenre() + "\n" + "ISBN : " + getIsbn() + "\n" +
                "가격 : " + getPrice() + "\n" + "개봉년도 : " + getLaunchYear() + "\n" +
                "평점 : " + getRating() + "\n" + "메인PD : " + getPd() + "\n" +
                "시리즈(몇부작) : " +getSeries();
    }


    // getter and setter
    public String getPd() {
        return pd;
    }

    public void setPd(String pd) {
        this.pd = pd;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }
}
