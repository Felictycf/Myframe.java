package com.Array;

public class ArrarReverse {
     public static void main (String[]args){
         int array[]={1,2,3,4,5,6};                 // array.length/2
         for (int min = 0, max = array.length-1;  min < max; min ++,max--) {
             int temp = array[min];
             array[min]=array[max];
             array[max]=temp;
             //11111
             //
             //22
         }
         for (int i = 0; i < array.length; i++) {
             System.out.println(array[i]);
         }


                 





     }
}
