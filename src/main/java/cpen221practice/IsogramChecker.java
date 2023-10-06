package cpen221practice;

import java.util.HashSet;
import java.util.Set;

class IsogramChecker {

    boolean isIsogram(String phrase) {
        Set<Character> letters = new HashSet<>();
        for (char c : phrase.toCharArray()) {
            if (letters.contains(Character.toLowerCase(c))) {
                return false;
            } else if (Character.isAlphabetic(c)){
                letters.add(Character.toLowerCase(c));
            }
        }
        return true;
    }
}
