package com.yh.factory.method;

/**
 * @Author: yh
 * @Description:
 * @Date: Created in 2021/3/23 21:23
 * @Version：
 */
public class TeslaFactory implements Factory{
    @Override
    public Car getCar() {
        return new Tesla();
    }
}
