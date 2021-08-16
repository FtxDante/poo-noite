public class Data {

    private int dia;
    private int mes;
    private int ano;

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

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    /*
    int peso;

    void alterarPeso(int peso){
        if(peso < 0 || peso > 1111223210){
            System.out.println("Erro: pesso inválido");
        }else{
            this.peso = peso;
        }
    }
    */

}
