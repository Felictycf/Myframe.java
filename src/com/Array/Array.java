package com.Array;

public class Array {
    public static void main (String[]args){
        int array[] ={1,5,6,89,0,};
        int max=array[0];
        for (int i= 0;i< array.length;i++){
            if (array[i]>max)
            max = array[i];
        }
        System.out.println(max);
    }
}
