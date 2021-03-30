package com.yh.builder.demo;

/**
 * @Author: yh
 * @Description:
 * @Date: Created in 2021/3/30 11:27
 * @Version：
 */
//指挥：核心。负责指挥构建一个工程 工程如何创建由他决定
public class Director {
    //指挥工人按顺序造房子
    public Product build(Builder builder){
        builder.buildA();
        builder.buildB();
        builder.buildC();
        builder.buildD();
        return builder.getProduct();
    }
}
