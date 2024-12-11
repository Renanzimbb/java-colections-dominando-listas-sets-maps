package br.com.alura;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
        public static void main(String[] args) {
            String aula1 = "Conhecendo mais de listas";
            String aula2 = "Modelando a Classe aula";
            String aula3 = "Trabalhando com Cursos e Sets";

            ArrayList<String> aulas = new ArrayList<>();
            aulas.add(aula1);
            aulas.add(aula2);
            aulas.add(aula3);

            aulas.remove(aula1);
            
            // for (String aula : aulas) {
            //     System.out.println(aula);
            // }

            aulas.forEach(aula -> {System.out.println("percorrendo :" + aula);});

            Collections.sort(aulas);
        }
}