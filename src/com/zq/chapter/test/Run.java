package com.zq.chapter.test;

/**
 * @author ZQ
 * @version V1.0
 * @date 2018-11-26 11:00
 */
public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("运行结束！");
    }
}
