/*
冒泡序列
 */
package com.school;

import java.awt.desktop.SystemEventListener;

public class AssignmentP762 {
    public static void main(String[]args){
        int arr[]={25,24,12,76,101,96,28};//静态初始化
        for (int i = 0;i< arr.length-1;i++){
            for (int j=0;j< arr.length-1;j++){
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];//临时值给temp
                    arr[j] = arr[j+1];//之后将j+1的值与交换
                    arr[j+1 ]= temp;//在把j的值，也是temp的值赋值给j+1

                    }



                }
           System.out.println("第"+i+"执行之后的数据");
            for (int z=0;z< arr.length;z++){
                System.out.println(arr[z]+"");




            }
            System.out.println("");


        }

        for (int z=0;z< arr.length;z++){
            System.out.println(arr[z]+"");




        }
    }

}
