public class ContaCorrente {
    private static int contasCriadas;
    private final int numConta;
    private final String cpf;
    private double saldo;

    ContaCorrente(String cpf){
        ContaCorrente.contasCriadas++;
        this.numConta = contasCriadas;
        this.cpf = cpf;
    }

    public double sacar(double valor){
        if(valor > saldo) {
            return 0;
        }else{
            this.saldo -= valor;
            return valor;
        }
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public String getCpf() {
        return cpf;
    }

    public int getNumConta() {
        return numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public static int getContasCriadas() {
        return contasCriadas;
    }
}
