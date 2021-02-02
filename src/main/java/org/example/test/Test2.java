package org.example.test;

public class Test2 {
    public static void main(String[] args) {
        Thread a= new Thread(new TestThread("thread1"));
        Thread b= new Thread(new TestThread("thread2"));
        Thread c= new Thread(new TestThread("thread3"));
        Thread d= new Thread(new TestThread("thread4"));
        Thread e= new Thread(new TestThread("thread5"));

        
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
    }
}
