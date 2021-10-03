package com.LeaningFocus.Scanner01;/*
 * @author : Felicity
 * @date : 2:31 PM 10/3/2021
 */

import java.util.Scanner;

public class Demo02Scanner {
    public static void main(String[] args) {
        Scanner sum =new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int one =sum.nextInt();
        System.out.println("请输入第二个数字");
        int two =sum.nextInt();
        int sum01;
        sum01=one+two;
        System.out.println("用户输入的两个数的总和为"+sum01);
    }
}
