package com.ksb.algorithm.chap03;

public class Q5 {

    //

    static int binSearchX(int[] a, int n, int key){
        int rtnIdx = -1;

        int pl = 0;
        int pr = a.length - 1;

        do{
            int pc = (pl + pr) / 2;
            if(a[pc] == key){

                boolean chk = false;
                while(!chk){
                    if(a[pc - 1] == key)
                        pc--;
                    else{
                        chk = true;
                        return pc;
                    }
                }

            }else if(a[pc] < key)
                pl = pc + 1;
            else
                pr = pc - 1;

        }while(pl <= pr);

        return rtnIdx;
    }

    public static void main(String[] args) {
        int[] a = {1,3,5,7,7,7,7,8,8,9,9};

        System.out.println("result : " + binSearchX(a,11,7));
    }

}
