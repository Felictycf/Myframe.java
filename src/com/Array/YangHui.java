package com.Array;
/*
1
11    //1=1+0
121     //2=1+1
1331       //3=1+2
14641       //4=1+3  6=3+3  4=3+1
代码思路：先定义一个动态2维数组数组元素先遍历一遍，虽然全部是0值，
之后创造一个1维数组（二维的本质也就是一维）
有i行（array[i] = new int[i + 1]实现i行）
之后运用每行第一个数和最后一个数，定义1if (j==0 || j==array.length-1){array[i][j] = 1;}
其余的数用else  打印出我上面写的规律
之后用for循环打印出下标【i】【j】
但是我代码错了，数组越界，但是自己找不出来


*/


public class YangHui {
    public static void main(String[] args) {
        int array[][] = new int[10][];
        for (int i = 0; i < array.length; i++) {//遍历每个数组中的元素
            /*  这里不能再加int array[i]因为已经被定义了*/
            array[i] = new int[i + 1];//i+1是因为i<array.length
            for (int j = 0; j < array[i].length; j++) { //这里用for循环打出每个一维数组的下标，好进行赋值
                if (j==0 || j==array.length-1){
                    array[i][j] = 1;
                }
                else{
                    array[i][j]=array[i-1][j]+array[i-1][j-1];
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);
            }

        }
    }
}
