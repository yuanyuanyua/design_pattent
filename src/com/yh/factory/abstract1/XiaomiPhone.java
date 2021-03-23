package com.yh.factory.abstract1;

/**
 * @Author: yh
 * @Description:
 * @Date: Created in 2021/3/23 22:00
 * @Version：
 */
public class XiaomiPhone implements Iphone{
    @Override
    public void call() {
        System.out.println("用小米手机打电话");
    }

    @Override
    public void sendMessage() {
        System.out.println("用小米手机发短信");
    }
}
