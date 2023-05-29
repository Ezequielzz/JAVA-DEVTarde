package POOIntroducao;

import CalculadoraDeDescontos.Main;

/**
 * App
 */
public class App {   
    public static void main(String[] args) {
        // criar 3 objetos ResgistraAluno
        RegistraAluno ana = new RegistraAluno();
        RegistraAluno beto = new RegistraAluno();
        RegistraAluno carlos = new RegistraAluno();
        Alunos aluno1 = new Alunos();

        // altera as informações com o set
        ana.setNome("Ana Machado");
        beto.setNome("Roberto da Silva");
        carlos.setNome("Carlos Alberto");

        ana.setEndereco("Laranjeiras, Av.Laranjeiras, Nº123");
        beto.setEndereco("Jardim das Flores, R.Orquídeas, Nº321");
        carlos.setEndereco("Jardim Verde, R.Gramado , Nº213");

        ana.setIdade(19);
        beto.setIdade(20);
        carlos.setIdade(21);

        ana.setNotaMatematica(10);
        beto.setNotaMatematica(9);
        carlos.setNotaMatematica(8);

        ana.setNotaPortugues(8);
        beto.setNotaPortugues(9);
        carlos.setNotaPortugues(10);

        ana.setNotaCiencias(9);
        beto.setNotaCiencias(8);
        carlos.setNotaCiencias(10);

        // printa com as informações
        System.out.println(ana.getNome());
        System.out.println(ana.getEndereco());
        System.out.println(ana.getIdade());
        System.out.println(ana.getMedia());
        System.out.println("Contador: "
                + RegistraAluno.getQuantidadeAlunos());

        System.out.println(beto.getNome());
        System.out.println(beto.getEndereco());
        System.out.println(beto.getIdade());
        System.out.println(beto.getMedia());
        System.out.println("Contador: "
                + RegistraAluno.getQuantidadeAlunos());

        System.out.println(carlos.getNome());
        System.out.println(carlos.getEndereco());
        System.out.println(carlos.getIdade());
        System.out.println(carlos.getMedia());
        System.out.println("Contador: "
                + RegistraAluno.getQuantidadeAlunos());
                System.out.println("======================================");

                Alunos aluno1 = new Alunos();
                aluno1.setNome("Rogério");
                System.out.println(aluno1.getNome());
    }

}
