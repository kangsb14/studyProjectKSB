package com.ksb.algorithm.chap03;

public class Q6 {

    // 실습 3-5를 수정하여 검색에 실패하면 삽입 포인트의 값을 출력하는 프로그램을 작성하세요

    static int binSearchX(int[] a, int n, int key){
        int rtnIdx = -1;

        int pl = 0;
        int pr = a.length - 1;
        int pc;

        do{
            pc = (pl + pr) / 2;
            if(a[pc] == key){

                boolean chk = false;
                while(!chk){
                    if(a[pc - 1] == key)
                        pc--;
                    else{
                        chk = true;
                        rtnIdx = pc;
                        return rtnIdx;
                    }
                }

            }else if(a[pc] < key)
                pl = pc + 1;
            else
                pr = pc - 1;

        }while(pl <= pr);

        if(rtnIdx == -1){
            rtnIdx = -(pc + 1);
        }

        return rtnIdx;
    }

    public static void main(String[] args) {
        int[] a = {1,3,5,7,7,7,7,8,8,9,9};

        System.out.println("result : " + binSearchX(a,11,2));
    }
}
