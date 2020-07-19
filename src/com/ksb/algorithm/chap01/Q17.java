package com.ksb.algorithm.chap01;

public class Q17 {

    // n단의 숫자 피라미드 출력

    static void npira(int n){

        for(int i = 1; i <= n; i++){

            for(int k = n; k > i; k--){
                System.out.print(" ");
            }
            for(int j = 0; j < (i - 1) * 2 + 1; j++){
                System.out.print(i);
            }

            System.out.println();
        }

    }

}
