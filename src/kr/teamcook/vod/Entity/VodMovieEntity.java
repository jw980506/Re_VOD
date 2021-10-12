package kr.teamcook.vod.Entity;

import java.util.UUID;

public class VodMovieEntity extends VodEntity {

    private String director;    // 영화감독
    private int MovieLenght;    // 영상길이(분)

    // 기본 생성자
    public VodMovieEntity() {}

    // 사용자 정의 생성자
    public VodMovieEntity(String vodName, String production, String genre, UUID isbn, int price, int launchYear, float rating, String director, int movieLenght) {
        super(vodName, production, genre, isbn, price, launchYear, rating);
        this.director = director;
        MovieLenght = movieLenght;
    }

    // 출력을 위한 toString
    public String toString() {
        return "번째 \n" + "VOD명 : " + getVodName() + "\n" + "제작사 : " + getProduction() + "\n" +
                "장르 : " + getGenre() + "\n" + "ISBN : " + getIsbn() + "\n" +
                "가격 : " + getPrice() + "\n" + "개봉년도 : " + getLaunchYear() + "\n" +
                "평점 : " + getRating() + "\n" + "영화감독 : " + getDirector() + "\n" +
                "영상길이(분) : " + getMovieLenght();
    }


    // getter and setter
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getMovieLenght() {
        return MovieLenght;
    }

    public void setMovieLenght(int movieLenght) {
        MovieLenght = movieLenght;
    }
}
