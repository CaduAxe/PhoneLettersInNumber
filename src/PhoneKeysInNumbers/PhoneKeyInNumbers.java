//CaduAxe
//Country: Brazil/Pais: Brasil
//I'm sorry for my English

package PhoneKeysInNumbers;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class PhoneKeyInNumbers {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        //get an String with the letters: 'A', 'B', it's possible write other keys, but this letters will be not transformed
        //pega uma String com as letras: 'A', 'B', é possivel escrever outras chaves, mas elas não serão transformadas

        s = s.toUpperCase();

        for (char c : s.toCharArray()) {
            s = s.replace(c, ChartoNum.getEnum(c));
        }
        //transform the letters in numbers, to  more information see the ChartoNum class
        //transforma as letras em numeros, para mais informacoes veja a classe ChartoNum
        
        //show the final result
        //mostra o resultado final
        System.out.println(s);
    }
}
