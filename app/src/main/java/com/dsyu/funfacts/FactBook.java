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
            "You cannot snore and dream at the same time.",
            "Ants stretch when they wake up in the morning.",
            "Ostriches can run faster than horses.",
            "Olympic gold medals are actually made mostly of silver.",
            "You are born with 300 bones; by the time you are an adult you will have 206.",
            "It takes about 8 minutes for light from the Sun to reach Earth.",
            "Some bamboo plants can grow almost a meter in just one day.",
            "The state of Florida is bigger than England.",
            "Some penguins can leap 2-3 meters out of the water.",
            "On average, it takes 66 days to form a new habit.",
            "Mammoths still walked the earth when the Great Pyramid was being built."
    };
    // Methods
    String getFact() {
        // Randomly select fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(facts.length);
        return facts[randomNumber];
    }

}
