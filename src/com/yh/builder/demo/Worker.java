package com.yh.builder.demo;

/**
 * @Author: yh
 * @Description:
 * @Date: Created in 2021/3/30 11:24
 * @Version：
 */
//具体的创建者
public class Worker extends Builder{
    private Product product;

    public Worker() {
        product = new Product();
    }

    @Override
    void buildA() {
        product.setBuildA("地基");
        System.out.println("地基");
    }

    @Override
    void buildB() {
        product.setBuildB("钢筋工程");
        System.out.println("钢筋工程");
    }

    @Override
    void buildC() {
        product.setBuildC("铺垫线");
        System.out.println("铺垫线");
    }

    @Override
    void buildD() {
        product.setBuildD("水泥");
        System.out.println("水泥");
    }

    @Override
    Product getProduct() {
        return product;
    }

}
