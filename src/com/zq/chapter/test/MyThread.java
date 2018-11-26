package com.zq.chapter.test;

/**
 * @author ZQ
 * @version V1.0
 * @date 2018-11-26 10:58
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("MyThread");
    }
}
