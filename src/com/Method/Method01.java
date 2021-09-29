package com.Method;
/*
* 1,单独调用格式：
* 方法名称（参数）
* 2，打印调用格式：
* System.out.println(方法名称（参数）)
* 3，赋值调用
* 数据类型 类名 = 方法名（参数） */

public class Method01 {
    public static void main(String[]args) {
         /*单独调用*/
        //sum(1,2)里面的result
        int c = sum(1,2);//  3    里面的result没有被调用，但是返回的result已经等于a+b
        /*打印调用*/
        System.out.println(c);  //3
        System.out.println("====================");
        System.out.println(sum(10,20)); //a=10，b=20 是实参，
        //System.out.println(result);这样不行是因为result是属于sum方法体中的
        /*赋值*/
        int num =sum(10,252);
        System.out.println(num);
    }
    public  static  int sum(int a,int b){//int a，int b是形参
        int result =a+b;
        System.out.println("方法被调用啦");
        System.out.println(result);//30
        //没有打印调用result当中的数据，但是数据在result中
        return result;/*谁在调用改方法则返回值就到被调用出去*/
        //这里返回到了sum（a，b）中 在 第14，16行等等

        /*result是形参 只能在方法体内使用*/

    }
}
