import org.w3c.dom.ls.LSOutput;

public class ComparadorData {
    //Atributos
    private int dia;
    private int mes;
    private int ano;

    public ComparadorData(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    //Métodos
    //Teste1: Se o ano for maior o algoritmo escreve  1.
    //Teste2: Se o ano e o mês forem maior o algoritmo escreve  1.
    //Teste3: Se o ano, mês e o dia forem maior o algoritmo escreve  1.

    //TesteDeIgualdade: Se o ano, mês e dia forem igual o algoritmo escreve  0.

    //Confirmação de Menoridade: Se for diferente disso significa que são menores então o algoritmo escreve -1

    //Setters

    public int comparaDatas(ComparadorData data){
       if(data.ano > this.ano || data.mes > this.mes || data.dia > this.dia){
           return 1;
       }else if(data.ano < this.ano || data.mes < this.mes || data.dia < this.dia){
           return -1;
       }else{
           return 0;
       }
    }

    public int frasePadrao(int n){
        return n;
    }


}
