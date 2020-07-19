package com.ksb.algorithm.chap01;

import java.util.Scanner;

public class Q8 {

    // 1부터 10까지의 합은 (1 + 10)*5같은 방법으로 구할수 있습니다.
    // 가우스의 덧셈방법을 이용해서 1부터 n까지의 정수의 합을 구하는 프로그램을 작성하세요

    public void solution(){

        Scanner scanner = new Scanner(System.in);


        boolean chk = false;
        int n = 0;

        System.out.println("가우스 덧셈방식을 이용한 합 구하기");
        while(!chk) {

            System.out.print("n의 값 : ");
            n = scanner.nextInt();
            if(n < 0){
                System.out.println("양의 정수를 입력하세요.");
            }else{
                chk = true;
            }

        }

        int result = 0;
        int cnt = 0;
        if(n % 2 == 0){ // 짝수의 경우
            cnt = n / 2;
            result = (1 + n) * cnt;

        }else{  // 홀수의 경우
            cnt = (n - 1) / 2;
            result = ((1 + (n - 1)) * cnt) + n;

        }

        System.out.println("1부터 " + n + "까지의 합은 " + result + "입니다.");
    }

}
