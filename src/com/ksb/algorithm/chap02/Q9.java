package com.ksb.algorithm.chap02;

import java.util.Scanner;

public class Q9 {

    // y년 m월 d일의 그 해 남은 일수(12월 31일이면 0, 12월 30일이면 1)를 구하년
    // 아래 메서드를 작성하세요

    static int[][] mdays = {
            {31,28,31,30,31,30,31,31,30,31,30,31},
            {31,29,31,30,31,30,31,31,30,31,30,31}
    };

    static int isLleap(int year){
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
    }

    static int leftDayOfYear(int y, int m, int d){
        int totalDay = 0;
        for(int i = 0; i < m; i++){
            totalDay += mdays[isLleap(y)][i];
        }

        return totalDay - dayOfYear(y,m,d);
    }



    // 서기 y년 m월 d일의 그 해 경과 일 수를 구함.
    static int dayOfYear(int y, int m, int d){

        int result = 0;

        boolean chk = false;
        int tmp = 0;
        while(!chk){
            result += mdays[isLleap(y)][tmp];
            tmp++;
            if(tmp == m - 1)
                chk = true;
        }
        return result + d;
//        int days = d;
//
//        for(int i = 1; i < m; i++){
//            days += mdays[isLleap(y)][i - 1];
//        }
//        return days;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int retry;

        System.out.println("그 해 경과 일수를 구합니다.");
        do{
            System.out.print("년 : "); int year = stdIn.nextInt();
            System.out.print("월 : "); int month = stdIn.nextInt();
            System.out.print("일 : "); int day = stdIn.nextInt();

            System.out.printf("그 해 %d일째입니다.\n", dayOfYear(year, month, day));

            System.out.println("한번 더 할 까요?");
            retry = stdIn.nextInt();

        }while(retry == 1);

    }

}
