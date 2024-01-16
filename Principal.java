import screanmatch.calculos.CalculaTempo;
import screanmatch.calculos.FiltroRecomendacao;
import screanmatch.models.Episodio;
import screanmatch.models.Filme;
import screanmatch.models.Serie;

public class Principal {
    public static void main(String[] args) {
        CalculaTempo calculaTempo = new CalculaTempo();
        Serie minhaSerie = new Serie();
        minhaSerie.setNome("The Walking Dead");
        minhaSerie.setAnoDeLancamento(2010);
        minhaSerie.setEpisodiosPorTemporada(15);
        minhaSerie.setMinutosPorEpisodios(45);
        minhaSerie.setTemporadas(9);

        minhaSerie.avaliar(10);
        minhaSerie.exibeFichaTecnica();

        Filme meuFilme = new Filme();
        meuFilme.setNome("O Rei Leão");
        meuFilme.setAnoDeLancamento(1992);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.avaliar(6);
        meuFilme.avaliar(9);
        meuFilme.exibeFichaTecnica();

        calculaTempo.inclui(meuFilme);
        calculaTempo.inclui(minhaSerie);
        System.out.println(calculaTempo.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(2);
        episodio.setSerie(minhaSerie);
        episodio.setTotalVizualizacao(500);

        filtro.filtra(episodio);
    }
}
