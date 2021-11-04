public class Main {
    public static void main(String[] args) {
        TesouroSelic tesouro1 = new TesouroSelic("Caixa", 200, 0.9
        );
        Lci lci1 = new Lci("C6 Bank", 200, 0.9);
        Cdb cdb1 = new Cdb("Inter", 200, 0.9);

        System.out.println("Lucro de R$: " + tesouro1.getLucro() + " Tesouro Selic");
        System.out.println("Lucro de R$: " + lci1.getLucro() + " LCI");
        System.out.println("Lucro de R$: " + cdb1.getLucro() + " CDB");
    }
}
