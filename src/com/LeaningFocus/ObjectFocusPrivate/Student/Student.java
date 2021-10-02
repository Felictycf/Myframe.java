package com.LeaningFocus.ObjectFocusPrivate.Student;/*
 * @author : Felicity
 * @date : 2:24 PM 10/2/2021
 */

public class Student {
    private int age ;
    private String name;
    public Student(){  //无参构造方法
        System.out.println("无参方法执行了");
    }
    public Student(String name ,int age){ //有参构造方法
        this.name =name;
        this.age=age;
        System.out.println("有参方法执行了");

    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
