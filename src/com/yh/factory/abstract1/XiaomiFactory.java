package com.yh.factory.abstract1;

/**
 * @Author: yh
 * @Description:
 * @Date: Created in 2021/3/23 22:05
 * @Version：
 */
public class XiaomiFactory implements Factory{

    @Override
    public Iphone iphone() {
        return new XiaomiPhone();
    }

    @Override
    public Irouter irouter() {
        return new XiaomiRouter();
    }
}
