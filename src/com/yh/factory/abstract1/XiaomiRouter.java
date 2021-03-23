package com.yh.factory.abstract1;

/**
 * @Author: yh
 * @Description:
 * @Date: Created in 2021/3/23 22:01
 * @Version：
 */
public class XiaomiRouter implements Irouter{
    @Override
    public void start() {
        System.out.println("打开小米路由器");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭小米路由器");
    }

    @Override
    public void setting() {
        System.out.println("设置小米路由器");
    }
}
