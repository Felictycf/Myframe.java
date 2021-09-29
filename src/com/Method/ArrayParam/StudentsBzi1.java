package com.Method.ArrayParam;
public class StudentsBzi1 {
    /**
     * 求平均分
     */
    public double calAvg(int[] scores){
        int sum=0;//总成绩
        double avg=0.0;//平均分
        for(int i=0;i<scores.length;i++){//遍历数组，累计总成绩
            sum+=scores[i];
        }
        avg=(double)sum/scores.length;//平均成绩=总成绩/数组长度
        return avg;

    }

    /**
     * 求最高分
     */
    public int calMax(int[] scores){
        int max=scores[0];//当前最高分
        for(int i=1;i<scores.length;i++){//遍历数组，找最大值
            if(max<scores[i]){//如果当前最大值<当前数，则赋值给最大值
                max=scores[i];
            }
        }
        return max;
    }
}
