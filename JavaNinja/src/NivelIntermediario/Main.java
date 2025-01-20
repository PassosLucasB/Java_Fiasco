package NivelIntermediario;

public class Main {
    public static void main(String[] args) {

        // Criar o ninja Naruto - Naruto é um OBJETO
       Ninja Naruto = new Ninja();
       Naruto.nome = "Naruto Uzumaki";
       Naruto.aldeia = "Aldeia da Folha";
       Naruto.idade = 17;


        // Criar ninja Sasuke Uchiha - Sasuke é um OBJETO
        Ninja Sasuke = new Ninja();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Aldeia da Folha";
        Sasuke.idade = 18;

        // Aplicando métodos no meu OBJETO
        Sasuke.SharinganAtivado();
        Sasuke.EuSouUmNinja();


        // Criar Sakura Haruno
        Ninja Sakura = new Ninja();
        Sakura.nome = "Sakura Haruno";
        Sakura.aldeia = "Aldeia da Folha";
        Sakura.idade = 18;


    }
}
