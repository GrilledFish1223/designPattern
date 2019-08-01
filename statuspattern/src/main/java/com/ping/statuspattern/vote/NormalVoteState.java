package com.ping.statuspattern.vote;

/**
 * 具体状态类——正常投票
 *
 * @version $Id NormalVoteState.java, v 1.0 2019-08-01 15:55 zsp $$
 * @author: zhangsp
 */

public class NormalVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        voteManager.getMapVote().put(user, voteItem);
        System.out.println("恭喜投票成功");
    }
}
