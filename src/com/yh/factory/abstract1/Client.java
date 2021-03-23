package com.yh.factory.abstract1;

/**
 * @Author: yh
 * @Description:
 * @Date: Created in 2021/3/23 22:11
 * @Version：
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("==========华为系列产品===========");
        Iphone huaweiPhone = new HuaweiFactory().iphone();
        huaweiPhone.call();
        huaweiPhone.sendMessage();
        Irouter huaweiRouter = new HuaweiFactory().irouter();
        huaweiRouter.setting();
        huaweiRouter.start();

        System.out.println("==========小米系列产品===========");
        Iphone xiaomiPhone = new XiaomiFactory().iphone();
        xiaomiPhone.call();
        xiaomiPhone.sendMessage();
    }
}
