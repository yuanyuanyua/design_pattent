package com.yh.factory.method;

/**
 * @Author: yh
 * @Description:
 * @Date: Created in 2021/3/23 21:24
 * @Version：
 */
public class WulingFactory implements Factory{
    @Override
    public Car getCar() {
        return new Wuling();
    }
}
