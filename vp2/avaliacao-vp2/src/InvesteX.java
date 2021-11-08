public class InvesteX {
    private final Lci[] lciArray;
    private final Cdb[] cdbArray;
    private final TesouroSelic[] tesouroSelicArray;
    private int qtdLci, qtdCdb, qtdTesouro;

    public InvesteX() {
        lciArray = new Lci[100];
        cdbArray = new Cdb[100];
        tesouroSelicArray = new TesouroSelic[100];
    }

    public void criaInvestimentoLci (String instF, String usuario, double valorA, double taxaAA) {
        lciArray[qtdLci++] = new Lci(instF, usuario, valorA, taxaAA);
    }

    public void criaInvestimentoCdb (String instF, String usuario, double valorA, double taxaAA) {
        cdbArray[qtdCdb++] = new Cdb(instF, usuario, valorA, taxaAA);
    }

    public void criaInvestimentoTesouro (String instF, String usuario, double valorA, double taxaAA) {
        tesouroSelicArray[qtdTesouro++] = new TesouroSelic(instF, usuario, valorA, taxaAA);
    }

    public double somaLucro () {
        double lucroTotal = 0;
        for(Investimento investimento: lciArray) if(investimento != null) lucroTotal += investimento.getLucro();
        for(Investimento investimento: cdbArray) if(investimento != null) lucroTotal += investimento.getLucro();
        for(Investimento investimento: tesouroSelicArray) if(investimento != null) lucroTotal += investimento.getLucro();
        return lucroTotal;
    }

    public double somaValorA () {
        double valorATotal = 0;
        for(Investimento investimento: lciArray) if(investimento != null) valorATotal += investimento.getValorA();
        for(Investimento investimento: cdbArray) if(investimento != null) valorATotal += investimento.getValorA();
        for(Investimento investimento: tesouroSelicArray) if(investimento != null) valorATotal += investimento.getValorA();
        return valorATotal;
    }

    public double calculaPorcentagem (){
        double lucro = somaLucro();
        double valorA = somaValorA();
        System.out.println("Valor Total Aplicado: R$: " + valorA);
        System.out.println("Lucro Total: R$: " + (lucro - valorA));
        System.out.println("Saldo Total: R$: " + lucro);
        if(lucro > valorA ) return ((lucro - valorA ) * 100)/valorA;
        return ((valorA - lucro) * 100)/valorA;
    }

}