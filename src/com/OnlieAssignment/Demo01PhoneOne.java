package com.OnlieAssignment;

import jdk.swing.interop.SwingInterOpUtils;

public class Demo01PhoneOne {
    public static void main(String[]args){
        Phone one =new Phone();
        int array[] ={1,2,3,4,5};
        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);
        System.out.println("===================");
        one.price=19990.0;

        one.brand="apple";
        one.color="黑色";

        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);
        System.out.println("=====================");
        one.call("乔布斯");
        System.out.println(one.avg(array));//使用对象中方法体中返回值，直接使用one.avf(array)，并不能使用其中的返回值，返回值需要打印调用
    }
}
