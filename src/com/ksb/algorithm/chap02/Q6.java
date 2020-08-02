package com.ksb.algorithm.chap02;

public class Q6 {

    // 배열이 앞쪽에 아랫자리가 아니라 윗자리를 넣어두는 메서드를 작성하세요
    static int cardConv(int x, int r, char[] d){
        int digits = d.length - 1;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do{
            d[digits--] = dchar.charAt(x % r);
            x /= r;
        }while(x != 0);
        return digits;
    }

}
