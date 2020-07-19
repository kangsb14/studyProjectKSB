package com.ksb.algorithm.chap01;

public class Q1 {

    // 네 값의 최댓값을 구하는 max4 메서드를 작성하세요

    static int max4(int a, int b, int c, int d){
        int max = a;

        if(b > max){
            max = b;
        }
        if(c > max){
            max = c;
        }
        if(d > max){
            max = d;
        }

        return max;
    }

}
