package com.yh.singleton;

/**
 * @Author: yh
 * @Description:懒汉式 线程不安全  不推荐使用
 * @Date: Created in 2021/3/15 21:20
 * @Version：
 */
public class SingleTonTest03 {
    public static void main(String[] args) {
        SingleTon03 st1 = SingleTon03.getInstance();
        SingleTon03 st2 = SingleTon03.getInstance();
        System.out.println(st1 == st2);
        System.out.println(st1.hashCode());
        System.out.println(st2.hashCode());
    }
}
class SingleTon03{
    private SingleTon03(){

    }
    private static SingleTon03 instance;
    public static SingleTon03 getInstance(){
        if(instance == null){
            instance = new SingleTon03();
        }
        return instance;
    }
}