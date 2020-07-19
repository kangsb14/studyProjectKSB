package com.ksb.algorithm.chap01;

public class Q3 {

    // 네 값의 최솟값을 구하는 min4 메서드를 작성하세요

    static int min4(int a, int b, int c, int d){
        int min = a;

        if(min > b){
            min = b;
        }
        if(min > c){
            min = c;
        }
        if(min > d){
            min = d;
        }

        return min;
    }


}
