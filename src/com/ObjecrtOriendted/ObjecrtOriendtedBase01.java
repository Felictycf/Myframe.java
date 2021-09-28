package com.ObjecrtOriendted;

import java.util.Arrays;

public class ObjecrtOriendtedBase01 {
    public static void main (String[]args){
       int[] array ={1,2,3,4,5,6,7};
        for (int i = 0; i < array.length; i++) {

            if(i==array.length-1)//是==注意细节
            {
                System.out.println(array[i]+",");
            }
            else{
                System.out.print(array[i]+",");
            }
        }
        System.out.println(Arrays.toString(array));//使用面向对象
                                                    //找到JDK给我们提供好的一个Arrays 类
                                                    //里面有个toString方法，直接把数组变成想要的格式符
    }
}
