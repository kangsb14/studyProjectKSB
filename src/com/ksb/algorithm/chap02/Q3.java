package com.ksb.algorithm.chap02;

public class Q3 {

    // 배열 a의 모든 요소의 합계를 구하여 반환하는 메서드를 작성하세요

    static int sumOf(int[] a){
        int sum = 0;
        for(int i = 0; i < a.length; i++){
            sum += a[i];
        }

        return sum;
    }

}
