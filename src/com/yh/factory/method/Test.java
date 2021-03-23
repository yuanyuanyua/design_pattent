package com.yh.factory.method;

/**
 * @Author: yh
 * @Description:
 * @Date: Created in 2021/3/23 21:25
 * @Version：
 */
public class Test {
    public static void main(String[] args) {
        Car car = new TeslaFactory().getCar();
        Car car2 = new WulingFactory().getCar();
        car.name();
        car2.name();
    }
}
