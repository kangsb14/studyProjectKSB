package com.ksb.algorithm.chap01;

public class Q16 {

    // n단의 피라미드를 출력하는 메서드를 작성하세요
    // static void spira(int n)

    static void spira(int n){
        for(int i = 1; i <= n; i++){
            int formula = (i - 1) * 2 + 1;

            for(int j = n; j > i; j--){
                System.out.print(" ");
            }
            for(int k = 1; k <= formula; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
