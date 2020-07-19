package com.ksb.algorithm.chap01;

import java.util.Scanner;

public class Q11 {

    // 양의 정수를 입력하고 자릿수를 출력하는 프로그램을 작성하세요. 예를 들어 135를 입력하면
    // '그 숫자는 3자리입니다.' 라고 출력하고 1314를 입력하면 '그 수는 4자리입니다.'라고 출력하면 됩니다.
    // do~while

    public void solution(){


        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("n의 값 : ");
            n = sc.nextInt();
            if(n < 0){
                System.out.println("양수를 입력하세요");
            }
        }while(n < 0);

        //length()를 쓰지않고 하기.
        int cnt = 0;
        int tmp;
        boolean chk = false;
        do {
            tmp = n / 10;
            cnt++;
            n = tmp;
        }while(n > 0);

        System.out.println("그 수는 " + cnt + "자리입니다.");

    }


}
