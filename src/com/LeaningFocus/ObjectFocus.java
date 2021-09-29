package com.LeaningFocus;
/*
* 定义一个类,用来模拟"学生"事务，其中就有两个组成部分
* ==========
* 属性（是什么），
*   姓名
* 年龄
* 行为（能做什么）
* 学习
* 睡觉
*
*=============
* 对应在java的类中：
* 成员变量（属性）：
* String name；
* int age 年龄
* 成员方法（行为）
*   public void eat(){}吃饭
*   public void sleep(){} 睡觉
*   public void study(){}
* */

//成员变量是直接定义在类当中的，在方法外面。
//以前的变量叫局部变量，现在的都写在一个方法内部，直接写在类里，叫做成员变量
public class ObjectFocus {
    String name;
    int age ;
    //访问修饰符 返回值类型 方法名(参数列表){
    //方法的主体
    public void eat(){
        System.out.println("吃饭饭");
    }
    public void sleep(){
        System.out.println("睡觉觉");
    }
    public void study(){
        System.out.println("学习");
    }
}
