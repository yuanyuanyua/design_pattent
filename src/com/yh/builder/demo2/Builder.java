package com.yh.builder.demo2;


/**
 * @Author: yh
 * @Description:
 * @Date: Created in 2021/3/30 11:42
 * @Version：
 */
public abstract class Builder {
    abstract Builder buildA(String msg);
    abstract Builder buildB(String msg);
    abstract Builder buildC(String msg);
    abstract Builder buildD(String msg);

    abstract Product getProduct();
}
