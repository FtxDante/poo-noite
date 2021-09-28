public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        ContaPoupanca contaPoupanca = new ContaPoupanca();

        contaCorrente.setSaldo(100);
        double rendimentoCC = contaCorrente.rendimento();
        System.out.println(rendimentoCC);

        contaPoupanca.setSaldo(100);
        double rendimentoCP = contaPoupanca.rendimento();
        System.out.printf("%.2f %n",rendimentoCP);
    }
}
