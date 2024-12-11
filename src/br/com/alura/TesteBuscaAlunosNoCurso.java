package br.com.alura;

public class TesteBuscaAlunosNoCurso {

    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do java", "Paulo");

         
        javaColecoes.adiciona(new Aula("Trabalhando com array list", 21));
        javaColecoes.adiciona(new Aula("Criando uma aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 22));

        Aluno a1 = new Aluno("Douglas", 2323232);
        Aluno a2 = new Aluno("Daniel", 232323);
        Aluno a3 = new Aluno("Maria", 2332);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        var test = javaColecoes.buscaMatriculado(2332);
        System.out.println(test);
    }
}