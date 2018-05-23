package com.jason.designmodle.策略模式;

/**
 * 新客户结算
 * 9ze
 */
public class NewCustomer implements Strategy{
    @Override
    public double calculatePrice(double price) {
        return price*0.9;
    }
}
