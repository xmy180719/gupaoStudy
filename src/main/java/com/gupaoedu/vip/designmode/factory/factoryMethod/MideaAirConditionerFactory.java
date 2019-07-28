package com.gupaoedu.vip.designmode.factory.factoryMethod;

import com.gupaoedu.vip.designmode.factory.IAirConditioner;
import com.gupaoedu.vip.designmode.factory.MideaAirConditioner;

/**
 * Administrator
 * 2019/7/28
 */
public class MideaAirConditionerFactory implements IAirConditionerFactory {
    public IAirConditioner create() {
        return new MideaAirConditioner();
    }
}
