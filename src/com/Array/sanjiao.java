package com.Array;

public class sanjiao {
    public static void main(String[]args){
        /*
         * 1
         * 11
         * 121
         * 1331
         * 14641*/
        int array[][]=new int [10][];
        for (int i = 0; i < array.length; i++) {
            array[i]=new int[i+1];//遍历一维数组
            for (int j = 0; j < array[i].length; j++) {
                if(j== 0 || j==i)
                {
                    array[i][j]=1;
                }
                else
                {
                    array[i][j]=array[i-1][j]+array[i-1][j-1];
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

