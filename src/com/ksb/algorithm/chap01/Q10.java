package com.ksb.algorithm.chap01;

import java.util.Scanner;

public class Q10 {

    // 오른쪽과 같이 두 변수 a,b에 정수를 입력하고 b-a를 출력하는 프로그램을 작성하세요.
    // 단 변수 b에 입력한 값이 a 이하면 변수 b의 값을 다시 입력하세요
    // do~while

    public void solution(){

        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;

        System.out.println("a의 값 : ");
        a = sc.nextInt();

        do{
            System.out.println("b의 값 : ");
            b = sc.nextInt();
            if(a >= b){
                System.out.println("a보다 큰 값을 입력하세요!");
            }
        }while(!(a < b));

        System.out.println("b - a는 " + (b - a) + "입니다.");
    }

}
