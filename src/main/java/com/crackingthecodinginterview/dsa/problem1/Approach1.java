package com.crackingthecodinginterview.dsa.problem1;

/**
 * Brute force - Run a nested loop over each character of the string and check if it is repeated in the remaining sub part of the string
 * <p>
 * TC - O(n2)
 * SC - O(1)
 */
public class Approach1 implements DoesStringHasUniqueCharacters {
    @Override
    public boolean hasUniqueCharacters(String str) {
        if (str == null || str.isBlank() || str.length() == 1)
            return true;

        for (int i = 0; i < str.length() - 2; i++) {
            for (int j=i+1; j<str.length() - 1; j++) {
                if (str.charAt(i) == str.charAt(j))
                    return false;
            }
        }

        return true;
    }
}
