package com.LeaningFocus.Scanner01;
import java.util.Scanner;
/*
 * @author : Felicity
 * @date : 2:08 PM 10/3/2021
 */

public class Demo01Scanner {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num =sc.nextInt();
        System.out.println("用户输入的密码是"+num);
        String name =sc.next();
        System.out.println("用户输入的姓名为"+name);

    }
}
