package com.yh.factory.abstract1;

/**
 * @Author: yh
 * @Description:
 * @Date: Created in 2021/3/23 22:03
 * @Version：
 */
public class HuaweiPhone implements Iphone{
    @Override
    public void call() {
        System.out.println("用华为手机打电话");
    }

    @Override
    public void sendMessage() {
        System.out.println("用华为手机发短信");
    }
}
