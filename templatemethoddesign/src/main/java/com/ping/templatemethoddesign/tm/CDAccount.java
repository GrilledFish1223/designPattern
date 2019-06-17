package com.ping.templatemethoddesign.tm;

/**
 * @version $Id CDAccount.java, v 1.0 2019-06-17 17:15 zsp $$
 * @author: zhangsp
 */

public class CDAccount extends Account {
    @Override
    protected String doCalculateAccountType() {
        return "Certificate of Deposite";
    }

    @Override
    protected double doCalculateInterestRate() {
        return 0.06;
    }
}
