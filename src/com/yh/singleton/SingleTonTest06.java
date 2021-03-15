package com.yh.singleton;

/**
 * @Author: yh
 * @Description:懒汉式  双重保证  推荐使用
 * @Date: Created in 2021/3/15 22:07
 * @Version：
 */
public class SingleTonTest06 {
    public static void main(String[] args) {
        SingleTon06 st = SingleTon06.getInstance();
        SingleTon06 st2 = SingleTon06.getInstance();
        System.out.println(st == st2);
        System.out.println(st.hashCode());
        System.out.println(st2.hashCode());
    }
}

class SingleTon06 {
    private SingleTon06() {

    }

    private static volatile SingleTon06 instance;

    public static SingleTon06 getInstance() {
        if (instance == null) {
            synchronized (SingleTon06.class) {
                if (instance == null)
                    instance = new SingleTon06();
            }
        }
        return instance;
    }
}