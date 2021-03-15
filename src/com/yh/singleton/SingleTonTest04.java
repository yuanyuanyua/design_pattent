package com.yh.singleton;

/**
 * @Author: yh
 * @Description:懒汉式  线程安全  效率太低
 * @Date: Created in 2021/3/15 22:07
 * @Version：
 */
public class SingleTonTest04 {
    public static void main(String[] args) {
        SingleTon04 st = SingleTon04.getInstance();
        SingleTon04 st2 = SingleTon04.getInstance();
        System.out.println(st == st2);
        System.out.println(st.hashCode());
        System.out.println(st2.hashCode());
    }
}
class SingleTon04{
    private SingleTon04(){

    }
    private static SingleTon04 instance;
    public static synchronized SingleTon04 getInstance(){
        if(instance == null)
            instance = new SingleTon04();
        return instance;
    }
}