package com.ksb.algorithm.chap03;

import java.util.Scanner;

public class Q4 {

    // 오른쪽처럼 이진 검색의 과정을 자세히 출력하는 프로그램을 작성하세요
    // 각 행의 맨 왼쪽에 현재 검색하고 있는 요소의 인덱스를 출력하고,
    // 검색 범위의 맨 앞 요소에 <-, 맨 끝 요소에 ->, 현재 검색하고 있는
    // 중앙요소 위에 +를 출력하도록 하세요.

    static int binSearch(int[] x, int searchVal){
        int rtnIdx = -1;

        int pl = 0;
        int pr = x.length - 1;

        do {
            int pc = (pr + pl) / 2;

            System.out.print("  |");
            for(int i = 0; i <= pr; i++){
                if(i == pl){
                    System.out.print("  <- ");
                }else if(i == pc){
                    System.out.print("+");
                }else if(i == pr){
                    System.out.println(" ->");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.print(pc + " | ");
            for(int i = 0; i < x.length; i++){
                System.out.print(" " + x[i] + " ");
            }
            System.out.println();

            if(x[pc] == searchVal)
                return pc;
            else if(x[pc] < searchVal)
                pl = pc + 1;
            else
                pr = pc - 1;


        }while(pl <= pr);

//        for(int i = 0; i <= order; i++){
//            if(i == order){
//                System.out.print("  * ");
//                if(searchVal == x[order]){
//                    rtnIdx = order;
//                }
//            }else{
//                System.out.print("   ");
//            }
//        }
//        System.out.print("\n" + order + " | ");
//        for(int i = 0; i < x.length; i++){
//            System.out.print(" " + x[i] + " ");
//        }
//        System.out.println();

        return rtnIdx;
    }

    public static void main(String[] args) {
        int result = 0;

//        System.out.println("요솟 수 : ");
        Scanner stdIn = new Scanner(System.in);
//        int num = stdIn.nextInt();

//        int[] x = new int[num];
//        for(int i = 0; i < num; i++){
//            System.out.print("x[" + i + "] : ");
//            x[i] = stdIn.nextInt();
//        }

        int[] binArr = {1,2,3,5,6,8,9};

        System.out.println("찾는 값 : ");
        int searchVal = stdIn.nextInt();

        System.out.print("  |");
        for(int i = 0; i < binArr.length; i++){
            System.out.print("  " + i);
        }
        System.out.println("\n--+----------------------");

        for(int i = 0; i < binArr.length; i++){
            result = binSearch(binArr, searchVal);
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
