
package PhoneKeysInNumbers;

enum ChartoNumEnum {
    //declaration of the all possibilities, in the case of want more possibilities, it's only necessary put here
    //Declaração de todas possibilidades, no caso de querer adicionar mais possbilidades, é apenas necessário coloca-lo aqui
    Dois('2', 'A', 'B', 'C'),
    Tres('2', 'D', 'E', 'F'),
    Quatro('4', 'G', 'H', 'I'),
    Cinco('5', 'J', 'K', 'L'),
    Seis('6', 'M', 'N', 'O'),
    Sete('7', 'P', 'Q', 'R', 'S'),
    Oito('8', 'T', 'U', 'V'),
    Nove('9', 'W', 'X', 'Y', 'Z');

    private final char output;
    private final char[] inputs;
    
    private ChartoNumEnum(char output, char... inputs) {
        this.output = output;
        this.inputs = inputs;

    }

    static char getEnum(char c) {
        for (ChartoNumEnum value : ChartoNumEnum.values()) {
            for (char caracter : value.inputs) {
                if (caracter == c) {
                    return value.output;
                }
            }
        }
        //check if the variable 'c' is equals the some of the inputs of some of the Enum elements/
        //verifica se a variavel 'c' é igual a algum dos elemetos da variavel inputs, essa verificacao é feita por todos os Enums: 
        //Um, Dois, etc.
        
        //if is equals return the output, else return himself char/
        //se a verificacao der verdadeiro retorna o output, caso contrario retorna a proria variavel 'c'
        return c;
    }

}
