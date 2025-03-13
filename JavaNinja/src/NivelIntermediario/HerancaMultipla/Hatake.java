package NivelIntermediario.HerancaMultipla;

public class Hatake extends Ninja implements SharinganInterface, AnbuInterface, HokageInterface{

    public void boasVindas(){
        System.out.println(nome + ": Eu sou um Hatake");
    }

    // E sse metodo vem direto da interface
    public void sharinganAtivado () {
        System.out.println(nome + ": Ativou o Sharingan");
    }

    //
    public void ninjaDeElite() {
        System.out.println(nome+ ": Eu sou um ninja de elite da Anbu");
    }

    //
    public void hokageAtivo() {
        System.out.println(nome+ ": Eu sou um Hokage");
    }
}
