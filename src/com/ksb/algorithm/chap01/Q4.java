package com.ksb.algorithm.chap01;

public class Q4 {

    // 세 값의 대소관계 13종류의 모든 조합에 대해 중앙값을 구하여 출력하는 프로그램을 작성하세요

    static int median(int a, int b, int c){
        if(a >= b){
            if(b >= c){
                return b;
            }else if(a <= c){
                return a;
            }else{
                return c;
            }
        }else if(a > c){
            return a;
        }else if(b > c){
            return c;
        }else{
            return b;
        }

    }
}
