package screanmatch.models;

import screanmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel{
    private String diretor;

    public String getDiretor() {
        return this.diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    };
}
