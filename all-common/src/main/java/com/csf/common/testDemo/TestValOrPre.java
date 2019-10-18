package com.csf.common.testDemo;

import lombok.Setter;

import java.util.Arrays;
import java.util.List;

/**
 * @author orangeC
 * @date 2019/10/17 14:06
 * @desc
 */
public class TestValOrPre {

    public static void main(String[] args) {

        TestValOrPre testValOrPre = new TestValOrPre();
//        int value = 10;
//        testValOrPre.test(value);
        String value = "hehei";
        /* testValOrPre.test1(value);*/
        User user = new User();
        user.setId(11);
        user.setName("charles");
        testValOrPre.test1(value);
        System.out.println("value 1:" + user.toString());
    }

    public void test(int value){
        value = 20;
        System.out.println("value int2:" + value);
    }

    public void test1(String value){

        /*value = "haha";
        System.out.println("value str2:" + value);*/
        String[] players = {"zhansgan", "lisi", "wangwu", "zhaoliu",  "wangmazi"};
        Arrays.sort(players, (String s1, String s2) -> (s1.length() - s2.length()));
        System.out.println(players);

    }

    public void test2(User user){
        user = new User();
        user.setName("orangeC");
        System.out.println(user.toString());
    }
}

@Setter
class User{
    private int id;
    private String name;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}