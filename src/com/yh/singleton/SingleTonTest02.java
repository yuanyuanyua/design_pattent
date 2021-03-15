package com.yh.singleton;

/**
 * @Author: yh
 * @Description:
 * @Date: Created in 2021/3/15 21:05
 * @Version：
 */
public class SingleTonTest02 {
    public static void main(String[] args) {
        SingleTon02 st = SingleTon02.getInstance();
        SingleTon02 st2 = SingleTon02.getInstance();
        System.out.println(st == st2);
        System.out.println(st.hashCode());
        System.out.println(st2.hashCode());
    }
}
class SingleTon02{
    private SingleTon02(){

    }
    private static SingleTon02 instance;
    static {
         instance = new SingleTon02();
    }
    public static SingleTon02 getInstance(){
        return instance;
    }
}
