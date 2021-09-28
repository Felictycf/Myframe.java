package com.LeaningFocus;

public class ObjectFocusClass {
    //通常情况下，一个类并不能直接使用，需要根据类创建一个对象，才能使用，使用【ObjectFocus】
/*
* import 包名称.类名；
* 例如：improt com.LeaningFouce.ObjectFocus;
* 当属于一个包的时候可以不写，省略*/
//1.创建，格式；
// 类名称 对象名 = new 类名称（）；
// Student stu = new Student();
// 2.使用，分为两种情况：
// 使用成员方法：对象名.成员方法名（参数）
    //（也就是说，想用谁，就点谁）
    public static void main(String[]args){
        ObjectFocus nice =new ObjectFocus();
    //3.使用其中的成员变量，格式：    //类名称 对象名 = new 类名称（）；
        System.out.println(nice.age);// null
        System.out.println(nice.name);// 0
        //改变对象当中成员变量，格式：
        //将右侧的字符串，赋值交给nice对象中的name变量
        nice.name="赵丽颖";
        //4.使用对象的成员方法，格式；
        //对象名，成员方法名（）



    }
}
