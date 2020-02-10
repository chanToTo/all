package com.csf;

import javax.xml.transform.Source;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author orangeC
 * @description
 * @date 2019/10/22 22:21
 */
public class Test {
    private volatile String str = "";

    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int value = scanner.nextInt();
            for (int i = 2; i < value; i++) {
                if (isPrime(i)) {
                    System.out.println(i);
                }
            }
            if (value == 0) {
                break;
            }
        }

    }

    private static boolean isPrime(int n) {
        for (int i = 2; i < n - 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
