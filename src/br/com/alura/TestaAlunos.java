package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {
    public static void main(String[] args) {
        Set<String> alunos = new HashSet<>();
        alunos.add("Renan Jose");
        alunos.add("Rodrigo Turini");
        alunos.add("Douglas Silva");
        alunos.add(("Nico Stepat"));
        alunos.add("Maria Gais");
        alunos.add("Daniela Souza");

        for (String aluno : alunos) {
            System.out.println(aluno);            
        }
        
        alunos.forEach(aluno -> {System.out.println(aluno);});

        boolean renanMatriculado = alunos.contains("Renan Jose");
        System.out.println(renanMatriculado);
    }
    
}
