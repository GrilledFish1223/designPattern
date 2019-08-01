package com.ping.statuspattern.vote;

/**
 * 具体状态类——恶意刷票
 *
 * @version $Id SpiteVoteState.java, v 1.0 2019-08-01 15:58 zsp $$
 * @author: zhangsp
 */

public class SpiteVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        String str = voteManager.getMapVote().get(user);
        if (str != null) {
            voteManager.getMapVote().remove(user);
        }
        System.out.println("你有恶意刷屏行为，取消投票资格");
    }
}
