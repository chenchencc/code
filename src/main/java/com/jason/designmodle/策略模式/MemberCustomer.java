package com.jason.designmodle.策略模式;

/**
 * 老客户 7则
 */
public class MemberCustomer implements Strategy{
    @Override
    public double calculatePrice(double price) {
        return price*0.7;
    }
}
