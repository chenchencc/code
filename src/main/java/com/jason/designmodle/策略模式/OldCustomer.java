package com.jason.designmodle.策略模式;

/**
 * 老客户 8.5则
 */
public class OldCustomer implements Strategy{
    @Override
    public double calculatePrice(double price) {
        return price*0.85;
    }
}
