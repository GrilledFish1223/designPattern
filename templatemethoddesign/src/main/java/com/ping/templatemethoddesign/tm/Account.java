package com.ping.templatemethoddesign.tm;

/**
 * @version $Id Account.java, v 1.0 2019-06-17 17:08 zsp $$
 * @author: zhangsp
 */

public abstract class Account {

    /**
     * 模板方法， 计算利息
     *
     * @return 返回利息
     */
    public final double calculateInterest() {
        double interestRate = doCalculateInterestRate();
        String accountType = doCalculateAccountType();
        double amount = calculateAmount(accountType);
        return amount * interestRate;
    }

    /**
     * 基本方法
     *
     * @return 返回类型
     */
    protected abstract String doCalculateAccountType();

    protected abstract double doCalculateInterestRate();

    /**
     * 基本方法，已经实现
     */
    private double calculateAmount(String accountType) {
        return 7243.00;
    }
}
