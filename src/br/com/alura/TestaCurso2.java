package br.com.alura;

import java.util.ArrayList;
import java.util.List;

public class TestaCurso2 {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do java", "Paulo");

        //javaColecoes.getAulas().add(new Aula("Trabalhando com array list", 22));
        javaColecoes.adiciona(new Aula("Trabalhando com array list", 21));
        javaColecoes.adiciona(new Aula("Criando uma aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 22));
            
        List<Aula> aulaImutaveis = javaColecoes.getAulas();
        System.out.println(aulaImutaveis);

        List<Aula> aulas = new ArrayList<>(aulaImutaveis);
        int tempo = javaColecoes.getTotal();
        System.out.println(javaColecoes);
 
       }

    
}