package com.ksb.algorithm.chap02;

public class Q4 {

    // 배열 b의 모든 요소를 배열 a에 복사하는 메서드 copy를 작성하세요

    static void solution(){
        int[] a = new int[5];
        int[] b = {1,2,3,4,5};
        copy(a,b);
        printArr(a);
    }


    static void copy(int[] a, int[] b){
        for(int i = 0; i < a.length; i++){
            a[i] = b[i];
        }
    }

    static void printArr(int[] arr){
        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
