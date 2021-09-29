package com.OnlieAssignment;

public class Demo04Phonefour {
    public static void main(String[] args) {
        Phone one =new Phone();
        one.price=10000;
        one.brand="小米";
        one.color="绿色";
        System.out.println(one.color);
        System.out.println(one.price);
        System.out.println(one.brand);
        method(one);//对象类型作为参数传递进去，传递进去的就是地址值
        //可以直接调用method方法
    }

    public static void method(Phone param){//param 参数
                          //（类名  对象名)  Phone param 接受到one 对象的地址值 ，在使用时可以通过地址值索引到位置，使用其中的方法和变量
                            //one 对象只是把地址值传给Phone param ，Phone param访问的的时候可以使用地址值的内容，将one对象传给Phpne param
        System.out.println(param.brand);
        System.out.println(param.price);//这里面的brand price color 都是由于one对象作为参数，给方法method，之后调用param这个对象
        System.out.println(param.color);
    }
}
