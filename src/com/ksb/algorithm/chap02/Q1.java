package com.ksb.algorithm.chap02;

import java.util.Random;
import java.util.Scanner;

public class Q1 {

    // 키 뿐만 아니라 사람 수도 난수로 생성하도록 프로그램을 작성하세요

    static int maxOf(int[] a){
        int max = a[0];
        for(int i = 1; i < a.length; i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        return max;
    }

    static void solution(){
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("키의 최대값을 구합니다.");
        System.out.print("사람 수 : ");
//        int num = sc.nextInt();
        int num = rand.nextInt(10);

        int[] height = new int[num];

        System.out.println("키 값은 아래와 같습니다.");
        for(int i = 0; i < num; i++){
          height[i] = 100 + rand.nextInt(90);
            System.out.println("height[" + i + "] : " + height[i]);
        }

        System.out.println("최댓값은 " + maxOf(height) + "입니다.");

    }


}
