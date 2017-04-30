package PhoneKeysInNumbers;

import java.util.Scanner;

/**
 *
 * @author KaduAxe
 */
public class View {
    public static void main(String[] args) {
        System.out.println("Write the ");
        try {
            System.out.println(PhoneKeyInNumbers.toNumbers(new Scanner(System.in).nextLine()));
        } catch (InvalideLatters ex) {
            System.out.println("Caracteres Invalidos(For more informations check the PhoneKeyInNumbers.toNumbers JavaDoc)");
        }
    }
}
