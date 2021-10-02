package com.LeaningFocus.ObjectFocusPrivate;/*
 * @author : Felicity
 * @date : 1:47 PM 10/2/2021
 */

public class PrivateExtend {
    public static void main(String[] args) {
        Person one = new Person();
        //one.age;
        one.name="赵丽颖";
        one.setAge(26);
        System.out.println("改学生的名字是"+one.name);
        //System.out.println("改学生的年龄是"+one.age);
        //one.getAge();
        System.out.println(one.getAge());

    }
}
class Person{
    private int age;
    String name;

    public void setAge(int age) {
        if (age <= 100 && age >= 10) {
            this.age = age;
            //System.out.println(age);
        }
        else{
            System.out.println("你输入的数不合理");
        }
    }

    public int getAge() {
        System.out.print("改学生的年龄是");
        return age;
    }


}

