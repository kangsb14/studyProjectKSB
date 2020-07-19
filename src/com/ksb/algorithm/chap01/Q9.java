package com.ksb.algorithm.chap01;

public class Q9 {

    // 정수 a,b를 포함하여 그 사이의 모든 정수의 합을 구하여 반환하는 아래 메서드를 작성하세요
    // static int sumof(int a, int b)

    static int sumof(int a, int b){
        int result = 0;

        int diff = Math.abs(a-b) + 1;
        int general = (a + b) / 2;

        result = general * diff;

        return result;
    }
}
