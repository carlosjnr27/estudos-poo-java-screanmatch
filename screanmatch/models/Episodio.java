package screanmatch.models;

import screanmatch.calculos.Classificavel;

public class Episodio  implements Classificavel{
    private int numero;
    private String nome;
    private Serie serie;
    private int totalVizualizacao;


    public int getTotalVizualizacao() {
        return totalVizualizacao;
    }

    public void setTotalVizualizacao(int totalVizualizacao) {
        this.totalVizualizacao = totalVizualizacao;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return this.serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificacao() {
        if(totalVizualizacao > 100){
            return 4;
        } else {
            return 2;
        }
    }

}
