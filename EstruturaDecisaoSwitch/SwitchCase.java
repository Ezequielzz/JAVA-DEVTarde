package EstruturaDecisaoSwitch;

import java.util.Scanner;

public class SwitchCase {
    Scanner sc = new Scanner(System.in);

    public void letra() {
        System.out.println("Digite uma letra:");
        String letra = sc.nextLine();
        switch (letra) {
            case "a":
                System.out.println(letra + " é uma vogal.");
                break;
            case "e":
                System.out.println(letra + " é uma vogal");
                break;
            case "i":
                System.out.println(letra + " é uma vogal");
                break;
            case "o":
                System.out.println(letra + " é uma vogal");
                break;
            case "u":
                System.out.println(letra + " é uma vogal");

            default:
                System.out.println(letra + "é uma consoante");
                break;
        }
    }

    public void mes() {
        System.out.println("Digite o número do mês");
        String mes = sc.next();
        switch (mes) {
            case "1":
                System.out.println(mes + "é Janeiro");
                break;
            case "2":
                System.out.println(mes + "é Fevereiro");
                break;
            case "3":
                System.out.println(mes + "é Março");
                break;
            case "4":
                System.out.println(mes + "é Abril");
                break;
            case "5":
                System.out.println(mes + "é Maio");
            case "6":
                System.out.println(mes + "é Junho");
                break;
            case "7":
                System.out.println(mes + "é Julho");
                break;
            case "8":
                System.out.println(mes + "é Agosto");
                break;
            case "9":
                System.out.println(mes + "é Setembro");
                break;
            case "10":
                System.out.println(mes + "é Outubro");
                break;
            case "11":
                System.out.println(mes + "é Novembro");
                break;
            case "12":
                System.out.println(mes + "é Dezembro");

            default:
                break;
        }

}

}