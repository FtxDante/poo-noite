public class Elevador {
    private int andarAtual;
    private final int totalDeAndares; //Desconsiderando o térreo
    private final int capacidadeDoElevador; //Em pessoas
    private int pessoasPresentes;

    Elevador(int totalDeAndares, int capacidadeDoElevador){
        andarAtual = 0;
        pessoasPresentes = 0;
        this.totalDeAndares = totalDeAndares;
        this.capacidadeDoElevador = capacidadeDoElevador;
    }

    public void entrar(){
        if(pessoasPresentes < capacidadeDoElevador){
            pessoasPresentes++;
            System.out.println("Pessoas:" + pessoasPresentes);
        }else{
            System.out.println("Elevador Lotado");
        }
    }

    public void sair(){
        if(pessoasPresentes > 0){
            pessoasPresentes--;
            System.out.println("Pessoas:" + pessoasPresentes + "Andar: " + andarAtual);
        }else{
            System.out.println("Ninguém está aqui.");
        }
    }

    public void sobe(){
        if(andarAtual < totalDeAndares){
            andarAtual++;
            System.out.println("Pessoas:" + pessoasPresentes + "Andar: " + andarAtual);
        }else{
            System.out.println("Você já está no último andar");
        }
    }

    public void desce(){
        if(andarAtual != 0){
            andarAtual--;
            System.out.println("Pessoas:" + pessoasPresentes + "Andar: " + andarAtual);
        }else{
            System.out.println("Não há mais andares abaixo");
        }
    }

    public void status(){
        System.out.println("Andar: " + andarAtual);
        System.out.println("Quantidade de pessoas: " + pessoasPresentes);
    }

}
