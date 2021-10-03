package com.LeaningFocus.Scanner01;/*
 * @author : Felicity
 * @date : 2:41 PM 10/3/2021
 */

import java.util.Scanner;

public class Demo01ScannerMax {
    public static void main(String[] args) {
        Scanner MAX = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int num01 = MAX.nextInt();
        System.out.println("请输入第二数字");
        int num02 = MAX.nextInt();
        System.out.println("请输入第三个数字");
        int num03 = MAX.nextInt();
        int temp =num01>num02?num01:num02;
        int max =num03>temp?num03:temp;
        System.out.println("这三个题目中最大值是："+max);
    }

}
