import java.util.Scanner;

public class TesteCirculo {

    private static Circulo[] novosCirculos;
    private static Circulo[] cadastrados = new Circulo[2];

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //Circulos no Sistema
        cadastrados[0] = new Circulo(9);
        cadastrados[1] = new Circulo(3);

        //Inicializa o vetor de circulo.
        System.out.println("Quantos circulos você deseja criar? ");
        int qtdCirculos = leitor.nextInt();
        novosCirculos = new Circulo[qtdCirculos];

        //Modifica os circulos cadastrados
        System.out.println("Existem " + cadastrados.length + " circulos cadastrados");
        System.out.println("Digite -1 para ver e editar os circulos ou 0 para sair");
        int verCirculos = leitor.nextInt();
        if(verCirculos == -1){
            for (int controle = 0; controle < cadastrados.length; controle++){
                informacoesDoCirculo(cadastrados, controle);
                confereCirculo(leitor, cadastrados, controle, "Digite -1 para EDITAR, ou 0 para CONTINUAR.", "Digite o Raio: ");
                informacoesDoCirculo(cadastrados,controle);
                System.out.println("-----------------------------------------------------");
            }
        }
        //Cria novos circulos
        System.out.println("Você agora pode criar os circulos (" + qtdCirculos + ")");
        criaNovoCirculo(leitor,novosCirculos);


    }

    private static void criaNovoCirculo(Scanner leitor, Circulo[] vetorCirculos){
        for (int controle = 0; controle < vetorCirculos.length ; controle ++ ){
            System.out.println("Qual o raio do circulo " + (controle + 1) +"?");
            double raioCirculoEmLoop = leitor.nextDouble();
            vetorCirculos[controle] = new Circulo(raioCirculoEmLoop);

            informacoesDoCirculo(vetorCirculos,controle);
            confereCirculo(leitor,vetorCirculos,controle,"Digite -1 para MODIFICAR esse circulo, ou 0 para CONTINUAR  ", "Digite o raio correto: ");

        }
    }

    private static void confereCirculo(Scanner leitor,Circulo[] vetorCirculos,int controle, String perguntaEditar, String fraseDeEdicao){
        System.out.println(perguntaEditar);
        int editarAnterior = leitor.nextInt();

        if(editarAnterior == -1){
            System.out.println(fraseDeEdicao);
            double raioCorrigido = leitor.nextDouble();
            vetorCirculos[controle].setRaio(raioCorrigido);
        }
    }
    private static void informacoesDoCirculo(Circulo[] vetorCirculos,int controle){
        System.out.println("-----------------------------------------------------");
        System.out.println("Circulo: " + (controle + 1));
        System.out.println("Raio: "+ vetorCirculos[controle].getRaio());
        System.out.println("Diametro: " + vetorCirculos[controle].getDiametro());
        System.out.println("Area: " + vetorCirculos[controle].getArea());
        System.out.println("Perimetro: " + vetorCirculos[controle].getPerimetro());
    }
}

