package Exception;

import javax.print.DocFlavor.STRING;
import javax.swing.JOptionPane;

public class ExemploTryCatchFinally {
    public static void main(String[] args) {
        // teste try catch finally
        String fraseInicial = null;
        String fraseFinal = null;

        fraseInicial = JOptionPane.showInputDialog(null, "Digite uma Frase");
        if (fraseInicial.equals("")) {
            fraseInicial = null;
        }
        try {
            fraseFinal = fraseInicial.toUpperCase();
        } catch (Exception e) {
            fraseFinal = "Não foi Digitado uma Frase";
        } finally {
            JOptionPane.showMessageDialog(null, fraseFinal);
        }
    }
}
