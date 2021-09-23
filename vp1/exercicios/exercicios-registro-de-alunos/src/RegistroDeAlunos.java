 class RegistroDeAlunos {

    int matricula;
    double nota1;
    double nota2;
    double notaDeTrabalho;
    double media;
    String nome;

    void media(){
        this.media = (nota1 * 2.5 + nota2 * 2.5 + notaDeTrabalho * 2)/7;
        seFoiAprovado();
    }

    void seFoiAprovado(){

        if(media > 6){
            System.out.println("Aprovado, sua média foi: " + media);
        }else{
            System.out.println("Reprovado  sua média foi: " + media);
        }

    }



}
