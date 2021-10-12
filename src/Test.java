import kr.teamcook.vod.Controller.VodController;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        VodController ctrl = new VodController();


        while (true) {
            System.out.println();
            System.out.println("=====메뉴=====");
            System.out.println("1. 등록");
            System.out.println("2. 조회");
            System.out.println("3. 수정");
            System.out.println("4. 삭제");
            System.out.println("5. 프로그램 종료");
            System.out.println("=============");
            System.out.printf("입력 > ");

            int choice = Integer.parseInt(sc.nextLine());


            switch (choice) {
                case 1: ctrl.Insert();
                    break;

                case 2: ctrl.Show();
                    break;


                default:
                    System.out.println("프로그램을 종료합니다");
                    System.exit(0);
            }
        }
    }
}
