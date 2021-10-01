package com.Classroom;

public class Student {
    public static void main (String[]args) {
        Student01 stu = new Student01();

        stu.name = "Felicity";
        stu.StuNO = "01";
        stu.age = 18;
        System.out.println("学生学号:" + "\t"+stu.StuNO);
        System.out.println("学生名字:"+"\t"+stu.name);
        System.out.println("学生年龄:"+"\t"+stu.age);
        stu.good("nice" );
        System.out.println(stu.good("nice"));


    }
}

    class A{
        String s;
        void s1(){
            System.out.println("Java!");
        }
    }
      class Student01 {
        String StuNO;
        String name;
        int age;

        void nice(int a)
        {
            age+=a;
        }
        String good (String No)
        {
            StuNO =No;
                return StuNO;
        }

    }

