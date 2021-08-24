public class Voo {
    private Passageiro passageiro;
    private final String origem;
    private final String destino;
    private static int bilheteVendidos;
    private static int passageirosAbordo;

    public String getPassageiroNome() {
        return passageiro.nome;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public Voo(Passageiro passageiro, String origem, String destino, Boolean entrou){
        if(entrou){
            passageiroEntrou();
        }
        this.passageiro = passageiro;
        this.origem = origem;
        this.destino = destino;
        bilheteVendidos++;
    }

    public int diferencaPassageirosEBilhetes(){
        return getPassageirosAbordo() - getBilheteVendidos();
    }

    private void passageiroEntrou(){
        passageirosAbordo++;
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
