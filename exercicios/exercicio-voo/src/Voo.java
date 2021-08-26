public class Voo {
    private Passageiro passageiro;
    private final String origem;
    private final String destino;
    private static int bilheteVendidos;
    private static int passageirosAbordo;
    // Construtor
    public Voo(){} 
    public Voo(Passageiro passageiro, String origem, String destino, Boolean seChegou){
        if(seChegou){
            passageiroEntrou();
        }
        this.passageiro = passageiro;
        this.origem = origem;
        this.destino = destino;
        bilheteVendidos++;
    }

    // Metodo para subtrair os passageiros abordo e os bilhetes vendidos
    public int diferencaPassageirosEBilhetes(){
        return getPassageirosAbordo() - getBilheteVendidos();
    }
    // Adiciona um passageiro no avião
    private void passageiroEntrou(){
        passageirosAbordo++;
    }

    public String getPassageiroNome() {
        return passageiro.nome;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }

    public static int getBilheteVendidos() {
        return bilheteVendidos;
    }

    public static void setBilheteVendidos(int bilheteVendidos) {
        Voo.bilheteVendidos = bilheteVendidos;
    }

    public static int getPassageirosAbordo() {
        return passageirosAbordo;
    }

    public static void setPassageirosAbordo(int passageirosAbordo) {
        Voo.passageirosAbordo = passageirosAbordo;
    }
}
