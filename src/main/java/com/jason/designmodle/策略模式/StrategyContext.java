package com.jason.designmodle.策略模式;

/**
 * 负责和具体的算法类交互，算法和业务分离
 */
public class StrategyContext {

    private Strategy strategy;

    public StrategyContext(Strategy strategy) {
        this.strategy = strategy;
    }

    public double calculate(double price){
        return strategy.calculatePrice(price);
    }
}
