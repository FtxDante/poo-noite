public class ComparadorData {
    //Atributos
    private int dia;
    private int mes;
    private int ano;

    //Métodos
    //Teste1: Se o ano for maior o algoritmo escreve  1.
    //Teste2: Se o ano e o mês forem maior o algoritmo escreve  1.
    //Teste3: Se o ano, mês e o dia forem maior o algoritmo escreve  1.

    //TesteDeIgualdade: Se o ano, mês e dia forem igual o algoritmo escreve  0.

    //Confirmação de Menoridade: Se for diferente disso significa que são menores então o algoritmo escreve -1

    //Setters
    public void setDia(int dia){
        if(dia > 31 || dia < 1){
            System.out.println("Erro: Dia inválido");
        }else{
            this.dia = dia;
        }
    }

    public void setMes(int mes){
        if(mes >12 || mes <1){
            System.out.println("Erro: Mês inválido");
        }else{
            this.mes = mes;
        }
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    //Getters
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }
}
