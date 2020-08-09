package com.ksb.algorithm.chap04;

public class DoubleIntStack_Q3 {

    // 하나의 배열을 공유하여 2개의 스택을 구현하는 int형 데이터용 스택 클래스를 만드세요.
    // 스택에 저장하는 데이터는 int형 값으로 아래 그림처럼 배열의 처음과 끝을 사용하세요

    private int max;
    private int ptr_A;
    private int ptr_B;
    private int[] stk;

    public class EmptyIntStackException extends RuntimeException{
        public EmptyIntStackException(){};
    }

    public class OverflowIntStackException extends RuntimeException{
        public OverflowIntStackException(){};
    }

    public DoubleIntStack_Q3(int capacity){
        ptr_A = 0;
        ptr_B = capacity - 1;
        max = capacity;
        try{
            stk = new int[capacity];
        }catch (OutOfMemoryError error){
            max = 0;
        }
    }

    //스택에 x를 푸시
    public int push(String pStk, int x) throws OverflowIntStackException{
        if(ptr_A >= ptr_B + 1)
            throw new OverflowIntStackException();
        if(pStk.equals("A"))
            stk[ptr_A++] = x;
        else
            stk[ptr_B--] = x;
        return x;
    }

    public int pop(String pStk) throws EmptyIntStackException{
        if(pStk.equals("A")){
            if(ptr_A <= 0)
                throw new EmptyIntStackException();
            else
                return stk[--ptr_A];
        }else{
            if(ptr_B >= max - 1)
                throw new EmptyIntStackException();
            else
                return stk[++ptr_B];
        }
    }

    // peak
    public int peek(String pStk) throws EmptyIntStackException{
        if(pStk.equals("A")){
            if(ptr_A <= 0)
                throw new EmptyIntStackException();
            else
                return stk[ptr_A - 1];
        }else{
            if(ptr_B >= max - 1)
                throw new EmptyIntStackException();
            else
                return stk[ptr_B + 1];
        }
    }

    public int indexOf(String pStk, int x){
        if(pStk.equals("A")){
            for(int i = ptr_A - 1; ptr_A >= 0; i--){
                if(stk[i] == x)
                    return i;
            }
        }else{
            for(int i = ptr_B + 1; ptr_B < max; i++){
                if(stk[i] == x)
                    return i;
            }
        }
        return x;
    }

    //스택 비우기
    public void clear(String pStk){
        if(pStk.equals("A")){
            for(int i = 0; i < ptr_A -1; i++){
                stk[i] = 0;
            }
            ptr_A = 0;
        }else{
            for(int i = ptr_B + 1; i < max; i++){
                stk[i] = 0;
            }
            ptr_B = max - 1;
        }
    }

    public int capacity(){
        return max;
    }





}
