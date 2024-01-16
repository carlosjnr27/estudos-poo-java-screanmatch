package screanmatch.calculos;

public class FiltroRecomendacao {

    public void filtra(Classificavel classificavel){
        if(classificavel.getClassificacao() >= 4){
            System.out.println("Esta entre os mais assistidos no momento");
        } else if(classificavel.getClassificacao() >= 2) {
            System.out.println("Bem recomendado!");
        } else {
            System.out.println("Assista mais tarde!");
        }
    }
}
