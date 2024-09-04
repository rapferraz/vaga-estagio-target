import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio2 {

    /* 2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o
    próximo valor sempre será a soma dos 2 valores anteriores
    (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...),
    escreva um programa na linguagem que desejar onde,
    informado um número, ele calcule a sequência de Fibonacci e
    retorne uma mensagem avisando se o número informado pertence ou não a sequência. */

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        int n = 0;
        int m = 1;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numeroDigitado = leitor.nextInt();

        for(int i = 1; i <= 100; i++) {
            m = n+m;
            n = m-n;
            lista.add(n);
        }

        if (lista.contains(numeroDigitado)) {
            System.out.println("O número que você digitou faz parte da sequência.");
        } else {
            System.out.println("O número que você digitou não faz parte da sequência.");
        }
    }
}
