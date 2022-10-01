package org.example.counter;

public class RaceConditionDemo {
    public static void main(String[] args) {

        // 멀티 태스킹 환경에서 하나의 객체(싱글톤) 를 설계하면 안된다.
        // 즉. 상태유지를 싱글톤으로 관리하지 말자.
        // 동기화를 시켜주어야 한다.
        Counter counter = new Counter();
        Thread t1 = new Thread(counter, "Thread-1");
        Thread t2 = new Thread(counter, "Thread-2");
        Thread t3 = new Thread(counter, "Thread-3");

        t1.start();
        t2.start();
        t3.start();
    }
}
