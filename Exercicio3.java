import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Exercicio3 {
/* 3) Dado um vetor que guarda o valor de faturamento diário de uma distribuidora, faça um programa, na linguagem que desejar, que calcule
e retorne:
• O menor valor de faturamento ocorrido em um dia do mês;
• O maior valor de faturamento ocorrido em um dia do mês;
• Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.

IMPORTANTE:
a) Usar o json ou xml disponível como fonte dos dados do faturamento mensal;
b) Podem existir dias sem faturamento, como nos finais de semana e feriados. Estes dias devem ser ignorados no cálculo da média; */

    public static void main(String[] args) throws FileNotFoundException {
        Gson gson = new Gson();

         FileReader reader =  new FileReader("faturamento.json");

            JsonObject objetoJson = gson.fromJson(reader, JsonObject.class);
            JsonArray arrayDeFaturamento = objetoJson.getAsJsonArray("faturamento_diario");

            List<Double> listaDeFaturamento = new ArrayList<>();

            for(int i = 0; i < arrayDeFaturamento.size(); i++) {
                JsonObject faturamentoDiario = arrayDeFaturamento.get(i).getAsJsonObject();
                double valor = faturamentoDiario.get("faturamento").getAsDouble();
                if (valor > 0) {
                    listaDeFaturamento.add(valor);
                }
            }

            if(listaDeFaturamento.isEmpty()) {
                System.out.println("Não há dados de faturamento disponíveis.");
            }

            double maiorValor = listaDeFaturamento.stream().max(Double::compare).get();
            double menorValor = listaDeFaturamento.stream().min(Double::compare).get();

            double somaDoFaturamento = listaDeFaturamento.stream().mapToDouble(Double::doubleValue).sum();
            double mediaDeFaturamento = somaDoFaturamento / listaDeFaturamento.size();

            long diasAcimaDaMedia = listaDeFaturamento.stream().filter(valor -> valor > mediaDeFaturamento).count();

        System.out.println("Maior valor de faturamento: R$" + maiorValor);
        System.out.println("Menor valor de faturamento: R$" + menorValor);
        System.out.println("Quantidade de dias acima da média do faturmento mensal: " + diasAcimaDaMedia);
    }
}