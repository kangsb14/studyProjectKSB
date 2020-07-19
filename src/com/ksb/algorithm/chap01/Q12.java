package com.ksb.algorithm.chap01;

public class Q12 {

    // 오른쪽과 같이 위쪽과 왼쪽에 곱하는 수가 있는 곱셈표를 출력하는 프로그램을 작성
    // 구분선은 수직선 기호(|), 마이너스 기호(-), 플러스 기호(+)를 사용
    // 논리연산, 다중루프

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
                int product = i * j;
                sb.append(product + " ");
                if(product / 10 == 0){
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}
