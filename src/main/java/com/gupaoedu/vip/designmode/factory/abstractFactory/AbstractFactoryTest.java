package com.gupaoedu.vip.designmode.factory.abstractFactory;

/**
 * Administrator
 * 2019/7/28
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        AbstractFactory factory = new MideaFactory();
        factory.createAirConditioner().prodution();
        factory.createWashMachine().prodution();
    }
}
