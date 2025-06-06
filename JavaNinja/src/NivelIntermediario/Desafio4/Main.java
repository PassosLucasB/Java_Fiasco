package NivelIntermediario.Desafio4;

public class Main {

    public static void main(String[] args) {

        NinjaBasico Naruto = new NinjaBasico("Naruto", "Clone das Sombras", 16);
        Naruto.mostrarInformacoes();
        Naruto.executarHabilidade();

        NinjaAvancado Kakashi = new NinjaAvancado("Kakashi", "Chidori", 20, "Chidori");
        Kakashi.mostrarInformacoes();
        Kakashi.executarHabilidade();
    }
}
