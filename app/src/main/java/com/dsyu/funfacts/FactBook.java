package com.dsyu.funfacts;

import java.util.Random;

class FactBook {
    // Fields
    private String[] facts = {
            "The lighter was invented before the match.",
            "All polar bears are left-handed.",
            "A shrimp's heart is in its head.",
            "Almonds are members of the peach family.",
            "Sloths can hold their breath longer than dolphins can.",
            "It’s impossible to hum while holding your nose.",
            "The man with the world's longest beard died after he tripped over his beard in a fire.",
            "The Romans used to clean and whiten their teeth with urine.",
            "Coca-Cola would be green if coloring wasn’t added to it.",
            "You cannot snore and dream at the same time."
    };

    // Methods
    String getFact() {
        // Randomly select fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(facts.length);
        return facts[randomNumber];
    }

}
