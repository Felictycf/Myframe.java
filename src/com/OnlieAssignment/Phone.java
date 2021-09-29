package com.OnlieAssignment;


    /*
    定义一个类，用来模拟“是手机”事务
    属性：价格，品牌，颜色
    行为：打电话，发信息
    对应到类当中：
    成员变量（属性）：
    String color；  颜色
    double price ；  价格
    String brand ； 品牌

    成员方法（行为）：
    public void call （String who）{}打电话
    public void sendmessage（）{}  群发信息

     */
    public class Phone {
        String brand;
        double price;
        String color;
        public void call (String who){
            System.out.println("给"+who+"打电话");
        }
        public double avg
                (int[]scores){
            int sum=0;//总成绩
            double avg=0.0;//平均分
            for(int i=0;i<scores.length;i++){//遍历数组，累计总成绩
                sum+=scores[i];
            }
            avg=(double)sum/scores.length;//平均成绩=总成绩/数组长度
            System.out.println("未来的java开发工程师");
            return avg;

        }
    }
