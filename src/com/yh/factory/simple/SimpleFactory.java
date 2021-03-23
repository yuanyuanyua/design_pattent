package com.yh.factory.simple;

/**
 * @Author: yh
 * @Description:
 * @Date: Created in 2021/3/23 21:15
 * @Version：
 */
public class SimpleFactory {
    public static Car getCar(String car){
        if(car.equals("Wuling")){
            return new Wuling();
        }else if(car.equals("Tesla")){
            return new Tesla();
        }else{
            return null;
        }
    }
}
