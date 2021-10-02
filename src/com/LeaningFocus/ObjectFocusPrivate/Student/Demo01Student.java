package com.LeaningFocus.ObjectFocusPrivate.Student;/*
 * @author : Felicity
 * @date : 10:06 PM 10/2/2021
 */

public class Demo01Student {
    public static void main(String[] args) {
        Student01 sb=new Student01();
        sb.setAge(18);
        sb.setName("Felicity");
        System.out.println("这个人:"+" "+sb.getAge()+"岁");
        System.out.println("这个学生叫:"+" "+sb.getName());
        sb.setMale(true);
        System.out.println("这个学生个男生吗？"+" "+sb.isMale());


    }

}
