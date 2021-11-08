import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InvesteX investeX = new InvesteX();
        System.out.println("Seja bem vindo (a)!");
        System.out.println("Qual o seu nome?");
        String nome = scanner.nextLine();
        System.out.println("Qual a sua Instituição Financeira?");
        String instF = scanner.nextLine();
        mostraOpcoes();
        int opcao;
        do {
            System.out.println("Selecione uma opção: ");
            opcao = scanner.nextInt();
            switch(opcao) {
                case 1:
                  //Tesouro
                    iniciarInvestimento("tesouro", investeX, instF, nome, scanner);
                    break;
                case 2:
                  //Lci
                    iniciarInvestimento("lci", investeX, instF, nome, scanner);
                    break;
                case 3:
                    //Cdb
                    iniciarInvestimento("cdb", investeX, instF, nome, scanner);
                    break;
                case 4:
                  //porcentagem
                    double porcentagem = investeX.calculaPorcentagem();
                    System.out.println("Seu lucro foi de: " + porcentagem + "%");
                    break;
                case 5:
                  // Trocar seu nome
                    System.out.println("Digite seu nome: ");
                    nome = scanner.nextLine();
                    System.out.println("Novo nome: " + nome);
                    break;
                case 6:
                  // Trocar Instituição Financeira
                    System.out.println("Digite sua Instituição Financeira");
                    instF = scanner.nextLine();
                    System.out.println("Nova Instituição Financeira: " + instF);
                    break;
                case 7:
                  // Mostrar opcoes
                    mostraOpcoes();
                    break;
                case 0:
                  // Sair
                    System.out.println("Até Mais!");
                    break;
                default:
                    System.out.println("Opcao Invalida!");
                    mostraOpcoes();
            }
        } while (opcao != 0);
    }

    public static void mostraOpcoes() {
        System.out.println("1 - Investir no Tesouro");
        System.out.println("2 - Investir no Lci");
        System.out.println("3 - Investir no Cdb");
        System.out.println("4 - Calcular porcentagem de lucro");
        System.out.println("5 - Trocar seu nome");
        System.out.println("6 - Trocar Instituição Financeira");
        System.out.println("7 - Mostrar opções");
        System.out.println("0 - Para sair");
    }

    public static void iniciarInvestimento(String tipoInvest, InvesteX investeX, String instF, String nome, Scanner scanner) {
        System.out.println("Digite o valor a ser investido");
        double valorA = scanner.nextDouble();
        System.out.println("Digite a Taxa Anual: ");
        double taxaAA = scanner.nextDouble();
        if(tipoInvest == "tesouro") investeX.criaInvestimentoTesouro(instF, nome, valorA, taxaAA);
        if(tipoInvest == "cdb") investeX.criaInvestimentoCdb(instF, nome, valorA, taxaAA);
        if(tipoInvest == "lci") investeX.criaInvestimentoLci(instF, nome, valorA, taxaAA);
        System.out.println("Você investiu: R$: " + valorA);
    }
}
