package com.OnlieAssignment;

public class Demo02Phonetwo {
    public static void main(String[]args){
        Phone two =new Phone();
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
        two.sedmessage();
    }
}
