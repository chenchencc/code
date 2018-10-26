package com.jason.design.行为模式.策略模式;

/**
 * 写代码时总会出很多的if…else，或者case。
 * 如果在一个条件语句中又包含了多个条件语句就会使得代码变得臃肿，维护的成本也会加大，而策略模式就能较好的解决这个问题，
 *
 * 策略模式的优点
 　　（1）策略模式提供了管理相关的算法族的办法。策略类的等级结构定义了一个算法或行为族。恰当使用继承可以把公共的代码移到父类里面，从而避免代码重复。

 　　（2）使用策略模式可以避免使用多重条件(if-else)语句。多重条件语句不易维护，它把采取哪一种算法或采取哪一种行为的逻辑与算法或行为的逻辑混合在一起，统统列在一个多重条件语句里面，比使用继承的办法还要原始和落后。

 策略模式的缺点
 　　（1）客户端必须知道所有的策略类，并自行决定使用哪一个策略类。这就意味着客户端必须理解这些算法的区别，以便适时选择恰当的算法类。换言之，策略模式只适用于客户端知道算法或行为的情况。

 　　（2）由于策略模式把每个具体的策略实现都单独封装成为类，如果备选的策略很多的话，那么对象的数目就会很可观。
 */
public class StrategyContext {  //implements JiaMiStrategy{  如果加上这段代码就是类似于装饰者模式了

    private JiaMiStrategy jm;

    public StrategyContext(JiaMiStrategy jm) {
        this.jm = jm;
    }

    public String encrypt(String content) {
        return jm.encrypt(content);
    }
}
