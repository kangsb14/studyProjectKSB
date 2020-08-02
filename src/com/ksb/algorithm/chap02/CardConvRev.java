package com.ksb.algorithm.chap02;


// 입력받은 10진수를 2진수 ~ 36진수로 기수변환하여 나타냄
public class CardConvRev {
    // 정숫값 x를 r진수로 변환하여 배열 d에 아랫자리부터 넣어두고 자릿수를 반환합니다.
    static int cardConvR(int x, int r, char[] d){
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do{
            d[digits++] = dchar.charAt(x % r);
            x /= r;
        }while(x != 0);
        return digits;
    }


}
