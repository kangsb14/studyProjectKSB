package com.ksb.algorithm.chap03;

import java.util.Scanner;

public class Q1 {

    // 실습 3-3의 seqSearchSen 메서드를 while문이 아니라 for문을 사용하여 수정한
    // 프로그램을 작성하세요

    static int seqSearchSen(int[] a, int n, int key){
        int i = 0;

        a[n] = key;

//        while(true){
//            if(a[i] == key){
//                break;
//            }
//            i++;
//        }

        for(; i < n; i++){
            if(a[i] == key)
                break;
        }

        return i == n ? -1 : i;
    }

    public static void main(String[] args) {

        Scanner stnIn = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = stnIn.nextInt();
        int[] x = new int[num + 1];

        for(int i = 0; i < num; i++){
            System.out.print("x[" + i + "] : ");
            x[i] = stnIn.nextInt();
        }

        System.out.print("검색할 값 : ");
        int ky = stnIn.nextInt();

        int idx = seqSearchSen(x, num, ky);

        if(idx == -1){
            System.out.println("그 값의 요소가 없습니다.");
        }else{
            System.out.println((ky + "은(는) x[" + idx + "]에 있습니다."));
        }

    }

}
