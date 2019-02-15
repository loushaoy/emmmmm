package day01;

/**
 * 使用递归计算猴子吃桃
 */

public class Recursion {
    public static void main (String [] args){
        System.out.println(getNumber(0));
    }

    public static int getNumber(int day){
        if (day>=10){
            System.out.println(day);
            return 1;
        }else {
            System.out.println(day);
            return (getNumber(day+1)+1)*2;
        }
    }
}
