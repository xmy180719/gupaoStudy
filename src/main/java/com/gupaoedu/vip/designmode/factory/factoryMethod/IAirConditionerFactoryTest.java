package com.gupaoedu.vip.designmode.factory.factoryMethod;

/**
 * Administrator
 * 2019/7/28
 */
public class IAirConditionerFactoryTest {
    public static void main(String[] args) {
        IAirConditionerFactory factory = new GreeAirConditionerFactory();
        factory.create().prodution();
    }
}
