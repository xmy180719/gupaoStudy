package com.gupaoedu.vip.designmode.factory.abstractFactory;

import com.gupaoedu.vip.designmode.factory.IAirConditioner;
import com.gupaoedu.vip.designmode.factory.IWashMachine;

/**
 * Administrator
 * 2019/7/28
 */
public  interface AbstractFactory {
    IAirConditioner createAirConditioner();
    IWashMachine createWashMachine();
}
