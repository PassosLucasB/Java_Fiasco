package NivelIntermediario.Desafio4;

public class NinjaAvancado extends NinjaBasico implements Ninja{

    String especialidade;

    public NinjaAvancado(String nome, String habilidade, int idade, String especialidade){
        super(nome, habilidade, idade);
        this.especialidade =  especialidade;
    }

    @Override
    public void mostrarInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Especialidade: " + especialidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Executar habilidade " + habilidade);

    }


}
