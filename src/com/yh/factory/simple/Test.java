package com.yh.factory.simple;

/**
 * @Author: yh
 * @Description:
 * @Date: Created in 2021/3/23 21:13
 * @Version：
 */
public class Test {
    public static void main(String[] args) {
        //传统方法
        //Car car = new Wuling();
        //Car car2 = new Tesla();
        Car car = SimpleFactory.getCar("Wuling");
        Car car2 = SimpleFactory.getCar("Tesla");
        car.name();
        car2.name();
    }

    //结构复杂度：simple
    //代码复杂度：simple
    //编程复杂度：simple
    //代码管理复杂度：simple
    //根据设计原则：工厂方法模式
    //根据实际业务：简单工厂模式
}
