package com.gupaoedu.vip.designmode.factory.abstractFactory;

import com.gupaoedu.vip.designmode.factory.IAirConditioner;
import com.gupaoedu.vip.designmode.factory.IWashMachine;
import com.gupaoedu.vip.designmode.factory.MideaAirConditioner;
import com.gupaoedu.vip.designmode.factory.MideaWashMachine;

/**
 * Administrator
 * 2019/7/28
 */
public class MideaFactory implements AbstractFactory {
    public IAirConditioner createAirConditioner() {
        return new MideaAirConditioner();
    }

    public IWashMachine createWashMachine() {
        return new MideaWashMachine();
    }
}
