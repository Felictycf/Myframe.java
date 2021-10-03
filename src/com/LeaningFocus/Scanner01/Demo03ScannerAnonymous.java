package com.LeaningFocus.Scanner01;/*
 * @author : Felicity
 * @date : 7:48 PM 10/3/2021
 */

import java.util.Scanner;

public class Demo03ScannerAnonymous {
    public static void main(String[] args) {
        //普通使用方法
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        System.out.println(sc.nextInt());
        //这是匿名方法，只能使用一次
        int num = sc.nextInt();//创建 int num来接受scanner
        int num01 = new Scanner(System.in).nextInt();//之后需要加入.nexInt().来获取一个数，
        System.out.println("输入第二个数字");
        //一般方法写入参数
        Scanner sc1 =new Scanner(System.in);
        methodParam(sc1);
        //使用匿名方法
        methodParam(new Scanner(System.in));
        // 使用普通方法;
    }


        public static    void methodParam(Scanner sc1 ){
        int num03 =sc1.nextInt();
            System.out.println(num03);


        }
        public static int methodReturn(){

            return 0;
        }






}
