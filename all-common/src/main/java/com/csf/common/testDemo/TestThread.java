package com.csf.common.testDemo;

import java.io.InputStreamReader;

/**
 * @author orangeC
 * @date 2019/10/16 14:43
 * @desc
 */
public class TestThread implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("开始");
            execute();
            System.out.println("结束");
        }
    }

    public synchronized void execute(){
        System.out.println("haha");
        try {
            // Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new TestThread());
        thread.start();
    }
}
