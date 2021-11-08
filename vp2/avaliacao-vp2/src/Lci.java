public class Lci extends Investimento {

    public Lci (String instF, String usuario, double valorA, double taxaAA) {
        super(instF, usuario, valorA, taxaAA);
        calculaLucro(false);
    }

}
