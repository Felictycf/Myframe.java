package com.OnlieAssignment;

public class Demo03Phonesame {
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

        Phone two =one;/*之后one方法在其中，打印的不是初始值而是one对象中的成员变量*/
        //shift+F6：标在所要改的字上（光标）之后点shift+F6可以将全部这个单词更改
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
        System.out.println("===================");

        two.brand="三星";
        two.color="蓝色";
        two.price=2380.0;



        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
        System.out.println("=====================");
        two.call("Felicity");

    }
}
