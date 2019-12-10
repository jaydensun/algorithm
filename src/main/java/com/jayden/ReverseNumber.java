package com.jayden;

/**
 * 设N是一个四位数，它的9倍恰好是其反序数（例如：1234的反序数是4321）
 * 求N的值
 * @author 孙勇军（089245）
 * @since 2019/12/10
 */
public class ReverseNumber {
    public static void main(String[] args) {
        for (int i = 1009; i < 1111; i+=10) {
            int reverse = 0;
            int tempI = i;
            while (tempI > 0) {
                reverse = reverse * 10 + tempI % 10;
                tempI = tempI / 10;
            }
            if (reverse == i * 9) {
                System.out.println(i);
            }
        }
    }
}
