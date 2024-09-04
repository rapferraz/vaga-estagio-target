import com.google.gson.internal.bind.util.ISO8601Utils;

import java.text.DecimalFormat;

public class Exercicio4 {

/* 4) Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:
• SP – R$67.836,43
• RJ – R$36.678,66
• MG – R$29.229,88
• ES – R$27.165,48
• Outros – R$19.849,53

Escreva um programa na linguagem que desejar onde calcule o percentual de representação que cada
estado teve dentro do valor total mensal da distribuidora. */

    public static void main(String[] args) {
        double  estadoSp = 67836.43;
        double estadoRj = 36678.66;
        double estadoMg = 29229.88;
        double estadoEs = 27165.48;
        double outrosEstados = 19849.53;
        double total = estadoEs+estadoSp+estadoRj+estadoMg+outrosEstados; //180759.98
        DecimalFormat formatador = new DecimalFormat("#.00"); //Formatador para imprimir 2 numeros depois da virgula


        double percentual = (estadoSp/total) * 100;
        System.out.println("Porcentagem que representa o estado de SP: " + formatador.format(percentual) + "%");
        percentual = (estadoRj/total) * 100;
        System.out.println("Porcentagem que representa o estado do RJ: " + formatador.format(percentual) + "%");
        percentual = (estadoMg/total) * 100;
        System.out.println("Porcentagem que representa o estado do MG: " + formatador.format(percentual) + "%");
        percentual = (estadoEs/total) * 100;
        System.out.println("Porcentagem que representa o estado do ES: " + formatador.format(percentual) + "%");
        percentual = (outrosEstados/total) * 100;
        System.out.println("Porcentagem que representa outros estados: " + formatador.format(percentual) + "%");
    }
}
