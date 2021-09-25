package com.Array;

public class sanjiao {
    public static void main(String[] args) {
        int array[][] = new int[10][];
        for (int i = 0; i < array.length; i++) {//遍历每个数组中的元素
            /*  这里不能再加int array[i]因为已经被定义了*/
            array[i] = new int[i + 1];//i+1是因为i<array.length
            for (int j = 0; j < array[i].length; j++) { //这里用for循环打出每个一维数组的下标，好进行赋值
                if (j==0 || j==array.length-1){
                    array[i][j] = 1;
                }else{
                    array[i][j]=array[i-1][j] + array[i-1][j-1];
                }
            }

        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]+"\t");
            }

        }
    }
}

