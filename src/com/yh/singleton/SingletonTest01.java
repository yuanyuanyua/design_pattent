package com.yh.singleton;

/**
 * @Author: yh
 * @Description:饿汉式
 * 优点：简单 不会出现线程同步问题
 * 缺点：增加内存消耗
 * @Date: Created in 2021/3/15 20:20
 * @Version：
 */
public class SingletonTest01 {
    public static void main(String[] args) {
        SingleTon st1 = SingleTon.getInstance();
        SingleTon st2 = SingleTon.getInstance();
        System.out.println(st1 == st2);
        System.out.println(st1.hashCode());
        System.out.println(st2.hashCode());
    }


}
class SingleTon{
    private SingleTon(){

    }

    private final static SingleTon instance = new SingleTon();

    public static SingleTon getInstance(){
        return instance;
    }
}