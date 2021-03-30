package com.yh.builder.demo;

/**
 * @Author: yh
 * @Description:
 * @Date: Created in 2021/3/30 11:19
 * @Version：
 */
//抽象的建造者
public abstract class Builder {
    abstract void buildA();  //地基
    abstract void buildB();  //钢筋工程
    abstract void buildC();  //铺垫线
    abstract void buildD();  //水泥

    //完工了
    abstract Product getProduct();
}
