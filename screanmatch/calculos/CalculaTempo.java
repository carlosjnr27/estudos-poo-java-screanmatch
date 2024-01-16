package screanmatch.calculos;

import screanmatch.models.Titulo;

public class CalculaTempo {
    private int tempoTotal = 0;

    public void inclui(Titulo t) {
        tempoTotal += t.getDuracaoEmMinutos();
    }

    public int getTempoTotal() {
        return tempoTotal;
    }

}
