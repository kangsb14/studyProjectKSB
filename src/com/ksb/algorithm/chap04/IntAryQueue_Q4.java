package com.ksb.algorithm.chap04;

public class IntAryQueue_Q4 {

    // 큐를 구현하는 프로그램을 만드세요. 또 큐를 구현하는 클래스는
    // 아래 필드를 갖는 IntAryQueue형으로 하고 실습 4-3의 메서드에 대응하는 메서드를 모두 만드세요

    private int max;
    private int num;
    private int[] que;

    public class EmptyQueueException extends RuntimeException {
        public EmptyQueueException(){};
    }

    public class OverflowQueueException extends RuntimeException {
        public OverflowQueueException(){};
    }

    public IntAryQueue_Q4(int capacity) {
        max = capacity;
        num = 0;
        try{
            que = new int[capacity];
        }catch (OutOfMemoryError e){
            max = 0;
        }
    }

    //인큐
    public int enQue(int x) throws OverflowQueueException{
        if(num >= max)
            throw new OverflowQueueException();
        else
            que[num++] = x;
        return x;
    }

    public int deQue() throws EmptyQueueException{
        if(num <= 0)
            throw new EmptyQueueException();
        int x = que[0];
        for(int i = 0; i < num -1; i++){
            que[i] = que[i+1];
        }
        num--;
        return x;
    }



}
