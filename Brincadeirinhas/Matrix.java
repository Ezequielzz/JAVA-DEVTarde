package Brincadeirinhas;

import java.util.Random;

public class Matrix {
    public static void main(String[] args) {
        // Definindo os caracteres que podem aparecer na tela
        String characters = "abcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*()_+-=[]\\{}|;':\",./<>?";

        // Definindo o tamanho da tela
        int screen_width = 90;
        int screen_height = 40;

        // Iniciando o loop for para repetir o código 500 vezes
        for (int i = 0; i < 10000; i++) {
            // Iniciando o loop while para imprimir a tela
            while (true) {
                // Criando uma string vazia para a linha atual da tela
                String line = "";

                // Adicionando caracteres aleatórios à linha
                Random rand = new Random();
                for (int j = 0; j < screen_width; j++) {
                    line += characters.charAt(rand.nextInt(characters.length()));
                }

                // Imprimindo a linha na tela
                System.out.println(line);

                // Verificando se a tela está cheia e saindo do loop se estiver
                screen_height--;
                if (screen_height == 0) {
                    break;
                }
            }

            // Reiniciando a altura da tela para imprimir outra vez
            screen_height = 40;
        }
    }
}
