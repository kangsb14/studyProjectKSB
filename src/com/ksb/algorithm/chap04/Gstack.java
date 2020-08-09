package com.ksb.algorithm.chap04;

public class Gstack<E> {

    private int max;    // 스택 용량
    private int ptr;    // 스택 포인터
    private E [] stk;   // 스택 본체

    public static class EmptyGStackException extends RuntimeException{
        public EmptyGStackException(){};
    }

    public static class OverFlowGStackException extends RuntimeException {
        public OverFlowGStackException() {};
    }

    public Gstack(int capacity){
        ptr = 0;
        max = capacity;
        try{
            stk = (E[]) new Object[max];
        }catch(OutOfMemoryError error){
            max = 0;
        }
    }

    public E push(E x) throws OverFlowGStackException{
        if(ptr >= max){
            throw new OverFlowGStackException();
        }
        return stk[ptr++];
    }

    public E pop() throws EmptyGStackException{
        if(ptr <= 0)
            throw new EmptyGStackException();
        return stk[ptr - 1];
    }

    public E peek() throws EmptyGStackException{
        if(ptr <= 0)
            throw new EmptyGStackException();
        return stk[ptr - 1];
    }

    public int idexOf(E x){
        for(int i = ptr - 1; i >= 0; i--)
            if(stk[i].equals(x))
                return i;
        return -1;
    }

    public void clear(){
        ptr = 0;
    }

    public int capacity(){
        return max;
    }

    public int size(){
        return ptr;
    }

    public boolean isEmpty(){
        return ptr <= 0;
    }

    public boolean isFull(){
        return ptr >= max;
    }

    public void dump(){
        if(ptr <= 0){
            System.out.println("스택이 비었습니다.");
        }else{
            for(int i = 0; i < ptr; i++){
                System.out.println(stk[i] + " ");
            }
            System.out.println();
        }

    }

}
