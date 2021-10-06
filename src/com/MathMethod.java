package com;/*
 * @author : Felicity
 * @date : 11:39 PM 10/5/2021
 */

//计算-10.8到5.9之间，绝对值大于6，或者小于2.1的整数有多少个
public class MathMethod {
    public static void main(String[] args) {
        int count=0;
        double Max=5.9;
        double Min =-10.3;
        for (int i = (int)Min; i < Max; i++) {
            int abs= Math.abs(i);//因为题目要求的是绝对值
            if(abs>6||abs<2)
            {
                System.out.println(abs);
                count++;
            }


        }
        System.out.println(count);

    }
}
