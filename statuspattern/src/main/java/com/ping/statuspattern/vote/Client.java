package com.ping.statuspattern.vote;

/**
 * @version $Id Client.java, v 1.0 2019-08-01 16:01 zsp $$
 * @author: zhangsp
 */

public class Client {
    public static void main(String[] args) {
        VoteManager vm = new VoteManager();
        for (int i = 0; i < 9; i++) {
            vm.vote("ul", "A");
        }
    }
}
