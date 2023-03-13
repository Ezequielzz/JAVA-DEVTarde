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
        String mes = sc.nextInt();
        switch (mes) {
            case "":
                System.out.println();
                break;
            case "":
                System.out.println();
                break;
            case "":
                System.out.println();
                break;
            case "":
                System.out.println();
                break;
            case "":
                System.out.println();

            default:
                System.out.println();
                break;
        }

}