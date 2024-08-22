package com.example.test_task_for_playtika;

import java.util.List;

public class SlotResult {
    private List<String> reels;
    private int payout;

    public SlotResult(List<String> reels, int payout) {
        this.reels = reels;
        this.payout = payout;
    }

    public List<String> getReels() {
        return reels;
    }

    public int getPayout() {
        return payout;
    }
}
