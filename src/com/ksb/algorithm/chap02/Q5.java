package com.ksb.algorithm.chap02;

public class Q5 {

    // 배열 b의 모든 요소를 배열 a에 역순으로 복사하는 메서드 rcopy를 작성하세요.
    static void solution(){
        int[] a = new int[5];
        int[] b = {1,2,3,4,5};
        rcopy(a, b);
        printArr(a);
    }


    static void rcopy(int[] a, int[] b){
        for(int i = 0 ; i < b.length; i++){
            a[b.length - 1 - i] = b[i];
        }
    }

    static void printArr(int[] arr){
        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
