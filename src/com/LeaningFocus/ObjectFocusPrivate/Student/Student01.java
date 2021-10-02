package com.LeaningFocus.ObjectFocusPrivate.Student;/*
 * @author : Felicity
 * @date : 9:53 PM 10/2/2021
 */

//如果想要访问的变量是成员变量，则需要一个格式，用 this.成员变量  来访问成员变量

public class Student01 {
    private int age;
    private String name ;
    private boolean male;
    public void setMale(boolean male){
        this.male=male;
    }
      public boolean isMale(){
        return male;
      }
      public void setAge (int age){
        this.age=age;  //这代表成员变量中的age=参数的age
      }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
