import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio5 {
/* 5) Escreva um programa que inverta os caracteres de um string.

IMPORTANTE:
a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
b) Evite usar funções prontas, como, por exemplo, reverse; */

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String textoDigitado = leitor.nextLine();

        char[] arrayDoTexto = textoDigitado.toCharArray();

        for(int i = arrayDoTexto.length-1; i >= 0; i--) {
            System.out.print(arrayDoTexto[i]);
        }
     }
}
