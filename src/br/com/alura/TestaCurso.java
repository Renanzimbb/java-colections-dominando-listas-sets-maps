package br.com.alura;

import java.util.List;

public class TestaCurso {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do java", "Paulo");

        //javaColecoes.getAulas().add(new Aula("Trabalhando com array list", 22));
        javaColecoes.adiciona(new Aula("Trabalhando com array list", 21));
        javaColecoes.adiciona(new Aula("Criando uma aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 22));
        
        
        
        List<Aula> aula = javaColecoes.getAulas();
        System.out.println(aula);

        //aula.add(new Aula("Trabalhando com array list", 21));
        //System.out.println(aula);
       }

    
}