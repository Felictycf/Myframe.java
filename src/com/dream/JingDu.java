package com.dream;

public class JingDu {
    public  static void main (String[]args){
        //动态赋值
        int[][] data2 = new int[3][2];
        for (int i = 0; i < data2.length; i++) {
            for (int j = 0; j < data2[i].length; j++) {
                data2[i][j] = i * j;
                System.out.println(data2[i][j]);
            }
        }


    }

}
