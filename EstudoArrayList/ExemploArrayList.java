package EstudoArrayList;

import javax.swing.JOptionPane;

public class ExemploArrayList {
    // Atributos
    int cont = 0;
    int acao = 0;
    boolean ligado = true;
    int v1[] = new int[cont];
    int v2[] = new int[cont + 1];

    // Métodos
    public void add(int add) {

        while (ligado) {

            acao = Integer.parseInt(JOptionPane.showInputDialog(null, "O que Deseja Fazer? \n1 - Adicionar + 1 Posição No Vetor - 2 Sair"));

            if (acao == 1) {
                // Copiar o v1 --> v2
                for (int i = 0; i < v1.length; i++) {
                    v2[i] = v1[i];
                }
                // Adcionar o valor do add a ultima posição do v2
                v2[v2.length - 1] = add;

                // Redefinir
                int v1[] = new int[cont+1];

                // Copiar o v1 --> v2
                for (int i = 0; i < v1.length; i++) {
                    v1[i] = v2[i];
                }

                for (int i = 0; i < v1.length; i++) {
                    JOptionPane.showMessageDialog(null, "Teste: " + v1[i]);
                }


            } else if (acao == 2) {
                JOptionPane.showMessageDialog(null, "Saindo do Programa...");
                ligado = false;
            } else {
                JOptionPane.showMessageDialog(null, "Valor Inválido, Digite um Valor Válido");
            }
        }
    }
}
