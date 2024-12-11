package br.com.alura;

import java.util.Iterator;
import java.util.Set;
 

public class TestaCursoComAluno {
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

        System.out.println("Todos os alunos matriculados: ");
        javaColecoes.getAlunos().forEach(aluno -> {
            System.out.println(aluno);
        });

        System.out.println("O aluno " + a1 + " está matriculado?");
        System.out.println(javaColecoes.estaMatriculado(a1));

        Aluno testeHash = new Aluno("Douglas", 2323232);
        System.out.println(javaColecoes.estaMatriculado(testeHash));
        System.out.println(a1.hashCode() == testeHash.hashCode());

        Set<Aluno> alunos = javaColecoes.getAlunos();
        Iterator<Aluno> iterator = alunos.iterator();
        while(iterator.hasNext()){
            Aluno proximo = iterator.next();
            System.out.println(proximo);
        }

    }      
            
}
