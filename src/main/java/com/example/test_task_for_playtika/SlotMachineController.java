package com.example.test_task_for_playtika;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/slot-machine")
public class SlotMachineController {

    private final SlotMachine slotMachine = new SlotMachine();

    @GetMapping("/info")
    public ResponseEntity<String> getSlotInfo() {
        return ResponseEntity.ok("Welcome to the Slot Machine! Symbols: A, B, C, D, E. Try your luck!");
    }

    @PostMapping("/spin")
    public ResponseEntity<SlotResult> spin(@RequestParam int betAmount) {
        SlotResult result = slotMachine.spin(betAmount);
        return ResponseEntity.ok(result);
    }
}

