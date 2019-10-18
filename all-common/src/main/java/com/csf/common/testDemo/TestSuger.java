package com.csf.common.testDemo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author orangeC
 * @date 2019/10/17 20:48
 * @desc
 */
public class TestSuger extends MyBlockingQueue{

    public TestSuger(int size) {
        super(size);
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("001");
        list.add("002");
        for (String str : list) {
            System.out.println(str);
        }
    }
}
