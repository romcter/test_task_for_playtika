package com.example.test_task_for_playtika;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class SlotMachine {
    private static final List<String> REELS = Arrays.asList("A", "B", "C", "D", "E");
    private static final Map<String, Integer> MULTIPLIERS = Map.of(
            "A", 2,
            "B", 3,
            "C", 5,
            "D", 10,
            "E", 20
    );

    private List<String> spinReels() {
        Random random = new Random();
        return List.of(
                REELS.get(random.nextInt(REELS.size())),
                REELS.get(random.nextInt(REELS.size())),
                REELS.get(random.nextInt(REELS.size()))
        );
    }

    public SlotResult spin(int betAmount) {
        List<String> result = spinReels();
        boolean isWinning = result.get(0).equals(result.get(1)) && result.get(1).equals(result.get(2));
        int payout = isWinning ? betAmount * MULTIPLIERS.get(result.get(0)) : 0;

        return new SlotResult(result, payout);
    }
}

