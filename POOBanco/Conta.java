package POOBanco;

import javax.swing.JOptionPane;

public class Conta extends Pessoa {

    public double saque = 0;
    public int sacar;
    public double deposito = 0;
    public double depositar;
    public double emprestimo = 0;
    public double emprestado;
    public double saldo;
    public String senha;
    public int acao = 0;
    public int codigo = 0;

    public void criarConta() {
        JOptionPane.showMessageDialog(null, "Criação de Conta");
        setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: ")));

        if (getIdade() >= 18) {

            JOptionPane.showMessageDialog(null, "Criação de Conta");
            JOptionPane.showInputDialog(null,
                    "Informe Qual o Tipo da Sua Conta\n 1 - Pessoa Física 2 - Pessoa Jurídica");

                    switch (acao) {
                        case 1:
                        JOptionPane.showMessageDialog(null, "Criação de Conta - Pessoa Física");
                        setNome(JOptionPane.showInputDialog("Informe o Nome da Conta: "));
                        setCpf(JOptionPane.showInputDialog("Informe Seu CPF: "));
                        setSenha(JOptionPane.showInputDialog("Informe uma Senha (MÁXIMO DE 8 DIGITOS): "));
                        codigo++;
                        JOptionPane.showMessageDialog(null, "Seu Código de Conta é " + codigo);
                            break;

                        case 2:
                        JOptionPane.showMessageDialog(null, "Criação de Conta - Pessoa Jurídica");
                        setNome(JOptionPane.showInputDialog("Informe o Nome da Conta: "));
                        setCnpj(JOptionPane.showInputDialog("Informe Seu CNPJ: "));
                        setSenha(JOptionPane.showInputDialog("Informe uma Senha (MÁXIMO DE 8 DIGITOS): "));
                        codigo++;
                        JOptionPane.showMessageDialog(null, "Seu Código de Conta é " + codigo);
                    
                        default:
                        JOptionPane.showMessageDialog(null, "Informe uma Ação Válida");
                            break;
                    }
        } else {
            JOptionPane.showMessageDialog(null, "Apenas Maiores de 18 Anos Podem Criar Uma Conta!");

        }

    }

    public void saque() {
        JOptionPane.showMessageDialog(null, "Efetue seu Saque");
        sacar = Integer.parseInt(JOptionPane.showInputDialog("Insira o Valor do Saque (Limite R$2500): "));
        
        if (sacar > 0 || sacar < 2000 || sacar < saldo) {
            saque = saldo - sacar;
            JOptionPane.showMessageDialog(null, "Saque Efetuado!");


        } else {
            JOptionPane.showMessageDialog(null, "Não Foi Possível Efetuar o Saque.");

        }
    }


    public void deposito() {
        JOptionPane.showMessageDialog(null, "Efetue seu Depósito");
        depositar = Integer.parseInt(JOptionPane.showInputDialog("Insira o Valor do Depósito: "));
        
        if (depositar > 0) {
            deposito = saldo + depositar;
            JOptionPane.showMessageDialog(null, "Depósito Efetuado!");


        } else {
            JOptionPane.showMessageDialog(null, "Não Foi Possível Efetuar o Saque.");

        }
    }


    public void emprestimo() {
        JOptionPane.showMessageDialog(null, "Efetue seu Emprestimo");
        emprestado = Integer.parseInt(JOptionPane.showInputDialog("Insira o Valor do Emprestimo (Limite R$5000): "));
        
        if (emprestado > 0 && emprestado < 5000) {
            emprestimo = saldo + emprestado;
            JOptionPane.showMessageDialog(null, "Emprestimo Efetuado!");


        } else {
            JOptionPane.showMessageDialog(null, "Não Foi Possível Efetuar o Emprestimo.");

        }
    }



    public double getSaque() {
        return saque;
    }

    public void setSaque(double saque) {
        this.saque = saque;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public double getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(double emprestimo) {
        this.emprestimo = emprestimo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
