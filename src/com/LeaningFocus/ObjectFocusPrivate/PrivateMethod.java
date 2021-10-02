package com.LeaningFocus.ObjectFocusPrivate;/*
 * @author : Felicity
 * @date : 1:19 PM 10/2/2021
 */

public class PrivateMethod {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 666, 7777};
        getMethod(array);
        System.out.println("最大值="+getMethod(array));

       /* int array[]={1,2,3,4,666,7777};
        int MAX=array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]>array[0] ) {
                MAX=array[i];
            }*/

    }


    public static int getMethod(int array[]) {

        int MAX = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[0]) {
                MAX = array[i];

            }
        }
        return MAX;
    }
}
