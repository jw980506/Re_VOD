package kr.teamcook.vod.Controller;

import kr.teamcook.vod.Entity.*;
import java.util.Scanner;
import java.util.UUID;

public class VodController {

    Scanner sc = new Scanner(System.in);    // 입력받기 위한 Scanner

    // 객체배열 생성
//    VodEntity[] vod = new VodEntity[50];
    VodMovieEntity[] movie = new VodMovieEntity[10];
    VodTvEntity[] tv = new VodTvEntity[10];

    int cnt = 0;    //전역변수 선언


    // 등록
    public void Insert() {
        System.out.println("등록시작\n");

        System.out.printf("VOD명 > ");
        String name = sc.nextLine();
        System.out.println(name);

        System.out.printf("제작사 > ");
        String produc = sc.nextLine();
        System.out.println(produc);

        System.out.printf("장르 > ");
        String gen = sc.nextLine();
        System.out.println(gen);

        System.out.printf("가격 > ");
        int pri = Integer.parseInt(sc.nextLine());
        System.out.println(pri);

        System.out.printf("개봉년도(yyyy) > ");
        int year = Integer.parseInt(sc.nextLine());
        System.out.println(year);

        System.out.printf("평점 > ");
        float ting = sc.nextFloat();
        sc.nextLine();
        System.out.println(ting);

        // ISBN 생성
        UUID isbn = UUID.randomUUID();


        // 영화 or TV 선택
        System.out.printf("VOD가 영화면 1번, TV면 2번을 입력 > ");
        int choice = Integer.parseInt(sc.nextLine());

        // 영화
        if (choice == 1) {
            System.out.printf("영화감독 > ");
            String direc = sc.nextLine();

            System.out.printf("영상길이(분) > ");
            int lenght = Integer.parseInt(sc.nextLine());

            // 객체에 저장
            movie[cnt] = new VodMovieEntity(name, produc, gen, isbn, pri, year, ting, direc, lenght);
            cnt++;
            System.out.println("등록완료\n");
        }

        // TV
        else if (choice == 2) {
            System.out.printf("메인PD > ");
            String pd = sc.nextLine();

            System.out.printf("시리즈(몇부작) > ");
            int seri = Integer.parseInt(sc.nextLine());

            //객체에 저장
            tv[cnt] = new VodTvEntity(name, produc, gen, isbn, pri, year, ting, pd, seri);
            cnt++;
            System.out.println("등록완료\n");
        }

        // 잘못된 입력받으면 실행
        else {
            System.out.println("잘못입력하셨습니다");
            Insert();
        }
    }// 등록 끝

    // 조회
    public void Show() {
        System.out.println();
        System.out.println("조회시작\n");

        System.out.printf("영화조회(1번), TV조회(2번) > ");

        int choice = Integer.parseInt(sc.nextLine());

        if (choice == 1) {
            System.out.println(movie.toString());
        }
    }
}
