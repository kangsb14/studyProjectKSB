package com.ksb.algorithm.chap02;

import java.util.Scanner;

public class Q7 {

    // 오른쪽처럼 기수 변환 과정을 자세히 나타내는 프로그램을 작성하세요

    static void solution(){
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int c = 0;
        StringBuilder result = new StringBuilder();
        String dChar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        System.out.println("10진수를 기수 변환합니다.");

        do{
            System.out.print("변환하는 음이 아닌 정수 : ");
            n = sc.nextInt();
        }while(n < 0);

        do{
            System.out.print("어떤 진수로 변환할까요?(2-36) : ");
            c = sc.nextInt();
        }while(!(c >= 2 && c <= 36));

        System.out.println(c + " |       " + n);
        System.out.println("  +---------");
        do{
            String divNum = (n / c) >= 10 ? "" + (n / c) : " " + (n / c);
            int rest = n % c;
            if((n / c) != 0){
                System.out.println(c + " |       " + divNum + "  ... " + rest);
            }else{
                System.out.println("          " + divNum + "  ... " + rest);
            }
            n /= c;
            if(n != 0){
                System.out.println("  +---------");
            }
            result.append(dChar.charAt(rest));

        }while(n > 0);

        System.out.println(String.format("%d진수로 %s입니다.", c, result.toString()));


    }
}
