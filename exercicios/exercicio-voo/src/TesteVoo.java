import javax.sound.midi.Soundbank;

public class TesteVoo {
    public static void main(String[] args) {
        Passageiro nomePass = new Passageiro("Dante Rodrigues", "44932321-2",21);
        Passageiro nomePass2 = new Passageiro("Satain Juhen", "3143212-666", 72);
        Passageiro nomePass3 = new Passageiro("Shurima Nasus", "125412-666", 712);
        Passageiro nomePass4 = new Passageiro("Jean Nean", "4525412-666", 12);
        Passageiro nomePass5 = new Passageiro("Emily Stephany", "89277412-666", 22);
        Passageiro nomePass6 = new Passageiro("Juhen Juhen", "657352122-666", 18);
        Passageiro nomePass7 = new Passageiro("Claudia Macielo", "9865125412-666", 20);

        Voo passageiro1 = new Voo(nomePass,"Fortaleza", "Sao Paulo", true);
        Voo passageiro2 = new Voo(nomePass2,"Fortaleza", "Sao Paulo", true);
        Voo passageiro3 = new Voo(nomePass3,"Fortaleza", "Sao Paulo", true);
        Voo passageiro4 = new Voo(nomePass4,"Fortaleza", "Sao Paulo", true);
        Voo passageiro5 = new Voo(nomePass5,"Fortaleza", "Sao Paulo", true);
        Voo passageiro6 = new Voo(nomePass6,"Fortaleza", "Sao Paulo", true);
        Voo passageiro7 = new Voo(nomePass7,"Fortaleza", "Sao Paulo", false);
        System.out.println("Vendidos: "+passageiro1.getBilheteVendidos());
        System.out.println("Abordo: "+passageiro1.getPassageirosAbordo());
        System.out.println("Diferença: "+passageiro1.diferencaPassageirosEBilhetes());
        System.out.println("Nome do Passageiro 7: " + passageiro7.getPassageiroNome());

    }
}
