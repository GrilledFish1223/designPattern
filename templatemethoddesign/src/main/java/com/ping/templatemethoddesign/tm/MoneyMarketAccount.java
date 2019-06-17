package com.ping.templatemethoddesign.tm;

/**
 * @version $Id MoneyMarketAccount.java, v 1.0 2019-06-17 17:14 zsp $$
 * @author: zhangsp
 */

public class MoneyMarketAccount extends Account{
    @Override
    protected String doCalculateAccountType() {
        return "Money Market";
    }

    @Override
    protected double doCalculateInterestRate() {
        return 0.045;
    }
}
