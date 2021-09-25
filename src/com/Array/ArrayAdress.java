package com.Array;
/*
* 数组可以作为参数，通过小括号传递进去的是数组中的地址值*/

public class ArrayAdress {
    public static  void main (String[]args){
        int []array={1,2,3,4,5,6};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        PrintArray(array);//传递进去的就是array中的地址值
/*
定义一个方法三要素：
返回值类型：因为只需要打印，不需要计算也没有结果，所以用void
方法名：驼峰命名，PrintArray


* */
    }
    public static void PrintArray (int[]array){
        System.out.println("PrintArray方法收到的参数为");//array【】给予改方法地址值，可被调用
        for (int i = 0; i < array.length; i++) {
            System.out.println(array);//地址
            System.out.println(array[i]);
        }
    }
}
