package com.crackingthecodinginterview.dsa.problem1;

/**
 * Assumption - string only holds a-z characters
 *
 * We can use 26 bits to check if a character is present/absent
 * It is optimized version of of ASCII, but works for a-z characters only.
 * We need 26 bits value, so we can use an int (which is 4 bytes, i.e. 32 bits)
 *
 */
public class Approach5 implements DoesStringHasUniqueCharacters{
    @Override
    public boolean hasUniqueCharacters(String text) {
        int checker = 0;

        if (text.length() > 26)
            return false;

        char[] chars = text.toCharArray();
        for (char character : chars) {
            int value = character - 'a'; // it will always give us some value between 0 and 25

            // check if that value is already set, I mean the bit is set for current character

            if ((checker & (1 << value)) > 0)
                return false;

            // set the bit for the current character
            checker = checker | (1 << value);
        }

        return true;
    }
}
