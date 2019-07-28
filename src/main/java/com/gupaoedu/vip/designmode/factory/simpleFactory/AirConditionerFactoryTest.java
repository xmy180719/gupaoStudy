package com.gupaoedu.vip.designmode.factory.simpleFactory;

import com.gupaoedu.vip.designmode.factory.GreeAirConditioner;
import com.gupaoedu.vip.designmode.factory.MideaAirConditioner;

/**
 * Administrator
 * 2019/7/28
 */
public class AirConditionerFactoryTest {
    public static void main(String[] args) {
        AirConditionerFactory factory = new AirConditionerFactory();
        factory.creat(MideaAirConditioner.class).prodution();
        factory.creat(GreeAirConditioner.class).prodution();
    }
}

