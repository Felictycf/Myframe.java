package com.OnlieAssignment;

import jdk.swing.interop.SwingInterOpUtils;

public class Demo01PhoneOne {
    public static void main(String[]args){
        Phone one =new Phone();
        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);
        System.out.println("===================");

        one.brand="apple";
        one.color="黑色";
        one.price=19990.0;

        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);
        System.out.println("=====================");
        one.call("乔布斯");
        one.sedmessage();
    }
}
