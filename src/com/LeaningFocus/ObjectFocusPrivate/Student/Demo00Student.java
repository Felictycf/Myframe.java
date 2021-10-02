package com.LeaningFocus.ObjectFocusPrivate.Student;/*
 * @author : Felicity
 * @date : 9:29 PM 10/2/2021
 */

public class Demo00Student {
    public static void main(String[] args) {
        Student one =new Student();
        Student two = new Student("Felicity",200);//这样可以直接放进来，但是需要用getter方法拿出去
        System.out.println(two);
        System.out.println(two.getAge());
        System.out.println(two.getName());
        two.setAge(18);//这个set可以在进行一次设置
        two.setName("SB");
        System.out.println(two.getName());
        System.out.println(two.getAge());


    }

}
