package com.ksb.algorithm.chap03;

import java.lang.reflect.Array;

public class Q3 {

//    요솟수가 n인 배열 a에서 key와 일치하는 모든 요소의 인덱스를 배열 idx의 맨 앞부터
//    순서대로 저장하고, 일치한 요솟수를 반환하는 메서드를 작성하세요. 예를 들어 요솟수가
//    8인 배열 a의 요소가 {1,9,2,9,4,6,7,9}이고 key가 9면 배열 idx에
//    {1,3,7}을 저장하고 3을 반환합니다.

    static int searchIdx(int[] a, int n, int key, int[] idx){
        int rtnNum = 0;
        int tmp = 0;
        for(int i = 0; i < n; i++){
            if(a[i] == key){
                idx[tmp] = i;
                rtnNum++;
                tmp++;
            }
        }
        return rtnNum;
    }

    public static void main(String[] args) {
        int rtnVal = 0;
        int[] arr = {1,9,2,9,4,6,7,9};
        int[] idx;
        int arrNum = 8;
        int key = 9;

        int tmp = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                tmp++;
            }
        }
        idx = new int[tmp];

        rtnVal = searchIdx(arr, arrNum, key, idx);
        System.out.print("{");
        for(int i = 0; i < idx.length; i++){
            System.out.print(idx[i]);
            if(i != idx.length - 1){
                System.out.print(",");
            }
        }
        System.out.println("}");
        System.out.println("rtnVal : " + rtnVal);

    }

}
