package com.yh.factory.abstract1;

/**
 * @Author: yh
 * @Description:
 * @Date: Created in 2021/3/23 22:05
 * @Version：
 */
public class HuaweiFactory implements Factory{

    @Override
    public Iphone iphone() {
        return new HuaweiPhone();
    }

    @Override
    public Irouter irouter() {
        return new HuaweiRouter();
    }
}
