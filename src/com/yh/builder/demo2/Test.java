package com.yh.builder.demo2;

/**
 * @Author: yh
 * @Description:
 * @Date: Created in 2021/3/30 16:56
 * @Version：
 */
public class Test {
    public static void main(String[] args) {
        Worker worker = new Worker();
        //链式编程  自由组合
        Product product = worker.buildA("全家桶")
                .getProduct();
        System.out.println(product.toString());

    }
}
