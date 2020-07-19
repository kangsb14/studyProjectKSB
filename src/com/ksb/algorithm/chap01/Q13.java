package com.ksb.algorithm.chap01;

public class Q13 {

    // 곱셈이 아니라 덧셈을 출력하는 프로그램을 작성하세요
    // Q12와 같이 표의 위쪽과 왼쪽에 더하는 수를 출력하세요

    public static void solution(){
        StringBuilder sb = new StringBuilder();
        sb.append("   | ");
        for(int i = 1; i <= 9; i++){
            sb.append(i + "  ");
        }
        sb.append("\n---+---------------------------\n");

        for(int i = 1; i <= 9; i++){
            sb.append(i + "  | ");
            for(int j = 1; j <= 9; j++){
                int sum = i + j;
                sb.append(sum + " ");
                if(sum / 10 == 0){
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}
