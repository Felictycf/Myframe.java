package com.ClassNote;

public class CLA2 {

        public  static void main(String[]args){
        CLA1.Auto sb =new CLA1.Auto();
        sb.length=1000;
        sb.height=1500;
        sb.power=5000;
        sb.spend=200;
        sb.width=2000;
        System.out.println("这个车的速度是多少"+sb.length);
        System.out.println("这个车的功率是多少"+sb.width);
        System.out.println("这个车的长度是多少"+sb.length);
        System.out.println("这个车的高度为"+sb.spend);
        System.out.println("这个车的高度为"+sb.height);
        //运用class中的方法体


    }
        static class Auto{
            int length;
            int width;
            int height;
            int spend;
            int power;//初始化变量

            void fangfa1()
            {
                length=1000;
                width=2000;
                height =1500;
                spend=200;
                power=50000;//给变量赋值
            }

        }
    }



