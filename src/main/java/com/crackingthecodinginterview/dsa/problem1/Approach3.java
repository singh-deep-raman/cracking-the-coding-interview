package com.crackingthecodinginterview.dsa.problem1;

import java.util.HashSet;

/**
 * Use HashSet to check uniqueness of the characters of the string
 *
 * TC - O(n)
 * SC - O(n)
 */
public class Approach3 implements DoesStringHasUniqueCharacters{
    @Override
    public boolean hasUniqueCharacters(String text) {
        char[] chars = text.toCharArray();
        var set = new HashSet<Character>();
        for (char character : chars) {
            if (set.contains(character))
                return false;
            set.add(character);
        }
        return true;
    }
}
