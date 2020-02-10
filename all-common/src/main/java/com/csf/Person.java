package com.csf;

import lombok.Data;

/**
 * @author orangeC
 * @description
 * @date 2019/10/27 19:41
 */
@Data
public class Person implements Comparable<Person>{

    private int age;
    private String name;

    public Person(int age,String name){
        this.name = name;
        this.age = age;
    }
    @Override
    public int compareTo(Person o) {
        if( this.age < o.age ){
            return -1;
        } else {
            return this.name.compareTo(o.name);
        }
    }

    @Override
    public String toString() {
        return "person: " + this.name + " " + this.age;
    }
}
