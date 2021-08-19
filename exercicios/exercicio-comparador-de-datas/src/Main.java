public class Main {
    public static void main(String[] args) {
        ComparadorData teste1 = new ComparadorData();
        teste1.setAno(2021);
        teste1.setDia(16);
        teste1.setMes(8);

        System.out.println(teste1.comparaDatas(17, 8, 2021));

    }
}
