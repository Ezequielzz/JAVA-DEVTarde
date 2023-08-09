package Colecoes;

import java.util.*;

public class ExemploHashMap {
    // <FORMATO DA CHAVE, VALOR DA CHAVE>
    HashMap<String, String> capitalEstado = new HashMap<>();
    HashMap<String, Integer> infoPessoa = new HashMap<>();

    public void teste3() {
        capitalEstado.put("SP", "São Paulo");
        capitalEstado.put("RJ", "Rio de Janeiro");
        capitalEstado.put("MG", "Belo Horizonte");
        capitalEstado.put("ES", "Vitória");

        // Buscando um Valor Pela chave
        System.out.println(capitalEstado.get("ES"));
        for (String i : capitalEstado.keySet()) {
            System.out.println(i +": " + capitalEstado.get(i));
        }

    }

    public void exercicio() {
        

        infoPessoa.put("João", 15);
        infoPessoa.put("Ana", 16);
        infoPessoa.put("Danilo", 17);
        infoPessoa.put("Giovana", 18);

        for (String i : infoPessoa.keySet()) {
            System.out.println(i + ": " + infoPessoa.get(i) + " anos");
        }
    }
}
