package NivelIntermediario;

public class Main {
    public static void main(String[] args) {

        // Objeto 1
       Ninja Naruto = new Ninja();
       Naruto.nome = "Naruto Uzumaki";
       Naruto.aldeia = "Aldeia da Folha";
       Naruto.idade = 17;


        // Objeto 2
        Ninja Sasuke = new Ninja();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Aldeia da Folha";
        Sasuke.idade = 18;

        // Objeto 3
        Ninja Sakura = new Ninja();
        Sakura.nome = "Sakura Haruno";
        Sakura.aldeia = "Aldeia da Folha";
        Sakura.idade = 18;

        // Objeto 4
        Ninja Hinata = new Ninja();
        Hinata.nome = "Hinata Hyuga";
        Hinata.aldeia = "Aldeia da Folha";
        Hinata.idade = 16;



        // Aplicando métodos no meu OBJETO
        Sasuke.SharinganAtivado();
        String chamandoMetodo = Sasuke.EuSouUmNinja();
        System.out.println(chamandoMetodo);

        int quantoTempoFalta = Sasuke.anosParaSeTornarHokage(70);
        System.out.println("Você tem: " + Sasuke.idade + " anos então falta no mínimo: " + quantoTempoFalta + " anos.");



    }
}
