package com.gupaoedu.vip.designmode.factory.abstractFactory;

import com.gupaoedu.vip.designmode.factory.*;

/**
 * Administrator
 * 2019/7/28
 */
public class GreeFactory implements AbstractFactory {
    public IAirConditioner createAirConditioner() {
        return new GreeAirConditioner();
    }

    public IWashMachine createWashMachine() {
        return new GreeWashMachine();
    }
}
