import java.util.Scanner;

public class Main {
    private static int[] nome = new int[10];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("1 - Calcular");
            System.out.println("2 - Sair");

            opcao = scanner.nextInt();



        }while(opcao != 2);
    }
}
