package com.ksb.algorithm.chap01;

public class Q15 {

    // 직각 이등변삼각형을 출력하는 부분을 아래와 같은 형식의 메서드로 작성하세요
    // static void triangleLB(int n)  왼쪽 아래가 직각인 이등변 삼각형 출력
    // 또
    // static void triangleLU(int n)
    // static void triangleRU(int n)
    // static void triangleRB(int n)

    static void triangleLB(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangleLU(int n){
        for(int i = n; i > 0; i--){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangleRU(int n){
        for(int i = n; i > 0; i--){
            for(int k = 0; k < (n-i); k++){
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangleRB(int n){
        for(int i = 1; i <= n; i++){
            for(int k = n; k > i; k--){
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
