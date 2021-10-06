package com.Father;/*
 * @author : Felicity
 * @date : 12:42 AM 10/6/2021
 */

 class Fu {
    public void show(){
        System.out.println("显示号码");

    }
}
class Zi extends Fu{
    @Override
    public void show() {
        super.show();
        System.out.println("显示场景");
        System.out.println("显示头像");//利用这个方法对zi类得到方法进行一个更新，其中多了场景和头像，并且继承原有的显示号码
    }
}
public class Fua{
    public static void main(String[] args) {
        Zi ii = new Zi();
        ii.show();//如果方法进行了重写，使用子对象中的方法时，优先使用子类的方法，且该方法
        //与夫方法独立，需要用super.夫类，来继承改方法中的方法体
    }

}

