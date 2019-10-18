package com.csf.common.testDemo;

/**
 * @author orangeC
 * @date 2019/10/18 14:34
 * @desc
 */
public interface HumanInterface {
    static void staticMethod1(){
        System.out.println("Interface1.staticMethod1()");
    }
    /**
     * 接口默认方法 , 用default关键字修饰 , 用实现类的对象调用
     * (不可用接口直接调用 , 默认方法实际上还是属于实现类的实现 , 只不过是接口为所有实现类提供的默认的实现内容)
     * 默认作用域为public(省略不写也是public) , 不可用protected  , private , 否则编译直接不通过
     */
    default void defaultMethod1(){
        System.out.println("Interface1.defaultMethod1()");
    }
    /**
     * 接口中可以存在多个默认方法
     */
    default void defaultMethod2(){
        System.out.println("Interface1.defaultMethod2()");
    }
}
