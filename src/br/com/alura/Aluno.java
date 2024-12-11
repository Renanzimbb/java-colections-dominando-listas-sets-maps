package br.com.alura;

public class Aluno {
    
    private String nome;
    private int numeroMatricula;

    public Aluno(String nome, int numeroMatricula) {
        if(nome == null){
            throw new NullPointerException("Nome não pdoe ser null");
        }
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
    }

    public String getNome() {
        return nome;
    }
    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    @Override
    public String toString() {
        return "[Aluno: " + nome + ", Matricula: " + numeroMatricula +"]";
    }

    @Override
    public boolean equals(Object obj) {
       Aluno other = (Aluno) obj;
        return this.nome.equals(other.nome);
    }       

    @Override
    public int hashCode() {
        return this.nome.hashCode();
    }
}
