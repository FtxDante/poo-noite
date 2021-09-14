import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CaixaEletronico caixa1 = new CaixaEletronico();
        System.out.println("BEM VINDO(A)!");
        mostraOpcoes();
        int opcao;
        do{
            System.out.print("SELECIONE UMA OPÇÃO: ");
            opcao = scanner.nextInt();
            switch (opcao){
                case 1:
                    //Abrir Conta
                    System.out.print("DIGITE SEU CPF: ");
                    String cpf = scanner.next();
                    caixa1.abrirContaCorrente(cpf);
                    caixa1.visualizar(ContaCorrente.getContasCriadas());
                    break;
                case 2:
                    //Realizar deposito
                    realizaDeposito(scanner, caixa1);
                    break;
                case 3:
                    //Realizar saque
                    realizaSaque(scanner, caixa1);
                    break;
                case 4:
                    //Realizar transferencia
                    realizaTransferencia(scanner, caixa1);
                    break;
                case 5:
                    //consultar informações
                    realizaVisualizacao(scanner, caixa1);
                    break;
                case 6:
                    //Mostra opcoes
                    mostraOpcoes();
                    break;
                case 0:
                    //Para processo
                    break;
                default: mostraOpcoes();

            }
        } while (opcao != 0);


    }
    public static void mostraOpcoes(){
        System.out.println("1 - Abrir conta corrente");
        System.out.println("2 - Realizar depósito");
        System.out.println("3 - Realizar saque");
        System.out.println("4 - Realizar transferência");
        System.out.println("5 - Consultar informações de conta");
        System.out.println("6 - Mostrar opções");
        System.out.println("0 - Para sair");
    }

    public static void realizaDeposito(Scanner scanner, CaixaEletronico caixa1){
        System.out.print("DIGITE A CONTA PARA DEPÓSITO: ");
            int numConta = scanner.nextInt();
            caixa1.visualizar(numConta);

        System.out.print("DIGITE O VALOR DE DEPÓSITO: ");
            double valor = scanner.nextDouble();
            caixa1.depositar(valor, numConta);
            caixa1.visualizar(numConta);
    }

    public static void realizaSaque(Scanner scanner, CaixaEletronico caixa1){
        System.out.print("DIGITE A CONTA PARA SAQUE: ");
            int numConta = scanner.nextInt();
            caixa1.visualizar(numConta);

        System.out.print("DIGITE O VALOR DE SAQUE: ");
            double valor = scanner.nextDouble();
            caixa1.sacar(valor, numConta);
            caixa1.visualizar(numConta);
    }

    public static void realizaTransferencia(Scanner scanner, CaixaEletronico caixa1){
        System.out.print("DIGITE A CONTA QUE VAI TRANSFERIR: ");
            int numConta = scanner.nextInt();
            caixa1.visualizar(numConta);

        System.out.print("DIGITE A CONTA QUE VAI RECEBER: ");
            int numConta2 = scanner.nextInt();
            caixa1.visualizar(numConta2);

        System.out.print("DIGITE O VALOR QUE DESEJA TRANSFERIR: ");
            double valor = scanner.nextDouble();
            caixa1.transferir(valor, numConta, numConta2);
            caixa1.visualizar(numConta);
    }

    public static void realizaVisualizacao(Scanner scanner, CaixaEletronico caixa1){
        System.out.print("DIGITE A CONTA QUE VOCÊ QUER VER: ");
        int numConta = scanner.nextInt();
        caixa1.visualizar(numConta);
    }

}
