package com.crackingthecodinginterview.dsa.problem1;

import java.util.Arrays;
import java.util.Collections;

/**
 * Sort the string and check if two adjacent characters are equal or not
 *
 * TC - O(nlogn)
 * SC - O(1)
 */
public class Approach2 implements DoesStringHasUniqueCharacters {
    @Override
    public boolean hasUniqueCharacters(String text) {
        char[] chars = text.toCharArray();
        Arrays.sort(chars);

        int index = 0;

        while (index < text.length()-2) {
            if (chars[index] == chars[index+1])
                return false;
            index++;
        }

        return true;
    }
}
