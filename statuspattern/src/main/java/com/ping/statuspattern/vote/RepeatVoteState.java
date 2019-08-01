package com.ping.statuspattern.vote;

/**
 * 具体状态类——重复投票
 *
 * @version $Id RepeatVoteState.java, v 1.0 2019-08-01 15:57 zsp $$
 * @author: zhangsp
 */

public class RepeatVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        //重复投票，暂时不做处理
    }
}
