package com.yh.builder.demo2;

/**
 * @Author: yh
 * @Description:
 * @Date: Created in 2021/3/30 11:44
 * @Version：
 */
public class Worker extends Builder{
    Product product;

    public Worker() {
        product = new Product();
    }

    @Override
    Builder buildA(String msg) {
        product.setBuildA(msg);
        return this;

    }

    @Override
    Builder buildB(String msg) {
        product.setBuildB(msg);
        return this;
    }

    @Override
    Builder buildC(String msg) {
        product.setBuildC(msg);
        return this;
    }

    @Override
    Builder buildD(String msg) {
        product.setBuildD(msg);
        return this;
    }

    @Override
    Product getProduct() {
        return product;
    }
}
