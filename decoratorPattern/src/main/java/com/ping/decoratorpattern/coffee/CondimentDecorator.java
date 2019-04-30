package com.ping.decoratorpattern.coffee;

/**
 * 装饰者基类
 */
public abstract class CondimentDecorator extends Beverage {
    @Override
    public abstract String getDescription();
}
