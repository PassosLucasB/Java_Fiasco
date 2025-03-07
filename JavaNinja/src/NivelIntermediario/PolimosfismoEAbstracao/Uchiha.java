package NivelIntermediario.PolimosfismoEAbstracao;

public class Uchiha extends Ninja {


    //Sobreescrever o método da classe Ninja
    @Override
    public void habilidadeEspecial(){
        System.out.println("Meu nome é " + nome + " e esse é meu ataque Uchiha");
    }
}
