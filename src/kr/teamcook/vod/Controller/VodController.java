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

    int idxm = 0;   // movie 전역변수
    int idxt = 0;   // tv 전역변수

    // 등록
    public void Insert() {
        System.out.println("등록시작\n");

        System.out.printf("VOD명 > ");
        String name = sc.nextLine();

        System.out.printf("제작사 > ");
        String produc = sc.nextLine();

        System.out.printf("장르 > ");
        String gen = sc.nextLine();

        System.out.printf("가격 > ");
        int pri = Integer.parseInt(sc.nextLine());

        System.out.printf("개봉년도(yyyy) > ");
        int year = Integer.parseInt(sc.nextLine());

        System.out.printf("평점 > ");
        float ting = sc.nextFloat();
        sc.nextLine();

        UUID isbn = UUID.randomUUID();  // ISBN 생성

        // 영화 or TV 선택
        System.out.printf("VOD가 영화면 1번, TV면 2번을 입력 > ");
        int choice = Integer.parseInt(sc.nextLine());

        // 영화로 등록
        if (choice == 1) {
            System.out.printf("영화감독 > ");
            String direc = sc.nextLine();

            System.out.printf("영상길이(분) > ");
            int lenght = Integer.parseInt(sc.nextLine());

            // 객체에 저장
            movie[idxm] = new VodMovieEntity(name, produc, gen, isbn, pri, year, ting, direc, lenght);
            idxm++;
            System.out.println("등록완료\n");
        }

        // TV로 등록
        else if (choice == 2) {
            System.out.printf("메인PD > ");
            String pd = sc.nextLine();

            System.out.printf("시리즈(몇부작) > ");
            int seri = Integer.parseInt(sc.nextLine());

            //객체에 저장
            tv[idxt] = new VodTvEntity(name, produc, gen, isbn, pri, year, ting, pd, seri);
            idxt++;
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

        // 영화 선택
        if (choice == 1) {
            if (idxm == 0) {
                System.out.println();
                System.out.println("등록되어있는 영화가 없습니다.");
            }
            else {
                for (int i = 0; i < idxm; i++) {
                    System.out.println();
                    System.out.println(i + 1 + movie[i].toString());
                }
            }
        }

        // Tv 선택
        else if (choice == 2) {
            if (idxt == 0) {
                System.out.println();
                System.out.println("등록되어있는 Tv가 없습니다.");
            }
            else {
                for (int j = 0; j < idxt; j++) {
                    System.out.println();
                    System.out.println(j + 1 + tv[j].toString());
                }
            }
        }

        else {
            System.out.println("잘못입력하셨습니다");
            Show();
        }
    }// 조회 끝


    // 수정
    public void Modify() {
        System.out.println();
        System.out.println("수정시작\n");

        System.out.printf("(1)영화수정, (2)Tv수정 > ");
        int choice = Integer.parseInt(sc.nextLine());

        if (choice == 1) {
            if (idxm == 0) {
                System.out.println();
                System.out.println("등록된 정보가 없습니다.");
            }
            else {
                System.out.println();
                System.out.printf("수정을 원하는 n번째 입력 > ");
                int selnum = Integer.parseInt(sc.nextLine());

                System.out.println();
                System.out.println("수정 데이터 입력 시작");

                System.out.printf("VOD명 > ");
                String name = sc.nextLine();

                System.out.printf("제작사 > ");
                String produc = sc.nextLine();

                System.out.printf("장르 > ");
                String gen = sc.nextLine();

                System.out.printf("가격 > ");
                int pri = Integer.parseInt(sc.nextLine());

                System.out.printf("개봉년도(yyyy) > ");
                int year = Integer.parseInt(sc.nextLine());

                System.out.printf("평점 > ");
                float ting = sc.nextFloat();
                sc.nextLine();

                System.out.printf("영화감독 > ");
                String direc = sc.nextLine();

                System.out.printf("영상길이(분) > ");
                int lenght = Integer.parseInt(sc.nextLine());

                System.out.println("ISBN은 수정 불가");
                UUID isbn = movie[selnum-1].getIsbn();

                // 객체에 다시 저장
                movie[selnum-1] = new VodMovieEntity(name, produc, gen, isbn, pri, year, ting, direc, lenght);
                System.out.println();
                System.out.println("수정완료\n" + selnum + movie[selnum-1].toString());
            }
        }

        else if (choice == 2) {
            if (idxt == 0) {
                System.out.println();
                System.out.println("등록된 정보가 없습니다.");
            }
            else {
                System.out.println();
                System.out.printf("수정을 원하는 n번째 입력 > ");
                int selnum = Integer.parseInt(sc.nextLine());

                System.out.println();
                System.out.println("수정 데이터 입력 시작");

                System.out.printf("VOD명 > ");
                String name = sc.nextLine();

                System.out.printf("제작사 > ");
                String produc = sc.nextLine();

                System.out.printf("장르 > ");
                String gen = sc.nextLine();

                System.out.printf("가격 > ");
                int pri = Integer.parseInt(sc.nextLine());

                System.out.printf("개봉년도(yyyy) > ");
                int year = Integer.parseInt(sc.nextLine());

                System.out.printf("평점 > ");
                float ting = sc.nextFloat();
                sc.nextLine();

                System.out.printf("메인PD > ");
                String pd = sc.nextLine();

                System.out.printf("시리즈(몇부작) > ");
                int seri = Integer.parseInt(sc.nextLine());

                System.out.println("ISBN은 수정 불가");
                UUID isbn = tv[selnum-1].getIsbn();

                //객체에 저장
                tv[selnum-1] = new VodTvEntity(name, produc, gen, isbn, pri, year, ting, pd, seri);
                System.out.println();
                System.out.println("수정완료\n" + selnum + tv[selnum-1].toString());
            }
        }
    }// 수정 끝


    // 삭제
    public void Delete() {
        System.out.println();
        System.out.println("삭제 시작");

        System.out.printf("(1)영화, (2)Tv > ");
        int delnum = Integer.parseInt(sc.nextLine());

        if (delnum == 1) {
            System.out.println("영화선택");
            if (idxm == 0) {
                System.out.println();
                System.out.println("등록된 정보가 없습니다.");
            }
            else {
                System.out.printf("삭제할 영화의 n번째 > ");
                int delmovie = Integer.parseInt(sc.nextLine());

                if (delmovie >= 0 && delmovie <= idxm) {
                    for (int i = delmovie - 1; i < idxm; i++) {
                        movie[i] = movie[i + 1];
                    }
                    System.out.println("삭제완료");
                    idxm--;
                }
                else {
                    System.out.println("잘못입력하셨습니다.");
                }
            }
        }

        else if (delnum == 2) {
            System.out.println("Tv선택");
            if (idxt == 0) {
                System.out.println();
                System.out.println("등록된 정보가 없습니다.");
            }
            else {
                System.out.printf("삭제할 Tv의 n번째 > ");
                int deltv = Integer.parseInt(sc.nextLine());

                if (deltv >= 0 && deltv <= idxt){
                    for (int i = deltv - 1; i < idxt; i++) {
                        tv[i] = tv[i + 1];
                    }
                    System.out.println("삭제완료");
                    idxt--;
                }
                else {
                    System.out.println("잘못입력하셨습니다.");
                }
            }
        }
    }// 삭제 끝
}