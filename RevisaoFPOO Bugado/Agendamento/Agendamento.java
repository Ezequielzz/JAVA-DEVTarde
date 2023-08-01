

import javax.swing.JOptionPane;

import RevisaoFPOO.Cadastro.Animais;

public class Agendamento extends Animais {

    // atributos
    String data;
    String hora;
    String dataHora;

    public void agendarCachorro() {
        JOptionPane.showMessageDialog(null, "----- Menu Cadastro Canino ----- \n        Preencha os Campos");


    }

    public void agendarGato() {
        JOptionPane.showMessageDialog(null, "----- Menu Cadastro Canino ----- \n        Preencha os Campos");

        
    }

    public void agendarOutros() {
        JOptionPane.showMessageDialog(null, "----- Menu Cadastro Canino ----- \n        Preencha os Campos");

        
    }

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getHora() {
        return hora;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }
    public String getDataHora() {
        return dataHora;
    }
    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    
}
