package com.crackingthecodinginterview.dsa.problem1;

import javax.print.DocFlavor;

/**
 * Use a boolean array of size 256 because ASCII character set can have max 256 characters.
 * Traverse the string and set the flags of the particular character as true.
 * Before setting it true, if it is already true, then string does not have unique characters.
 *
 * TC - O(n)
 * SC - O(1) 256 size always
 */
public class Approach4 implements DoesStringHasUniqueCharacters{

    public static final int MAX_SIZE = 256;

    @Override
    public boolean hasUniqueCharacters(String text) {

        if (text.length() > MAX_SIZE)
            return false;

        boolean flagArray[] = new boolean[MAX_SIZE];
        char[] chars = text.toCharArray();
        for (char character : chars) {
            if (flagArray[character])
                return false;
            flagArray[character] = true;
        }
        return true;
    }
}
