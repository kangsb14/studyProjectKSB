package com.ksb.algorithm.chap02;

public class Q2 {

    // 오른쪽처럼 배열 요소를 역순으로 정렬하는 과정을 하나하나 나타내는 프로그램을 작성하세요

    //int[] arr = {5, 10, 73, 2, -5, 42};

    public static void solution(int[] arr){

        for(int i = 0; i < arr.length / 2; i++){
            printArr(arr);
            System.out.println("a[" + i + "]과(와) a[" + i + "]를 교환합니다.");
            swap(arr, i, arr.length - 1 - i);
        }

        printArr(arr);
        System.out.println("역순 정렬을 마쳤습니다.");
    }

    public static void swap(int[] arr, int idx1, int idx2){
        int tmp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = tmp;
    }

    public static void printArr(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
