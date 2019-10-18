package com.csf.common.testDemo;

import lombok.Data;

/**
 * @author orangeC
 * @date 2019/10/18 10:13
 * @desc
 */
public class Human implements HumanInterface{

    private int age = 19;
    public String name = "haha";

    public void introduce(int age,String name){
        System.out.println("my name is " + name + " age " + age);
    }
}

class Female extends Human{
    private int age = 31;
    public String name = "orangeC";
    @Override
    public void introduce(int age, String name) {
        super.introduce(age,name);
        System.out.println("my name is " + name + " age " + age + " i am a female");
    }
}

class Man extends Human{
    private int age = 28;
    public String name = "charles";
    @Override
    public void introduce(int age, String name) {
        System.out.println("my name is " + name + " age " + age + " i am a man");
    }
}

class Test1{
    public static void main(String[] args) {
        /*Human human = new Female();
        Human human1 = new Man();
        human.introduce(19,"haha");
        human1.introduce(28,"heiehi");
        System.out.println(human.name);
        System.out.println(human1.name);*/
        Human human2 = new Human();
        human2.defaultMethod1();
    }
}