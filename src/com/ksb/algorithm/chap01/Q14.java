package com.ksb.algorithm.chap01;

import java.util.Scanner;

public class Q14 {

    // 오른쪽과 같이 입력한 수를 한 변으로 하는 정사각형을 * 기호로 출력하는 프로그램을 작성하세요

    public static void solution(){

        System.out.println("사각형을 출력합니다.");
        System.out.println("단 수 : ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
