package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {
    private String nome;
    private String instrutor;
    private List<Aula> aulas = new ArrayList<>();
    private Set<Aluno> alunos = new HashSet<>();
    private Map<Integer, Aluno> matriculaPorAluno = new HashMap<>();
    
    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }
    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getInstrutor() {
        return instrutor;
    }
    public void setInstrutor(String instrutor) {
        this.instrutor = instrutor;
    }
    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }
    public void adiciona(Aula aula) {
        this.aulas.add(aula);
    }

    public int getTotal(){
        return this.aulas.stream().mapToInt(Aula::getTempo).sum();
        // int tempoTotal = 0;
        // for (Aula aula: aulas){
        //     tempoTotal += aula.getTempo();
        // }
        //         return tempoTotal;                     
    }
    @Override
    public String toString() {
        return "Curso [nome= " + nome + ", instrutor= " + instrutor + ", aulas= " + aulas + ", getTotal()= " + getTotal()
                + "]";
    }
    public void matricula(Aluno aluno) {
       this.alunos.add(aluno);
       this.matriculaPorAluno.put(aluno.getNumeroMatricula(), aluno);
    }
    public boolean estaMatriculado(Aluno aluno) {
        return this.alunos.contains(aluno);
    }
    public Aluno buscaMatriculado(int matricula) {
        return matriculaPorAluno.get(matricula);
    }   
}