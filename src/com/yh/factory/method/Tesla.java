package com.yh.factory.method;

/**
 * @Author: yh
 * @Description:
 * @Date: Created in 2021/3/23 21:13
 * @Version：
 */
public class Tesla implements Car {
    @Override
    public void name() {
        System.out.println("特斯拉");
    }
}
