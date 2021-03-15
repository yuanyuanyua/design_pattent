package com.yh.singleton;

/**
 * @Author: yh
 * @Description:静态内部类  线程安全 推荐使用
 * @Date: Created in 2021/3/15 23:05
 * @Version：
 */
public class SingleTonTest07 {
    public static void main(String[] args) {
        SingleTon07 st = SingleTon07.getInstance();
        SingleTon07 st2 = SingleTon07.getInstance();
        System.out.println(st == st2);
        System.out.println(st.hashCode());
        System.out.println(st2.hashCode());
    }
}
class SingleTon07 {
    private SingleTon07() {

    }

    private static class SingleTonInstance{
        private static final SingleTon07 INSTANCE = new SingleTon07();
    }

    public static SingleTon07 getInstance() {
        return SingleTonInstance.INSTANCE;
    }
}