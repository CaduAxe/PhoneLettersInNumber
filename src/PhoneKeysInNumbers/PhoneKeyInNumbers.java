//I'm sorry for my English
package PhoneKeysInNumbers;

import java.util.Scanner;

/**
 *
 * @author KaduAxe
 */
public class PhoneKeyInNumbers {

    static final String REGEX = "^[A-Z0-9\\-]+$";

    /**
     *
     * @param letters String - The letters
     * @return String 
     * @throws PhoneKeysInNumbers.InvalideLatters
     * @precondition letters.matches([A-Z0-9\\-]+)
     */
    public static String toNumbers(String letters) throws InvalideLatters {
        if(isvalid(letters)) 
            throw new  InvalideLatters();

        for (char c : letters.toCharArray()) {
            letters = letters.replace(c, ChartoNum.getEnum(c));
        }
        return letters;
    }

    private static boolean isvalid(String letters) {
        return !letters.matches(REGEX);
    }
}
class InvalideLatters extends Exception{
}