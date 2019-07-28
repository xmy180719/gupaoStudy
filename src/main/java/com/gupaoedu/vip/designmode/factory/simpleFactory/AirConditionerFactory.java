package com.gupaoedu.vip.designmode.factory.simpleFactory;

import com.gupaoedu.vip.designmode.factory.IAirConditioner;

/**
 * 创建空调的工厂类
 * Administrator
 * 2019/7/28
 */
public class AirConditionerFactory {
    public IAirConditioner creat(Class<? extends IAirConditioner> clazz){
        if(clazz != null){
            try {
               return clazz.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
       return null;
    }
}
