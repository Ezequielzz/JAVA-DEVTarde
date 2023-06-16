package POOBanco;

import javax.swing.JOptionPane;

public class Conta extends Pessoa {

    // Declaração de Atributos
    public double saque = 0;
    public double deposito = 0;
    public double emprestimo = 0;
    public String tipoConta;
    public double saldo;
    public String senha;
    public int acao = 0;

    // Método Criação de Conta
    public void criarConta() {
        JOptionPane.showMessageDialog(null, "Criação de Conta");
            acao = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Informe Qual o Tipo da Sua Conta\n 1 - Pessoa Física 2 - Pessoa Jurídica"));

            switch (acao) {
                // Conta PF
                case 1:
                    setNome(JOptionPane.showInputDialog("Criação de Conta - Pessoa Física \n Informe o Nome da Conta: "));
                    setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe sua Idade: ")));
                    if (getIdade() >= 18) {
                    setCpf(JOptionPane.showInputDialog("Criação de Conta - Pessoa Física \n Informe Seu CPF: "));
                    setSenha(JOptionPane.showInputDialog("Criação de Conta - Pessoa Física \n Informe uma Senha: "));
                    setTipoConta("Conta PF");
                        } else {
                            JOptionPane.showMessageDialog(null, "Apenas Maiores de 18 Anos Podem Criar Uma Conta!");
                        }

                    break;

                case 2:
                    // Conta PJ
                    setNome(JOptionPane.showInputDialog("Criação de Conta - Pessoa Jurídica \n Informe o Nome da Conta: "));
                    setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe sua Idade: ")));
                    if (getIdade() >= 18) {
                    setCnpj(JOptionPane.showInputDialog("Criação de Conta - Pessoa Jurídica \n Informe Seu CNPJ: "));
                    setSenha(JOptionPane.showInputDialog("Criação de Conta - Pessoa Jurídica \n Informe uma Senha: "));
                    setTipoConta("Conta PJ");
                     } else {
                            JOptionPane.showMessageDialog(null, "Apenas Maiores de 18 Anos Podem Criar Uma Conta!");
                        }

                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Informe uma Ação Válida.");
                    break;
            }
    }

    // Método de Saque
    public void saque() {
        JOptionPane.showMessageDialog(null, "Efetue seu Saque");
        saque = Integer.parseInt(JOptionPane.showInputDialog("Insira o Valor do Saque (Limite R$2500): "));

        if (saldo < saque || saque > 2500) {
            JOptionPane.showMessageDialog(null, "Não Foi Possivel Efetuar o Saque.");

        } else {
            saldo = saldo - saque;
            JOptionPane.showMessageDialog(null, "Saque Efetuado! \n Saldo Atual: R$" + saldo);

        }
    }

    // Método de Deposito
    public void deposito() {
        JOptionPane.showMessageDialog(null, "Efetue seu Depósito");
        deposito = Integer.parseInt(JOptionPane.showInputDialog("Insira o Valor do Depósito: "));

        if (deposito > 0) {
            saldo = saldo + deposito;
            JOptionPane.showMessageDialog(null, "Depósito Efetuado! \n Saldo Atual: R$" + saldo);

        } else {
            JOptionPane.showMessageDialog(null, "Não Foi Possível Efetuar o Depósito.");

        }
    }

    // Método de Emprestimo
    public void emprestimo() {
        JOptionPane.showMessageDialog(null, "Efetue seu Emprestimo");
        emprestimo = Integer.parseInt(JOptionPane.showInputDialog("Insira o Valor do Emprestimo (Limite R$5000): "));

        if (emprestimo > 0 && emprestimo < 5000) {
            saldo = saldo + emprestimo;
            JOptionPane.showMessageDialog(null, "Emprestimo Efetuado! Saldo Atual: R$" + saldo);

        } else {
            JOptionPane.showMessageDialog(null, "Não Foi Possível Efetuar o Emprestimo.");

        }
    }

    // Getters & Setters
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

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }


}