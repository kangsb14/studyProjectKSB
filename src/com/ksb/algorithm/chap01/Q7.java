package com.ksb.algorithm.chap01;

import java.util.Scanner;

public class Q7 {

    // 실습 1-5 프로그램을 참고하여 n이 7이면 '1+2+3+4+5+6+7=28'로 출력하는
    // 프로그램 작성

    public void solution(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.println("n의 값 : ");
        int n = scanner.nextInt();

        int sum = 0;

        for(int i =1; i <= n; i++){
            sum += i;
        }

        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
    }

}
