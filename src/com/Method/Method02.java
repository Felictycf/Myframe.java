package com.Method;

public class Method02 {
    public static void main(String[] args) {
        Method02 niubi =new Method02();
        niubi.kkk(1,2);
        System.out.println("改方法的返回值是"+niubi.kkk(2,3));
        niubi01(1,3);
        //没有返回值的方法，只能单独调用，因为返回给niubi01是空的值，相当于void
        //int jjj =niubi01(1,2,);//niubi01中的值为0，因为没有放回在
        //女朋友帮我买了东西，但是没有返回给我，我就是个空的


    }
        public  int kkk ( int a, int b){
            int result = a + b;
            return result;

        }

    public static void niubi01 (int a ,int b) {
        int result =a+b;
        System.out.println("结果是"+result);



    }


}
