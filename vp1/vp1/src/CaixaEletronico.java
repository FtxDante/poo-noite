public class CaixaEletronico {
    private static ContaCorrente[] contas = new ContaCorrente[10];
    private ContaCorrente contaSalva;

    public void abrirContaCorrente(String cpf){
        this.contas[ContaCorrente.getContasCriadas()] = new ContaCorrente(cpf);
    }

    public double sacar(double valor, int numConta){
        this.procurarConta(numConta);
        return contaSalva.sacar(valor);
    }

    public void depositar(double valor, int numConta){
        this.procurarConta(numConta);
        this.contaSalva.depositar(valor);
    }

    public void transferir(double valor, int contaTransfere, int contaRecebe){
        this.procurarConta(contaTransfere);
        double valorTransferente = contaSalva.sacar(valor);
        this.procurarConta(contaRecebe);
        this.contaSalva.depositar(valorTransferente);
    }

    public void visualizar(int numConta){
        this.procurarConta(numConta);
        System.out.println("Número da Conta: " + contaSalva.getNumConta());
        System.out.println("CPF: " + contaSalva.getCpf());
        System.out.println("Saldo: " + contaSalva.getSaldo());
    }

    public void procurarConta(int numConta){
        for(int contador = 0; contador < this.contas.length; contador++){
            if(this.contas[contador].getNumConta() == numConta) {
                this.contaSalva = this.contas[contador];
                break;
            }
        }
    }

}
