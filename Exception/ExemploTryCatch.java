package Exception;

import javax.swing.JOptionPane;

public class ExemploTryCatch {
    public static void main(String[] args) {
        double n1, n2;
        boolean ligado = true;
        int acao = 0;

        while (ligado) {
            JOptionPane.showMessageDialog(null, "       ----- Calculadora -----");
            acao = Integer.parseInt(JOptionPane.showInputDialog(
                    "----- Calculadora ----- \n     Escolha uma Operação\n 1 - Soma\n 2 - Subtração\n 3 - Multiplicação\n 4 - Divisão\n 5 - Sair "));

            switch (acao) {
                case 1:

                    try {
                        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite Um Número Inteiro"));
                        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite Um Número Inteiro"));
                        JOptionPane.showMessageDialog(null, "O Resultado Da Soma é: " + (n1 + n2));
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "ERRO - Valor Digitado Não é Um Número Inteiro!");
                        // TODO: handle exception
                    }
                    break;

                case 2:

                    try {
                        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite Um Número Inteiro"));
                        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite Um Número Inteiro"));
                        JOptionPane.showMessageDialog(null, "O Resultado Da Subtração é: " + (n1 - n2));
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "ERRO - Valor Digitado Não é Um Número Inteiro!");
                        // TODO: handle exception
                    }
                    break;

                case 3:

                    try {
                        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite Um Número Inteiro"));
                        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite Um Número Inteiro"));
                        JOptionPane.showMessageDialog(null, "O Resultado Da Multiplicação é: " + (n1 * n2));
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "ERRO - Valor Digitado Não é Um Número Inteiro!");
                        // TODO: handle exception
                    }
                    break;

                case 4:
                    try {
                        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite Um Número Inteiro"));
                        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite Um Número Inteiro"));
                        JOptionPane.showMessageDialog(null, "O Resultado Da Divisão é: " + (n1 / n2));
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "ERRO - Valor Digitado Não é Um Número Inteiro!");
                        // TODO: handle exception
                    }

                    catch (ArithmeticException e) {
                        JOptionPane.showMessageDialog(null, "ERRO - Valor Digitado Não é Possível Dividir Por Zero!");
                        // TODO: handle exception
                    }

                    catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "ERRO - Valor Digitado Não é Um Número Inteiro!");
                        // TODO: handle exception
                    }

                    break;

                case 5:
                    ligado = false;

                    break;
                default:
                    JOptionPane.showMessageDialog(null, "ERRO - Digite Uma Informação Válida!");
                    break;
            }

        }
    }
}
