package com.ksb.algorithm.chap03;

import java.util.Scanner;

public class Q2 {

    // 오른쪽처럼 선형 검색의 스캐니 과정을 상세하게 출력하는 프로그램을 작성하세요
    // 이 때 각 행의 맨 왼쪽에 현재 검색하는 요소의 인덱스를 출력하고
    // 현재 검색하고 있는 요소 위에 별표 기호 *를 출력하세요.

    static int linearSearch(int[] x, int order, int searchVal){
        int rtnIdx = -1;
        System.out.print("  |");
        for(int i = 0; i <= order; i++){
            if(i == order){
                System.out.print("  * ");
                if(searchVal == x[order]){
                    rtnIdx = order;
                }
            }else{
                System.out.print("   ");
            }
        }
        System.out.print("\n" + order + " | ");
        for(int i = 0; i < x.length; i++){
            System.out.print(" " + x[i] + " ");
        }
        System.out.println();

        return rtnIdx;
    }

    public static void main(String[] args) {

        int result = 0;

        System.out.println("요솟 수 : ");
        Scanner stdIn = new Scanner(System.in);
        int num = stdIn.nextInt();

        int[] x = new int[num];
        for(int i = 0; i < num; i++){
            System.out.print("x[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }

        System.out.println("찾는 값 : ");
        int searchVal = stdIn.nextInt();

        System.out.print("  |");
        for(int i = 0; i < num; i++){
            System.out.print("  " + i);
        }
        System.out.println("\n--+----------------------");

        for(int i = 0; i < num; i++){
            result = linearSearch(x, i, searchVal);
            if(result > 0){
                System.out.println(searchVal + "은 x[" + i + "]에 있습니다.");
                break;
            }
            else{
                System.out.println("  |");
            }

        }

    }

}
