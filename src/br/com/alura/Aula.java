package br.com.alura;

public class Aula implements Comparable<Aula>{
    private String titulo;
    private int tempo;

    public Aula(String titulo, int tempo) {
        this.titulo = titulo;
        this.tempo = tempo;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getTempo() {
        return tempo;
    }
    public void setTempo(int tempo) {
        this.tempo = tempo;
    }
    @Override
    public String toString() {
        return "Aula [titulo= " + this.titulo + ", tempo= " + this.tempo + " minutos]";
    }
    
    @Override
    public int compareTo(Aula o) {
        return this.titulo.compareTo(o.titulo);
    }
    
}
