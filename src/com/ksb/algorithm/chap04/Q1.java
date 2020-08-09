package com.ksb.algorithm.chap04;

import java.util.Scanner;

class Q1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        IntQueue s = new IntQueue(64);	// 최대 64개를 인큐할 수 있는 큐

        while (true) {
            System.out.println("현재 데이터 수：" + s.size() + " / "
                    + s.capacity());
            System.out.print("(1)인큐　(2)디큐　(3)피크　" +
                    "(4)덤프　" +
                    "(5)검색 (6)비움 (7)정보표시" +
                    "(0)종료：");

            int menu = stdIn.nextInt();
            if (menu == 0) break;

            int x;
            switch (menu) {
                case 1: 							// 인큐
                    System.out.print("데이터：");
                    x = stdIn.nextInt();
                    try {
                        s.enque(x);
                    } catch (IntQueue.OverflowIntQueueException e) {
                        System.out.println("큐가 가득 찼습니다.");
                    }
                    break;

                case 2: 							// 디큐
                    try {
                        x = s.deque();
                        System.out.println("디큐한 데이터는 " + x + "입니다.");
                    } catch (IntQueue.EmptyIntQueueException e) {
                        System.out.println("큐가 비어 있습니다.");
                    }
                    break;

                case 3: 							// 피크
                    try {
                        x = s.peek();
                        System.out.println("피크한 데이터는 " + x + "입니다.");
                    } catch (IntQueue.EmptyIntQueueException e) {
                        System.out.println("큐가 비어 있습니다.");
                    }
                    break;

                case 4: 							// 덤프
                    s.dump();
                    break;


                case 5:
                    System.out.println("값을 입력하세요 : ");
                    x = stdIn.nextInt();
                    int n = s.indexOf(x);
                    if(n >= 0)
                        System.out.println("꼭대기부터 " + (s.size() - n) + "번째에 있습니다.");
                    else
                        System.out.println("해당 데이터가 없습니다.");
                    break;

                case 6:
                    s.clear();
                    break;

                case 7:
                    System.out.println("용량 : " + s.capacity());
                    System.out.println("데이터 수 : " + s.size());
                    System.out.println(s.isEmpty() ? "없음" : "있음");
                    System.out.println(s.isFull() ? "가득 참" : "공간 남음");
                    break;
            }
        }
    }
}
