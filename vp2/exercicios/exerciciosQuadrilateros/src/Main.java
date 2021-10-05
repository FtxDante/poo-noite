import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Quadrilatero quadrilateros[] = new Quadrilatero[5];

        int opcao = (int) Math.random() * 100;

        switch (opcao){
            case 0:
                // Retangulo
                break;
            case 1:
                //Circulo
                break;
            case 2:
                //Quadrado
                break;

        }
    }
}



/*
        Retangulo primeiroRet = new Retangulo(10,5);
        System.out.println(primeiroRet.calcularArea());
        System.out.println(primeiroRet.calcularPerimetro());

        Circulo primeiroCir = new Circulo(10);
        System.out.println(primeiroCir.calcularArea());
        System.out.println(primeiroCir.calcularPerimetro());

        Quadrado primeiroQua = new Quadrado(10);
        System.out.println(primeiroQua.calcularArea());
        System.out.println(primeiroQua.calcularPerimetro());
*/
