package com.yh.singleton;

/**
 * @Author: yh
 * @Description:枚举  线程安全  推荐使用
 * @Date: Created in 2021/3/15 23:14
 * @Version：
 */
public class SingleTonTest08 {
    public static void main(String[] args) {
        SingleTon08 st = SingleTon08.INSTANCE;
        SingleTon08 st2 = SingleTon08.INSTANCE;
        System.out.println(st == st2);
        System.out.println(st.hashCode());
        System.out.println(st2.hashCode());
    }
}
enum SingleTon08{
     INSTANCE;
     public void say(){
         System.out.println("hello");
     }
}
